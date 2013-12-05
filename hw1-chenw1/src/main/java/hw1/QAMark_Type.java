
/* First created by JCasGen Thu Dec 05 15:56:51 EST 2013 */
package hw1;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Thu Dec 05 15:56:51 EST 2013
 * @generated */
public class QAMark_Type extends Base_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (QAMark_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = QAMark_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new QAMark(addr, QAMark_Type.this);
  			   QAMark_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new QAMark(addr, QAMark_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = QAMark.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("hw1.QAMark");
 
  /** @generated */
  final Feature casFeat_isQuestion;
  /** @generated */
  final int     casFeatCode_isQuestion;
  /** @generated */ 
  public boolean getIsQuestion(int addr) {
        if (featOkTst && casFeat_isQuestion == null)
      jcas.throwFeatMissing("isQuestion", "hw1.QAMark");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isQuestion);
  }
  /** @generated */    
  public void setIsQuestion(int addr, boolean v) {
        if (featOkTst && casFeat_isQuestion == null)
      jcas.throwFeatMissing("isQuestion", "hw1.QAMark");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isQuestion, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public QAMark_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_isQuestion = jcas.getRequiredFeatureDE(casType, "isQuestion", "uima.cas.Boolean", featOkTst);
    casFeatCode_isQuestion  = (null == casFeat_isQuestion) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isQuestion).getCode();

  }
}



    