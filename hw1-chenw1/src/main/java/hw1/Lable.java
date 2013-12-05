

/* First created by JCasGen Thu Dec 05 15:56:51 EST 2013 */
package hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Thu Dec 05 15:56:51 EST 2013
 * XML source: /home/yicaoyimu/git/hw-chenw1/hw1-chenw1/src/main/resources/hw1-chenw1-typesystem.xml
 * @generated */
public class Lable extends Base {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Lable.class);
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
  protected Lable() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Lable(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Lable(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Lable(JCas jcas, int begin, int end) {
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
  //* Feature: lable

  /** getter for lable - gets A boolean variable indicating whether this answer is labled as + or -.
   * @generated */
  public boolean getLable() {
    if (Lable_Type.featOkTst && ((Lable_Type)jcasType).casFeat_lable == null)
      jcasType.jcas.throwFeatMissing("lable", "hw1.Lable");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Lable_Type)jcasType).casFeatCode_lable);}
    
  /** setter for lable - sets A boolean variable indicating whether this answer is labled as + or -. 
   * @generated */
  public void setLable(boolean v) {
    if (Lable_Type.featOkTst && ((Lable_Type)jcasType).casFeat_lable == null)
      jcasType.jcas.throwFeatMissing("lable", "hw1.Lable");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Lable_Type)jcasType).casFeatCode_lable, v);}    
  }

    