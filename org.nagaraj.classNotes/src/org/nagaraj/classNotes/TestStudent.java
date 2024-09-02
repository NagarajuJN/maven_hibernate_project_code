package org.nagaraj.classNotes;

public class TestStudent {

	public static void main(String[] args) {
		StudentJavaBeanDEmo st = new StudentJavaBeanDEmo();
		st.setId(1);
		st.setName("Nagaraj");
		st.setAddress("Bangalore");
		System.out.println(st.getId());
		System.out.println(st.getName());
		System.out.println(st.getAddress());

	}

}
