package fr.tiogars.template.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the {@link Template} class.
 * This class tests all public methods and constructors of the Template model.
 */
public class TemplateTest {

  /**
   * Tests the getter and setter methods for all Template fields.
   * Verifies that values set through setters are correctly retrieved by getters.
   */
  @Test
  public void testGettersAndSetters() {
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

  /**
   * Tests the toString method with populated field values.
   * Verifies that all field values are present in the string representation.
   */
  @Test
  public void testToString() {
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

  /**
   * Tests the toString method with default (null) field values.
   * Verifies that the string representation correctly handles null values.
   */
  @Test
  public void testToStringWithNullValues() {
    Template template = new Template();

    String result = template.toString();

    assertTrue(result.contains("id=0"));
    assertTrue(result.contains("code='null'"));
    assertTrue(result.contains("name='null'"));
    assertTrue(result.contains("description='null'"));
  }
}
