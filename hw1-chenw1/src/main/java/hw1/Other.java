

/* First created by JCasGen Thu Dec 05 15:56:51 EST 2013 */
package hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Thu Dec 05 15:56:51 EST 2013
 * XML source: /home/yicaoyimu/git/hw-chenw1/hw1-chenw1/src/main/resources/hw1-chenw1-typesystem.xml
 * @generated */
public class Other extends Base {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Other.class);
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
  protected Other() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Other(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Other(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Other(JCas jcas, int begin, int end) {
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
  //* Feature: content

  /** getter for content - gets The content of the text segment that has nothing to do with the task we are trying to accomplish in hw1.
   * @generated */
  public String getContent() {
    if (Other_Type.featOkTst && ((Other_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "hw1.Other");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Other_Type)jcasType).casFeatCode_content);}
    
  /** setter for content - sets The content of the text segment that has nothing to do with the task we are trying to accomplish in hw1. 
   * @generated */
  public void setContent(String v) {
    if (Other_Type.featOkTst && ((Other_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "hw1.Other");
    jcasType.ll_cas.ll_setStringValue(addr, ((Other_Type)jcasType).casFeatCode_content, v);}    
  }

    