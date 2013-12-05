
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
public class Lable_Type extends Base_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Lable_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Lable_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Lable(addr, Lable_Type.this);
  			   Lable_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Lable(addr, Lable_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Lable.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("hw1.Lable");
 
  /** @generated */
  final Feature casFeat_lable;
  /** @generated */
  final int     casFeatCode_lable;
  /** @generated */ 
  public boolean getLable(int addr) {
        if (featOkTst && casFeat_lable == null)
      jcas.throwFeatMissing("lable", "hw1.Lable");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_lable);
  }
  /** @generated */    
  public void setLable(int addr, boolean v) {
        if (featOkTst && casFeat_lable == null)
      jcas.throwFeatMissing("lable", "hw1.Lable");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_lable, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Lable_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_lable = jcas.getRequiredFeatureDE(casType, "lable", "uima.cas.Boolean", featOkTst);
    casFeatCode_lable  = (null == casFeat_lable) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_lable).getCode();

  }
}



    