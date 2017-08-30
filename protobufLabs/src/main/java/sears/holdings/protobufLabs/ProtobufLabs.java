package sears.holdings.protobufLabs;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.protobuf.InvalidProtocolBufferException;
import sears.holdings.protocol.buffers.HackerStudentOuterClass;
import sears.holdings.protocol.buffers.StudentOuterClass.*;

/**
 * Hello world!
 *
 */
public class ProtobufLabs {
	public static final String BREAKER = "__________________________________________________________";
	
	public static void main1(String[] args){
		System.out.println("Welcome to protoocol buffers");
	}

	public static void main(String[] args) {

		// lets build a student object
		Student mo3pheus = Student.newBuilder().setName("Morpheus").setAddress("Operating Deck Nebuchadnezzar").build();
		System.out.println(mo3pheus.toString());
		System.out.println(BREAKER);

		// lets define a books owned by Sanket
		Student.Book kaneAndAbel = Student.Book.newBuilder().setBookName("Kane And Abel").setAuthor("Jeffrey Archer").build();
		Student.Book codeComplete = Student.Book.newBuilder().setBookName("Code complete").setAuthor("Steve McConnel").build();
		Student.Book[] booksOwned = { kaneAndAbel, codeComplete };

		// morpheus starts to learn
		Student mo3pheus1 = Student.newBuilder().setName("Morpheus").setAddress("Operating Deck Nebuchadnezzar")
				.addAllBooksOwned(Arrays.asList(booksOwned)).build();
		System.out.println(mo3pheus1.toString());
		System.out.println(BREAKER);

		// adding checkouts
		Student.CheckOut book1Checkout = Student.CheckOut.newBuilder().setStudentName("Morpheus").setBookName("Kane and Abel")
				.setDueDate(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(2)).build();
		Student.CheckOut book2Checkout = Student.CheckOut.newBuilder().setStudentName("Morpheus").setBookName("codeComplete")
				.setDueDate(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(4)).build();
		Student.CheckOut[] booksCheckedOut = { book1Checkout, book2Checkout };

		// with maps
		Student mo3pheus2 = Student.newBuilder().setName("Morpheus").setAddress("Operating Deck Nebuchadnezzar")
				.putBooksDue("Kane And Abel", System.currentTimeMillis())
				.putBooksDue("Hack the Matrix", System.currentTimeMillis() + TimeUnit.DAYS.toMillis(2)).build();
		System.out.println(mo3pheus2.toString());
		System.out.println(BREAKER);

		System.out.println("Lets look at a Json representation.");
		String secretsOfMorpheus = getJSonFromProject(codeComplete);
		System.out.println(secretsOfMorpheus);

		System.out.println(BREAKER);
		System.out.println("Lets get it back from the string");
		Student.Book bookOfSecrets = getProjectFromJSONString(secretsOfMorpheus);
		System.out.println(bookOfSecrets.toString());

		// parsing
		System.out.println(BREAKER);
		System.out.println("Parsing back and forth");
		byte[] morphByteArr1 = mo3pheus2.toByteArray();

		try {
			Student morph34 = Student.parseFrom(morphByteArr1);
			System.out.println(morph34.toString());
		} catch (InvalidProtocolBufferException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// parsing
		System.out.println(BREAKER);
		System.out.println("But protobufs aren't secure");
		byte[] morphByteArr12 = mo3pheus2.toByteArray();

		try {
			HackerStudentOuterClass.HackerStudent morph34 = HackerStudentOuterClass.HackerStudent.parseFrom(morphByteArr12);
			System.out.println(morph34.toString());
		} catch (InvalidProtocolBufferException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Student.Book getProjectFromJSONString(String jsonString) {
		Student.Book localProject = null;
		try {
			Gson gson = new Gson();
			localProject = (Student.Book) gson.fromJson(jsonString, Student.Book.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return localProject;
	}

	public static String getJSonFromProject(Student.Book projObject) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(projObject);
	}
}
