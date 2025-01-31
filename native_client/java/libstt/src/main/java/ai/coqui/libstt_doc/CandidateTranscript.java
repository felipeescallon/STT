/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ai.coqui.libstt;

/**
 * A single transcript computed by the model, including a confidence<br>
 *        value and the metadata for its constituent tokens.
 */
public class CandidateTranscript {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CandidateTranscript(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CandidateTranscript obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Size of the tokens array 
   */
  public long getNumTokens() {
    return implJNI.CandidateTranscript_NumTokens_get(swigCPtr, this);
  }

  /**
   *  Approximated confidence value for this transcript. This is roughly the<br>
   * sum of the acoustic model logit values for each timestep/character that<br>
   * contributed to the creation of this transcript.
   */
  public double getConfidence() {
    return implJNI.CandidateTranscript_Confidence_get(swigCPtr, this);
  }

  /**
   * Retrieve one TokenMetadata element<br>
   * <br>
   * @param i Array index of the TokenMetadata to get<br>
   * <br>
   * @return The TokenMetadata requested or null
   */
  public TokenMetadata getToken(int i) {
    return new TokenMetadata(implJNI.CandidateTranscript_getToken(swigCPtr, this, i), false);
  }

}
