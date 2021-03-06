package doublelinkedlist;

import doublelinkedlist.DoubleLinkedList.Entry;
import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class DoubleLinkedList_removeI1 extends TestJPF {

	@Test
	public void test_removeI1() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_4 = new Entry();
		Entry prev_5 = next_4;
		Entry this_header_112 = obj.header;
		obj.size = 1;
		int index = 0;
		Object ele_3 = null;
		Object ele_6 = null;
		obj.modCount = 0;
		obj.header.element = ele_3;
		obj.header.next = next_4;
		obj.header.previous = prev_5;
		next_4.element = ele_6;
		next_4.next = obj.header;
		next_4.previous = this_header_112;
		obj.removeI(index);
	}

}

