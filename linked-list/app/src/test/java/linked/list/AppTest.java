/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void emptyList() {
        LinkedList testList = new LinkedList();
        assertEquals( "" , testList.toString() );
        assertEquals( null , testList.head );
    }

    @Test void propertyList() {
        LinkedList testList = new LinkedList();
        testList.insert(3);
        testList.insert(2);
        testList.insert(8);
        String resultString = "{ 8 } -> { 2 } -> { 3 } -> NULL";

        assertEquals( resultString , testList.toString() );
        /* ----   OR    ---- */
        assertEquals( 2 , testList.head.next.value );
        assertEquals( 3 , testList.head.next.next.value );
        assertEquals( null , testList.head.next.next.next );
    }

    @Test void propertyHead() {
        LinkedList testList1 = new LinkedList();
        testList1.insert(0);
        testList1.insert(2);
        testList1.insert(15);
        LinkedList testList2 = new LinkedList();
        testList2.insert(3);
        testList2.insert(2);
        testList2.insert(8);
        LinkedList testList3 = new LinkedList();
        testList3.insert(1);
        testList3.insert(9);
        testList3.insert(10);

        assertEquals( 15 , testList1.head.value );
        assertEquals( 8 , testList2.head.value );
        assertEquals( 10 , testList3.head.value );
    }

    @Test void multipleNode() {
        LinkedList testList = new LinkedList();
        testList.insert(15);
        testList.insert(70);
        testList.insert(90);
        String resultString = "{ 90 } -> { 70 } -> { 15 } -> NULL";
        assertEquals( resultString , testList.toString() );
    }

    @Test void includesTest() {
        LinkedList testList = new LinkedList();
        testList.insert(15);
        assertEquals( true , testList.includes(15) );
        assertEquals( false , testList.includes(6) );
    }

    @Test void returnCollection () {
        LinkedList testList = new LinkedList();
        testList.insert(1);
        testList.insert(0);
        testList.insert(9);
        String resultString = "{ 9 } -> { 0 } -> { 1 } -> NULL";
        assertEquals( resultString , testList.toString() );
    }

    @Test void appendTest () {
        LinkedList testList = new LinkedList();
        testList.insert(1);
        testList.insert(0);
        testList.insert(9);
        testList.append(6);
        String resultString = "{ 9 } -> { 0 } -> { 1 } -> { 6 } -> NULL";
        assertEquals( resultString , testList.toString() );
    }

    @Test void appendMultiTest () {
        LinkedList testList = new LinkedList();
        testList.insert(1);
        testList.insert(0);
        testList.insert(9);
        testList.append(6);
        testList.append(7);
        testList.append(8);
        String resultString = "{ 9 } -> { 0 } -> { 1 } -> { 6 } -> { 7 } -> { 8 } -> NULL";
        assertEquals( resultString , testList.toString() );
    }

    @Test void beforeMiddleTest () {
        LinkedList testList = new LinkedList();
        testList.append(6);
        testList.append(7);
        testList.append(8);
        testList.insertBefore(7,10);
        String resultString = "{ 6 } -> { 10 } -> { 7 } -> { 8 } -> NULL";
        assertEquals( resultString , testList.toString() );
    }

    @Test void beforeFirstTest () {
        LinkedList testList = new LinkedList();
        testList.append(6);
        testList.append(7);
        testList.append(8);
        testList.insertBefore(6,10);
        String resultString = "{ 10 } -> { 6 } -> { 7 } -> { 8 } -> NULL";
        assertEquals( resultString , testList.toString() );
    }

    @Test void afterMiddleTest () {
        LinkedList testList = new LinkedList();
        testList.append(6);
        testList.append(7);
        testList.append(8);
        testList.insertAfter(7,10);
        String resultString = "{ 6 } -> { 7 } -> { 10 } -> { 8 } -> NULL";
        assertEquals( resultString , testList.toString() );
    }

    @Test void afterLastTest () {
        LinkedList testList = new LinkedList();
        testList.append(6);
        testList.append(7);
        testList.append(8);
        testList.insertAfter(8,10);
        String resultString = "{ 6 } -> { 7 } -> { 8 } -> { 10 } -> NULL";
        assertEquals( resultString , testList.toString() );
    }
 @Test void kGreaterThanLength () {
        LinkedList testList = new LinkedList();
        testList.append(6);
        testList.append(7);
        testList.append(8);
        testList.append(9);
        testList.append(10);
        assertEquals( "Exception" , testList.kthFromEnd(70) );
    }

    @Test void kSameLength () {
        LinkedList testList = new LinkedList();
        testList.append(6);
        testList.append(7);
        testList.append(8);
        testList.append(9);
        testList.append(10);
        assertEquals( "{6}" , testList.kthFromEnd(4) );
    }

    @Test void kNegative () {
        LinkedList testList = new LinkedList();
        testList.append(6);
        testList.append(7);
        testList.append(8);
        testList.append(9);
        testList.append(10);
        assertEquals( "Exception" , testList.kthFromEnd(-5) );
    }

    @Test void listSize1 () {
        LinkedList testList = new LinkedList();
        testList.append(6);
        assertEquals( "{6}" , testList.kthFromEnd(0) );
        assertEquals( "Exception" , testList.kthFromEnd(5) );
    }
    @Test void happyPath () {
        LinkedList testList = new LinkedList();
        testList.append(6);
        testList.append(7);
        testList.append(8);
        testList.append(9);
        testList.append(10);
        assertEquals( "{8}" , testList.kthFromEnd(2) );
    }
