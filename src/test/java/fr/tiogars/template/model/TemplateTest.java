package fr.tiogars.template.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemplateTest {

  @Test
  void testGettersAndSetters() {
    Template template = new Template();

    // Test id
    template.setId(1);
    assertEquals(1, template.getId());

    // Test code
    template.setCode("TEMP001");
    assertEquals("TEMP001", template.getCode());

    // Test name
    template.setName("Sample Template");
    assertEquals("Sample Template", template.getName());

    // Test description
    template.setDescription("This is a test template");
    assertEquals("This is a test template", template.getDescription());
  }

  @Test
  void testToString() {
    Template template = new Template();
    template.setId(42);
    template.setCode("CODE123");
    template.setName("Test Template");
    template.setDescription("A description for testing");

    String result = template.toString();

    assertTrue(result.contains("id=42"));
    assertTrue(result.contains("code='CODE123'"));
    assertTrue(result.contains("name='Test Template'"));
    assertTrue(result.contains("description='A description for testing'"));
  }

  @Test
  void testToStringWithNullValues() {
    Template template = new Template();

    String result = template.toString();

    assertTrue(result.contains("id=0"));
    assertTrue(result.contains("code='null'"));
    assertTrue(result.contains("name='null'"));
    assertTrue(result.contains("description='null'"));
  }
}
