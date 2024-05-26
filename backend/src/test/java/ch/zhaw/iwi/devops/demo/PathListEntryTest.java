package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PathListEntryTest {

    private PathListEntry<Integer> entry;

    @BeforeEach
    void setUp() {
        entry = new PathListEntry<>();
    }

    @Test
    void testSetAndGetName() {
        entry.setName("Test Name");
        assertEquals("Test Name", entry.getName());
    }

    @Test
    void testSetAndGetColor() {
        entry.setColor("Red");
        assertEquals("Red", entry.getColor());
    }

    @Test
    void testSetAndGetIcon() {
        entry.setIcon("Test Icon");
        assertEquals("Test Icon", entry.getIcon());
    }

    @Test
    void testSetAndGetDetails() {
        entry.setDetails(List.of("Detail1", "Detail2"));
        assertEquals(List.of("Detail1", "Detail2"), entry.getDetails());
    }

    @Test
    void testSetAndGetUrl() {
        entry.setUrl("http://example.com");
        assertEquals("http://example.com", entry.getUrl());
    }

    @Test
    void testSetAndGetActive() {
        entry.setActive(false);
        assertFalse(entry.isActive());
    }

    @Test
    void testSetAndGetOrder() {
        entry.setOrder(10.5f);
        assertEquals(10.5f, entry.getOrder());
    }

    @Test
    void testSetAndGetType() {
        entry.setType("Test Type");
        assertEquals("Test Type", entry.getType());
    }

    @Test
    void testSetAndGetPage() {
        entry.setPage("Test Page");
        assertEquals("Test Page", entry.getPage());
    }

    @Test
    void testSetAndGetTooltip() {
        entry.setTooltip("Test Tooltip");
        assertEquals("Test Tooltip", entry.getTooltip());
    }

    @Test
    void testSetAndGetForm() {
        entry.setForm("Test Form");
        assertEquals("Test Form", entry.getForm());
    }

    @Test
    void testKeyEquality() {
        entry.setKey(1, "key1");
        PathListEntry<Integer>.Key key1 = entry.getKey();
        
        PathListEntry<Integer> otherEntry = new PathListEntry<>();
        otherEntry.setKey(1, "key1");
        PathListEntry<Integer>.Key key2 = otherEntry.getKey();

        assertEquals(key1, key2);
    }

    @Test
    void testEntryEquality() {
        entry.setKey(1, "key1");
        entry.setName("Test Name");
        entry.setDetails(List.of("Detail1"));

        PathListEntry<Integer> otherEntry = new PathListEntry<>();
        otherEntry.setKey(1, "key1");
        otherEntry.setName("Test Name");
        otherEntry.setDetails(List.of("Detail1"));

        assertEquals(entry, otherEntry);
    }

    @Test
    void testHashCode() {
        entry.setKey(1, "key1");
        PathListEntry<Integer> otherEntry = new PathListEntry<>();
        otherEntry.setKey(1, "key1");

        assertEquals(entry.hashCode(), otherEntry.hashCode());
    }

    @Test
    public void testEqualsSameObject() {
        PathListEntry<String> entry = new PathListEntry<>();
        entry.setKey("key1", "name1");
        assertTrue(entry.equals(entry));
    }

    @Test
    public void testEqualsNull() {
        PathListEntry<String> entry = new PathListEntry<>();
        entry.setKey("key1", "name1");
        assertFalse(entry.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        PathListEntry<String> entry = new PathListEntry<>();
        entry.setKey("key1", "name1");
        String otherClassObject = "I am a String";
        assertFalse(entry.equals(otherClassObject));
    }

    @Test
    public void testEqualsDifferentKey() {
        PathListEntry<String> entry1 = new PathListEntry<>();
        entry1.setKey("key1", "name1");

        PathListEntry<String> entry2 = new PathListEntry<>();
        entry2.setKey("key2", "name1");

        assertFalse(entry1.equals(entry2));
    }

    @Test
    public void testEqualsDifferentName() {
        PathListEntry<String> entry1 = new PathListEntry<>();
        entry1.setKey("key1", "name1");

        PathListEntry<String> entry2 = new PathListEntry<>();
        entry2.setKey("key1", "name2");

        assertFalse(entry1.equals(entry2));
    }

    @Test
    public void testEqualsSameKeyAndName() {
        PathListEntry<String> entry1 = new PathListEntry<>();
        entry1.setKey("key1", "name1");

        PathListEntry<String> entry2 = new PathListEntry<>();
        entry2.setKey("key1", "name1");

        assertTrue(entry1.equals(entry2));
    }

    @Test
    public void testEqualsKeyNull() {
        PathListEntry<String> entry1 = new PathListEntry<>();
        entry1.setKey(null, "name1");

        PathListEntry<String> entry2 = new PathListEntry<>();
        entry2.setKey(null, "name1");

        assertTrue(entry1.equals(entry2));
    }

    @Test
    public void testEqualsNameNull() {
        PathListEntry<String> entry1 = new PathListEntry<>();
        entry1.setKey("key1", null);

        PathListEntry<String> entry2 = new PathListEntry<>();
        entry2.setKey("key1", null);

        assertTrue(entry1.equals(entry2));
    }

    @Test
    public void testEqualsBothNull() {
        PathListEntry<String> entry1 = new PathListEntry<>();
        entry1.setKey(null, null);

        PathListEntry<String> entry2 = new PathListEntry<>();
        entry2.setKey(null, null);

        assertTrue(entry1.equals(entry2));
    }
}
