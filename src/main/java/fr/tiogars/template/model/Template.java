package fr.tiogars.template.model;

/**
 * Represents a template with an identifier, code, name, and description.
 * This class provides a basic model for managing template data.
 */
public class Template {

  /**
   * The unique identifier for this template.
   */
  private int id;

  /**
   * The code or short identifier for this template.
   */
  private String code;

  /**
   * The name of this template.
   */
  private String name;

  /**
   * The description providing details about this template.
   */
  private String description;

  /**
   * Constructs a new Template with default values.
   * All fields are initialized to their default values (0 for int, null for String).
   */
  public Template() {
    // Default constructor
  }

  /**
   * Gets the unique identifier of this template.
   *
   * @return the template id
   */
  public int getId() {
    return id;
  }

  /**
   * Sets the unique identifier of this template.
   *
   * @param id the template id to set
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Gets the code of this template.
   *
   * @return the template code
   */
  public String getCode() {
    return code;
  }

  /**
   * Sets the code of this template.
   *
   * @param code the template code to set
   */
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * Gets the name of this template.
   *
   * @return the template name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the name of this template.
   *
   * @param name the template name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets the description of this template.
   *
   * @return the template description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the description of this template.
   *
   * @param description the template description to set
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Returns a string representation of this template.
   *
   * @return a string containing all template fields
   */
  @Override
  public String toString() {
    return "Template{" +
        "id=" + id +
        ", code='" + code + '\'' +
        ", name='" + name + '\'' +
        ", description='" + description + '\'' +
        '}';
  }
}
