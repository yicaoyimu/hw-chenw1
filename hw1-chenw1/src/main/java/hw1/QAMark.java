

/* First created by JCasGen Thu Dec 05 15:56:51 EST 2013 */
package hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Thu Dec 05 15:56:51 EST 2013
 * XML source: /home/yicaoyimu/git/hw-chenw1/hw1-chenw1/src/main/resources/hw1-chenw1-typesystem.xml
 * @generated */
public class QAMark extends Base {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(QAMark.class);
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
  protected QAMark() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public QAMark(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public QAMark(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public QAMark(JCas jcas, int begin, int end) {
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
  //* Feature: isQuestion

  /** getter for isQuestion - gets A boolean variable indicating whether this line is a question or an answer.
   * @generated */
  public boolean getIsQuestion() {
    if (QAMark_Type.featOkTst && ((QAMark_Type)jcasType).casFeat_isQuestion == null)
      jcasType.jcas.throwFeatMissing("isQuestion", "hw1.QAMark");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((QAMark_Type)jcasType).casFeatCode_isQuestion);}
    
  /** setter for isQuestion - sets A boolean variable indicating whether this line is a question or an answer. 
   * @generated */
  public void setIsQuestion(boolean v) {
    if (QAMark_Type.featOkTst && ((QAMark_Type)jcasType).casFeat_isQuestion == null)
      jcasType.jcas.throwFeatMissing("isQuestion", "hw1.QAMark");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((QAMark_Type)jcasType).casFeatCode_isQuestion, v);}    
  }

    