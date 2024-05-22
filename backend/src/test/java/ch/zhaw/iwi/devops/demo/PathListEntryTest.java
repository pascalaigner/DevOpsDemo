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
}
