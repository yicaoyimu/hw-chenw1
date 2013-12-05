

/* First created by JCasGen Thu Dec 05 15:56:51 EST 2013 */
package hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Thu Dec 05 15:56:51 EST 2013
 * XML source: /home/yicaoyimu/git/hw-chenw1/hw1-chenw1/src/main/resources/hw1-chenw1-typesystem.xml
 * @generated */
public class Person extends Base {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Person.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Person() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Person(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Person(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Person(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: isSubject

  /** getter for isSubject - gets A boolean variable indicating whether this person is the subject or an object in the sentence.
   * @generated */
  public boolean getIsSubject() {
    if (Person_Type.featOkTst && ((Person_Type)jcasType).casFeat_isSubject == null)
      jcasType.jcas.throwFeatMissing("isSubject", "hw1.Person");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Person_Type)jcasType).casFeatCode_isSubject);}
    
  /** setter for isSubject - sets A boolean variable indicating whether this person is the subject or an object in the sentence. 
   * @generated */
  public void setIsSubject(boolean v) {
    if (Person_Type.featOkTst && ((Person_Type)jcasType).casFeat_isSubject == null)
      jcasType.jcas.throwFeatMissing("isSubject", "hw1.Person");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Person_Type)jcasType).casFeatCode_isSubject, v);}    
   
    
  //*--------------*
  //* Feature: name

  /** getter for name - gets The name of this person.
   * @generated */
  public String getName() {
    if (Person_Type.featOkTst && ((Person_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "hw1.Person");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Person_Type)jcasType).casFeatCode_name);}
    
  /** setter for name - sets The name of this person. 
   * @generated */
  public void setName(String v) {
    if (Person_Type.featOkTst && ((Person_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "hw1.Person");
    jcasType.ll_cas.ll_setStringValue(addr, ((Person_Type)jcasType).casFeatCode_name, v);}    
  }

    