/* Test Zipped list if both lists are empty */
    @Test void zipBothEmpty () {
        LinkedList testList1 = new LinkedList();
        LinkedList testList2 = new LinkedList();

        LinkedList newZippedList = new LinkedList();
        newZippedList.head = testList1.zipLists(testList1,testList2);

        assertEquals( null , newZippedList.head);
    }

    /* Test Zipped list if first list is empty */
    @Test void zipFirstIsEmpty () {
        LinkedList testList1 = new LinkedList();
        LinkedList testList2 = new LinkedList();
        testList2.append(7);
        testList2.append(8);
        testList2.append(9);

        LinkedList newZippedList = new LinkedList();
        newZippedList.head = testList1.zipLists(testList1,testList2);
        String result = "{ 7 } -> { 8 } -> { 9 } -> NULL";

        assertEquals( result , newZippedList.toString());
    }

    /* Test Zipped list if second list is empty */
    @Test void zipSecondIsEmpty () {
        LinkedList testList1 = new LinkedList();
        testList1.append(7);
        testList1.append(8);
        testList1.append(9);
        LinkedList testList2 = new LinkedList();

        LinkedList newZippedList = new LinkedList();
        newZippedList.head = testList1.zipLists(testList1,testList2);
        String result = "{ 7 } -> { 8 } -> { 9 } -> NULL";

        assertEquals( result , newZippedList.toString());
    }

    /* Test Zipped list if first list size larger than second list size */
    @Test void zipFirstSizeLarger () {
        LinkedList testList1 = new LinkedList();
        testList1.append(1);
        testList1.append(2);
        testList1.append(3);
        LinkedList testList2 = new LinkedList();
        testList2.append(7);

        LinkedList newZippedList = new LinkedList();
        newZippedList.head = testList1.zipLists(testList1,testList2);
        String result = "{ 1 } -> { 7 } -> { 2 } -> { 3 } -> NULL";

        assertEquals( result , newZippedList.toString());
    }

    /* Test Zipped list if Second list size larger than first list size */
    @Test void zipSecondSizeLarger () {
        LinkedList testList1 = new LinkedList();
        testList1.append(1);
        LinkedList testList2 = new LinkedList();
        testList2.append(7);
        testList2.append(8);
        testList2.append(9);

        LinkedList newZippedList = new LinkedList();
        newZippedList.head = testList1.zipLists(testList1,testList2);
        String result = "{ 1 } -> { 7 } -> { 8 } -> { 9 } -> NULL";

        assertEquals( result , newZippedList.toString());
    }

    /* Happy path */
    @Test void zipHappyPath () {
        LinkedList testList1 = new LinkedList();
        testList1.append(1);
        testList1.append(2);
        testList1.append(3);
        LinkedList testList2 = new LinkedList();
        testList2.append(7);
        testList2.append(8);
        testList2.append(9);

        LinkedList newZippedList = new LinkedList();
        newZippedList.head = testList1.zipLists(testList1,testList2);
        String result = "{ 1 } -> { 7 } -> { 2 } -> { 8 } -> { 3 } -> { 9 } -> NULL";

        assertEquals( result , newZippedList.toString());
    }
}