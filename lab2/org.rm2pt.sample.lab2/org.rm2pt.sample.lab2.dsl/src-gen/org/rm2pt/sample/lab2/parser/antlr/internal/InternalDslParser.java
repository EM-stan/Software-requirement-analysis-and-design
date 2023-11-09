package org.rm2pt.sample.lab2.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.rm2pt.sample.lab2.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Class'", "'{'", "'id'", "'studentnum'", "'grade'", "'teacher'", "','", "'}'", "'student'", "'-'", "'Teacher'", "'classid'", "'correct'", "'('", "')'", "'teaching'", "'input'", "'Student'", "'have'", "'answer'", "'Course'", "'stunum'", "'mean'", "'ReportCard'", "'stuid'", "'stuname'", "'totalscore'", "'rank'", "'ifcorrect'", "'ifanswer'", "'SubmitedPaper'", "'teaid'", "'courseid'", "'.'", "'E'", "'e'", "'ExamPaper'", "'score'", "'submit'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Class";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleClass"
    // InternalDsl.g:64:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalDsl.g:64:46: (iv_ruleClass= ruleClass EOF )
            // InternalDsl.g:65:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalDsl.g:71:1: ruleClass returns [EObject current=null] : ( () otherlv_1= 'Class' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'studentnum' ( (lv_studentnum_6_0= ruleEInt ) ) )? (otherlv_7= 'grade' ( (lv_grade_8_0= ruleEString ) ) )? (otherlv_9= 'teacher' otherlv_10= '{' ( (lv_teacher_11_0= ruleTeacher ) ) (otherlv_12= ',' ( (lv_teacher_13_0= ruleTeacher ) ) )* otherlv_14= '}' )? (otherlv_15= 'student' otherlv_16= '{' ( (lv_student_17_0= ruleStudent ) ) (otherlv_18= ',' ( (lv_student_19_0= ruleStudent ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        AntlrDatatypeRuleToken lv_studentnum_6_0 = null;

        AntlrDatatypeRuleToken lv_grade_8_0 = null;

        EObject lv_teacher_11_0 = null;

        EObject lv_teacher_13_0 = null;

        EObject lv_student_17_0 = null;

        EObject lv_student_19_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( ( () otherlv_1= 'Class' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'studentnum' ( (lv_studentnum_6_0= ruleEInt ) ) )? (otherlv_7= 'grade' ( (lv_grade_8_0= ruleEString ) ) )? (otherlv_9= 'teacher' otherlv_10= '{' ( (lv_teacher_11_0= ruleTeacher ) ) (otherlv_12= ',' ( (lv_teacher_13_0= ruleTeacher ) ) )* otherlv_14= '}' )? (otherlv_15= 'student' otherlv_16= '{' ( (lv_student_17_0= ruleStudent ) ) (otherlv_18= ',' ( (lv_student_19_0= ruleStudent ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalDsl.g:78:2: ( () otherlv_1= 'Class' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'studentnum' ( (lv_studentnum_6_0= ruleEInt ) ) )? (otherlv_7= 'grade' ( (lv_grade_8_0= ruleEString ) ) )? (otherlv_9= 'teacher' otherlv_10= '{' ( (lv_teacher_11_0= ruleTeacher ) ) (otherlv_12= ',' ( (lv_teacher_13_0= ruleTeacher ) ) )* otherlv_14= '}' )? (otherlv_15= 'student' otherlv_16= '{' ( (lv_student_17_0= ruleStudent ) ) (otherlv_18= ',' ( (lv_student_19_0= ruleStudent ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalDsl.g:78:2: ( () otherlv_1= 'Class' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'studentnum' ( (lv_studentnum_6_0= ruleEInt ) ) )? (otherlv_7= 'grade' ( (lv_grade_8_0= ruleEString ) ) )? (otherlv_9= 'teacher' otherlv_10= '{' ( (lv_teacher_11_0= ruleTeacher ) ) (otherlv_12= ',' ( (lv_teacher_13_0= ruleTeacher ) ) )* otherlv_14= '}' )? (otherlv_15= 'student' otherlv_16= '{' ( (lv_student_17_0= ruleStudent ) ) (otherlv_18= ',' ( (lv_student_19_0= ruleStudent ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalDsl.g:79:3: () otherlv_1= 'Class' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'studentnum' ( (lv_studentnum_6_0= ruleEInt ) ) )? (otherlv_7= 'grade' ( (lv_grade_8_0= ruleEString ) ) )? (otherlv_9= 'teacher' otherlv_10= '{' ( (lv_teacher_11_0= ruleTeacher ) ) (otherlv_12= ',' ( (lv_teacher_13_0= ruleTeacher ) ) )* otherlv_14= '}' )? (otherlv_15= 'student' otherlv_16= '{' ( (lv_student_17_0= ruleStudent ) ) (otherlv_18= ',' ( (lv_student_19_0= ruleStudent ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // InternalDsl.g:79:3: ()
            // InternalDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClassAccess().getClassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:94:3: (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:95:4: otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassAccess().getIdKeyword_3_0());
                    			
                    // InternalDsl.g:99:4: ( (lv_id_4_0= ruleEString ) )
                    // InternalDsl.g:100:5: (lv_id_4_0= ruleEString )
                    {
                    // InternalDsl.g:100:5: (lv_id_4_0= ruleEString )
                    // InternalDsl.g:101:6: lv_id_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getIdEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_id_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_4_0,
                    							"org.rm2pt.sample.lab2.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:119:3: (otherlv_5= 'studentnum' ( (lv_studentnum_6_0= ruleEInt ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:120:4: otherlv_5= 'studentnum' ( (lv_studentnum_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getClassAccess().getStudentnumKeyword_4_0());
                    			
                    // InternalDsl.g:124:4: ( (lv_studentnum_6_0= ruleEInt ) )
                    // InternalDsl.g:125:5: (lv_studentnum_6_0= ruleEInt )
                    {
                    // InternalDsl.g:125:5: (lv_studentnum_6_0= ruleEInt )
                    // InternalDsl.g:126:6: lv_studentnum_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getStudentnumEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_studentnum_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						set(
                    							current,
                    							"studentnum",
                    							lv_studentnum_6_0,
                    							"org.rm2pt.sample.lab2.Dsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:144:3: (otherlv_7= 'grade' ( (lv_grade_8_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:145:4: otherlv_7= 'grade' ( (lv_grade_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getClassAccess().getGradeKeyword_5_0());
                    			
                    // InternalDsl.g:149:4: ( (lv_grade_8_0= ruleEString ) )
                    // InternalDsl.g:150:5: (lv_grade_8_0= ruleEString )
                    {
                    // InternalDsl.g:150:5: (lv_grade_8_0= ruleEString )
                    // InternalDsl.g:151:6: lv_grade_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getGradeEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_grade_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						set(
                    							current,
                    							"grade",
                    							lv_grade_8_0,
                    							"org.rm2pt.sample.lab2.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:169:3: (otherlv_9= 'teacher' otherlv_10= '{' ( (lv_teacher_11_0= ruleTeacher ) ) (otherlv_12= ',' ( (lv_teacher_13_0= ruleTeacher ) ) )* otherlv_14= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:170:4: otherlv_9= 'teacher' otherlv_10= '{' ( (lv_teacher_11_0= ruleTeacher ) ) (otherlv_12= ',' ( (lv_teacher_13_0= ruleTeacher ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getClassAccess().getTeacherKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalDsl.g:178:4: ( (lv_teacher_11_0= ruleTeacher ) )
                    // InternalDsl.g:179:5: (lv_teacher_11_0= ruleTeacher )
                    {
                    // InternalDsl.g:179:5: (lv_teacher_11_0= ruleTeacher )
                    // InternalDsl.g:180:6: lv_teacher_11_0= ruleTeacher
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getTeacherTeacherParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_teacher_11_0=ruleTeacher();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						add(
                    							current,
                    							"teacher",
                    							lv_teacher_11_0,
                    							"org.rm2pt.sample.lab2.Dsl.Teacher");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:197:4: (otherlv_12= ',' ( (lv_teacher_13_0= ruleTeacher ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalDsl.g:198:5: otherlv_12= ',' ( (lv_teacher_13_0= ruleTeacher ) )
                    	    {
                    	    otherlv_12=(Token)match(input,17,FOLLOW_10); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getClassAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDsl.g:202:5: ( (lv_teacher_13_0= ruleTeacher ) )
                    	    // InternalDsl.g:203:6: (lv_teacher_13_0= ruleTeacher )
                    	    {
                    	    // InternalDsl.g:203:6: (lv_teacher_13_0= ruleTeacher )
                    	    // InternalDsl.g:204:7: lv_teacher_13_0= ruleTeacher
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getTeacherTeacherParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_teacher_13_0=ruleTeacher();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"teacher",
                    	    								lv_teacher_13_0,
                    	    								"org.rm2pt.sample.lab2.Dsl.Teacher");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:227:3: (otherlv_15= 'student' otherlv_16= '{' ( (lv_student_17_0= ruleStudent ) ) (otherlv_18= ',' ( (lv_student_19_0= ruleStudent ) ) )* otherlv_20= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:228:4: otherlv_15= 'student' otherlv_16= '{' ( (lv_student_17_0= ruleStudent ) ) (otherlv_18= ',' ( (lv_student_19_0= ruleStudent ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getClassAccess().getStudentKeyword_7_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_16, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalDsl.g:236:4: ( (lv_student_17_0= ruleStudent ) )
                    // InternalDsl.g:237:5: (lv_student_17_0= ruleStudent )
                    {
                    // InternalDsl.g:237:5: (lv_student_17_0= ruleStudent )
                    // InternalDsl.g:238:6: lv_student_17_0= ruleStudent
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getStudentStudentParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_student_17_0=ruleStudent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						add(
                    							current,
                    							"student",
                    							lv_student_17_0,
                    							"org.rm2pt.sample.lab2.Dsl.Student");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:255:4: (otherlv_18= ',' ( (lv_student_19_0= ruleStudent ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==17) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalDsl.g:256:5: otherlv_18= ',' ( (lv_student_19_0= ruleStudent ) )
                    	    {
                    	    otherlv_18=(Token)match(input,17,FOLLOW_13); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getClassAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalDsl.g:260:5: ( (lv_student_19_0= ruleStudent ) )
                    	    // InternalDsl.g:261:6: (lv_student_19_0= ruleStudent )
                    	    {
                    	    // InternalDsl.g:261:6: (lv_student_19_0= ruleStudent )
                    	    // InternalDsl.g:262:7: lv_student_19_0= ruleStudent
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getStudentStudentParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_student_19_0=ruleStudent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"student",
                    	    								lv_student_19_0,
                    	    								"org.rm2pt.sample.lab2.Dsl.Student");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_20, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleEString"
    // InternalDsl.g:293:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDsl.g:293:47: (iv_ruleEString= ruleEString EOF )
            // InternalDsl.g:294:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDsl.g:300:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDsl.g:306:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDsl.g:307:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDsl.g:307:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:308:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:316:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalDsl.g:327:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDsl.g:327:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDsl.g:328:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDsl.g:334:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDsl.g:340:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDsl.g:341:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDsl.g:341:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDsl.g:342:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDsl.g:342:3: (kw= '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:343:4: kw= '-'
                    {
                    kw=(Token)match(input,20,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleTeacher"
    // InternalDsl.g:360:1: entryRuleTeacher returns [EObject current=null] : iv_ruleTeacher= ruleTeacher EOF ;
    public final EObject entryRuleTeacher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeacher = null;


        try {
            // InternalDsl.g:360:48: (iv_ruleTeacher= ruleTeacher EOF )
            // InternalDsl.g:361:2: iv_ruleTeacher= ruleTeacher EOF
            {
             newCompositeNode(grammarAccess.getTeacherRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTeacher=ruleTeacher();

            state._fsp--;

             current =iv_ruleTeacher; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTeacher"


    // $ANTLR start "ruleTeacher"
    // InternalDsl.g:367:1: ruleTeacher returns [EObject current=null] : (otherlv_0= 'Teacher' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'classid' ( (lv_classid_6_0= ruleEString ) ) )? otherlv_7= 'correct' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' (otherlv_13= 'teaching' otherlv_14= '{' ( (lv_teaching_15_0= ruleCourse ) ) (otherlv_16= ',' ( (lv_teaching_17_0= ruleCourse ) ) )* otherlv_18= '}' )? (otherlv_19= 'input' otherlv_20= '{' ( (lv_input_21_0= ruleReportCard ) ) (otherlv_22= ',' ( (lv_input_23_0= ruleReportCard ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) ;
    public final EObject ruleTeacher() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_id_4_0 = null;

        AntlrDatatypeRuleToken lv_classid_6_0 = null;

        EObject lv_teaching_15_0 = null;

        EObject lv_teaching_17_0 = null;

        EObject lv_input_21_0 = null;

        EObject lv_input_23_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:373:2: ( (otherlv_0= 'Teacher' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'classid' ( (lv_classid_6_0= ruleEString ) ) )? otherlv_7= 'correct' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' (otherlv_13= 'teaching' otherlv_14= '{' ( (lv_teaching_15_0= ruleCourse ) ) (otherlv_16= ',' ( (lv_teaching_17_0= ruleCourse ) ) )* otherlv_18= '}' )? (otherlv_19= 'input' otherlv_20= '{' ( (lv_input_21_0= ruleReportCard ) ) (otherlv_22= ',' ( (lv_input_23_0= ruleReportCard ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) )
            // InternalDsl.g:374:2: (otherlv_0= 'Teacher' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'classid' ( (lv_classid_6_0= ruleEString ) ) )? otherlv_7= 'correct' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' (otherlv_13= 'teaching' otherlv_14= '{' ( (lv_teaching_15_0= ruleCourse ) ) (otherlv_16= ',' ( (lv_teaching_17_0= ruleCourse ) ) )* otherlv_18= '}' )? (otherlv_19= 'input' otherlv_20= '{' ( (lv_input_21_0= ruleReportCard ) ) (otherlv_22= ',' ( (lv_input_23_0= ruleReportCard ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            {
            // InternalDsl.g:374:2: (otherlv_0= 'Teacher' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'classid' ( (lv_classid_6_0= ruleEString ) ) )? otherlv_7= 'correct' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' (otherlv_13= 'teaching' otherlv_14= '{' ( (lv_teaching_15_0= ruleCourse ) ) (otherlv_16= ',' ( (lv_teaching_17_0= ruleCourse ) ) )* otherlv_18= '}' )? (otherlv_19= 'input' otherlv_20= '{' ( (lv_input_21_0= ruleReportCard ) ) (otherlv_22= ',' ( (lv_input_23_0= ruleReportCard ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            // InternalDsl.g:375:3: otherlv_0= 'Teacher' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'classid' ( (lv_classid_6_0= ruleEString ) ) )? otherlv_7= 'correct' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' (otherlv_13= 'teaching' otherlv_14= '{' ( (lv_teaching_15_0= ruleCourse ) ) (otherlv_16= ',' ( (lv_teaching_17_0= ruleCourse ) ) )* otherlv_18= '}' )? (otherlv_19= 'input' otherlv_20= '{' ( (lv_input_21_0= ruleReportCard ) ) (otherlv_22= ',' ( (lv_input_23_0= ruleReportCard ) ) )* otherlv_24= '}' )? otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTeacherAccess().getTeacherKeyword_0());
            		
            // InternalDsl.g:379:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:380:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:380:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:381:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTeacherAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTeacherRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.rm2pt.sample.lab2.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getTeacherAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:402:3: (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:403:4: otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getTeacherAccess().getIdKeyword_3_0());
                    			
                    // InternalDsl.g:407:4: ( (lv_id_4_0= ruleEString ) )
                    // InternalDsl.g:408:5: (lv_id_4_0= ruleEString )
                    {
                    // InternalDsl.g:408:5: (lv_id_4_0= ruleEString )
                    // InternalDsl.g:409:6: lv_id_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTeacherAccess().getIdEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_id_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTeacherRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_4_0,
                    							"org.rm2pt.sample.lab2.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:427:3: (otherlv_5= 'classid' ( (lv_classid_6_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:428:4: otherlv_5= 'classid' ( (lv_classid_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getTeacherAccess().getClassidKeyword_4_0());
                    			
                    // InternalDsl.g:432:4: ( (lv_classid_6_0= ruleEString ) )
                    // InternalDsl.g:433:5: (lv_classid_6_0= ruleEString )
                    {
                    // InternalDsl.g:433:5: (lv_classid_6_0= ruleEString )
                    // InternalDsl.g:434:6: lv_classid_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTeacherAccess().getClassidEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_classid_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTeacherRule());
                    						}
                    						set(
                    							current,
                    							"classid",
                    							lv_classid_6_0,
                    							"org.rm2pt.sample.lab2.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getTeacherAccess().getCorrectKeyword_5());
            		
            otherlv_8=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getTeacherAccess().getLeftParenthesisKeyword_6());
            		
            // InternalDsl.g:460:3: ( ( ruleEString ) )
            // InternalDsl.g:461:4: ( ruleEString )
            {
            // InternalDsl.g:461:4: ( ruleEString )
            // InternalDsl.g:462:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTeacherRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTeacherAccess().getCorrectSubmitedPaperCrossReference_7_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:476:3: (otherlv_10= ',' ( ( ruleEString ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:477:4: otherlv_10= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,17,FOLLOW_5); 

            	    				newLeafNode(otherlv_10, grammarAccess.getTeacherAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalDsl.g:481:4: ( ( ruleEString ) )
            	    // InternalDsl.g:482:5: ( ruleEString )
            	    {
            	    // InternalDsl.g:482:5: ( ruleEString )
            	    // InternalDsl.g:483:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTeacherRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getTeacherAccess().getCorrectSubmitedPaperCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_12=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_12, grammarAccess.getTeacherAccess().getRightParenthesisKeyword_9());
            		
            // InternalDsl.g:502:3: (otherlv_13= 'teaching' otherlv_14= '{' ( (lv_teaching_15_0= ruleCourse ) ) (otherlv_16= ',' ( (lv_teaching_17_0= ruleCourse ) ) )* otherlv_18= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:503:4: otherlv_13= 'teaching' otherlv_14= '{' ( (lv_teaching_15_0= ruleCourse ) ) (otherlv_16= ',' ( (lv_teaching_17_0= ruleCourse ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getTeacherAccess().getTeachingKeyword_10_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_22); 

                    				newLeafNode(otherlv_14, grammarAccess.getTeacherAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalDsl.g:511:4: ( (lv_teaching_15_0= ruleCourse ) )
                    // InternalDsl.g:512:5: (lv_teaching_15_0= ruleCourse )
                    {
                    // InternalDsl.g:512:5: (lv_teaching_15_0= ruleCourse )
                    // InternalDsl.g:513:6: lv_teaching_15_0= ruleCourse
                    {

                    						newCompositeNode(grammarAccess.getTeacherAccess().getTeachingCourseParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_teaching_15_0=ruleCourse();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTeacherRule());
                    						}
                    						add(
                    							current,
                    							"teaching",
                    							lv_teaching_15_0,
                    							"org.rm2pt.sample.lab2.Dsl.Course");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:530:4: (otherlv_16= ',' ( (lv_teaching_17_0= ruleCourse ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==17) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalDsl.g:531:5: otherlv_16= ',' ( (lv_teaching_17_0= ruleCourse ) )
                    	    {
                    	    otherlv_16=(Token)match(input,17,FOLLOW_22); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getTeacherAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalDsl.g:535:5: ( (lv_teaching_17_0= ruleCourse ) )
                    	    // InternalDsl.g:536:6: (lv_teaching_17_0= ruleCourse )
                    	    {
                    	    // InternalDsl.g:536:6: (lv_teaching_17_0= ruleCourse )
                    	    // InternalDsl.g:537:7: lv_teaching_17_0= ruleCourse
                    	    {

                    	    							newCompositeNode(grammarAccess.getTeacherAccess().getTeachingCourseParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_teaching_17_0=ruleCourse();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTeacherRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"teaching",
                    	    								lv_teaching_17_0,
                    	    								"org.rm2pt.sample.lab2.Dsl.Course");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,18,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getTeacherAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:560:3: (otherlv_19= 'input' otherlv_20= '{' ( (lv_input_21_0= ruleReportCard ) ) (otherlv_22= ',' ( (lv_input_23_0= ruleReportCard ) ) )* otherlv_24= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:561:4: otherlv_19= 'input' otherlv_20= '{' ( (lv_input_21_0= ruleReportCard ) ) (otherlv_22= ',' ( (lv_input_23_0= ruleReportCard ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getTeacherAccess().getInputKeyword_11_0());
                    			
                    otherlv_20=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_20, grammarAccess.getTeacherAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalDsl.g:569:4: ( (lv_input_21_0= ruleReportCard ) )
                    // InternalDsl.g:570:5: (lv_input_21_0= ruleReportCard )
                    {
                    // InternalDsl.g:570:5: (lv_input_21_0= ruleReportCard )
                    // InternalDsl.g:571:6: lv_input_21_0= ruleReportCard
                    {

                    						newCompositeNode(grammarAccess.getTeacherAccess().getInputReportCardParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_input_21_0=ruleReportCard();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTeacherRule());
                    						}
                    						add(
                    							current,
                    							"input",
                    							lv_input_21_0,
                    							"org.rm2pt.sample.lab2.Dsl.ReportCard");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:588:4: (otherlv_22= ',' ( (lv_input_23_0= ruleReportCard ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==17) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalDsl.g:589:5: otherlv_22= ',' ( (lv_input_23_0= ruleReportCard ) )
                    	    {
                    	    otherlv_22=(Token)match(input,17,FOLLOW_24); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getTeacherAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalDsl.g:593:5: ( (lv_input_23_0= ruleReportCard ) )
                    	    // InternalDsl.g:594:6: (lv_input_23_0= ruleReportCard )
                    	    {
                    	    // InternalDsl.g:594:6: (lv_input_23_0= ruleReportCard )
                    	    // InternalDsl.g:595:7: lv_input_23_0= ruleReportCard
                    	    {

                    	    							newCompositeNode(grammarAccess.getTeacherAccess().getInputReportCardParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_input_23_0=ruleReportCard();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTeacherRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"input",
                    	    								lv_input_23_0,
                    	    								"org.rm2pt.sample.lab2.Dsl.ReportCard");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_24, grammarAccess.getTeacherAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            otherlv_25=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getTeacherAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTeacher"


    // $ANTLR start "entryRuleStudent"
    // InternalDsl.g:626:1: entryRuleStudent returns [EObject current=null] : iv_ruleStudent= ruleStudent EOF ;
    public final EObject entryRuleStudent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStudent = null;


        try {
            // InternalDsl.g:626:48: (iv_ruleStudent= ruleStudent EOF )
            // InternalDsl.g:627:2: iv_ruleStudent= ruleStudent EOF
            {
             newCompositeNode(grammarAccess.getStudentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStudent=ruleStudent();

            state._fsp--;

             current =iv_ruleStudent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStudent"


    // $ANTLR start "ruleStudent"
    // InternalDsl.g:633:1: ruleStudent returns [EObject current=null] : (otherlv_0= 'Student' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'classid' ( (lv_classid_6_0= ruleEString ) ) )? otherlv_7= 'have' ( ( ruleEString ) ) (otherlv_9= 'answer' otherlv_10= '{' ( (lv_answer_11_0= ruleExamPaper ) ) (otherlv_12= ',' ( (lv_answer_13_0= ruleExamPaper ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleStudent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_id_4_0 = null;

        AntlrDatatypeRuleToken lv_classid_6_0 = null;

        EObject lv_answer_11_0 = null;

        EObject lv_answer_13_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:639:2: ( (otherlv_0= 'Student' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'classid' ( (lv_classid_6_0= ruleEString ) ) )? otherlv_7= 'have' ( ( ruleEString ) ) (otherlv_9= 'answer' otherlv_10= '{' ( (lv_answer_11_0= ruleExamPaper ) ) (otherlv_12= ',' ( (lv_answer_13_0= ruleExamPaper ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalDsl.g:640:2: (otherlv_0= 'Student' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'classid' ( (lv_classid_6_0= ruleEString ) ) )? otherlv_7= 'have' ( ( ruleEString ) ) (otherlv_9= 'answer' otherlv_10= '{' ( (lv_answer_11_0= ruleExamPaper ) ) (otherlv_12= ',' ( (lv_answer_13_0= ruleExamPaper ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalDsl.g:640:2: (otherlv_0= 'Student' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'classid' ( (lv_classid_6_0= ruleEString ) ) )? otherlv_7= 'have' ( ( ruleEString ) ) (otherlv_9= 'answer' otherlv_10= '{' ( (lv_answer_11_0= ruleExamPaper ) ) (otherlv_12= ',' ( (lv_answer_13_0= ruleExamPaper ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalDsl.g:641:3: otherlv_0= 'Student' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'classid' ( (lv_classid_6_0= ruleEString ) ) )? otherlv_7= 'have' ( ( ruleEString ) ) (otherlv_9= 'answer' otherlv_10= '{' ( (lv_answer_11_0= ruleExamPaper ) ) (otherlv_12= ',' ( (lv_answer_13_0= ruleExamPaper ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getStudentAccess().getStudentKeyword_0());
            		
            // InternalDsl.g:645:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:646:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:646:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:647:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStudentAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStudentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.rm2pt.sample.lab2.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getStudentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:668:3: (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==13) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:669:4: otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getStudentAccess().getIdKeyword_3_0());
                    			
                    // InternalDsl.g:673:4: ( (lv_id_4_0= ruleEString ) )
                    // InternalDsl.g:674:5: (lv_id_4_0= ruleEString )
                    {
                    // InternalDsl.g:674:5: (lv_id_4_0= ruleEString )
                    // InternalDsl.g:675:6: lv_id_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getStudentAccess().getIdEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_id_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStudentRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_4_0,
                    							"org.rm2pt.sample.lab2.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:693:3: (otherlv_5= 'classid' ( (lv_classid_6_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDsl.g:694:4: otherlv_5= 'classid' ( (lv_classid_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getStudentAccess().getClassidKeyword_4_0());
                    			
                    // InternalDsl.g:698:4: ( (lv_classid_6_0= ruleEString ) )
                    // InternalDsl.g:699:5: (lv_classid_6_0= ruleEString )
                    {
                    // InternalDsl.g:699:5: (lv_classid_6_0= ruleEString )
                    // InternalDsl.g:700:6: lv_classid_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getStudentAccess().getClassidEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_classid_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStudentRule());
                    						}
                    						set(
                    							current,
                    							"classid",
                    							lv_classid_6_0,
                    							"org.rm2pt.sample.lab2.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getStudentAccess().getHaveKeyword_5());
            		
            // InternalDsl.g:722:3: ( ( ruleEString ) )
            // InternalDsl.g:723:4: ( ruleEString )
            {
            // InternalDsl.g:723:4: ( ruleEString )
            // InternalDsl.g:724:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStudentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStudentAccess().getHaveReportCardCrossReference_6_0());
            				
            pushFollow(FOLLOW_28);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:738:3: (otherlv_9= 'answer' otherlv_10= '{' ( (lv_answer_11_0= ruleExamPaper ) ) (otherlv_12= ',' ( (lv_answer_13_0= ruleExamPaper ) ) )* otherlv_14= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:739:4: otherlv_9= 'answer' otherlv_10= '{' ( (lv_answer_11_0= ruleExamPaper ) ) (otherlv_12= ',' ( (lv_answer_13_0= ruleExamPaper ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getStudentAccess().getAnswerKeyword_7_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_29); 

                    				newLeafNode(otherlv_10, grammarAccess.getStudentAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalDsl.g:747:4: ( (lv_answer_11_0= ruleExamPaper ) )
                    // InternalDsl.g:748:5: (lv_answer_11_0= ruleExamPaper )
                    {
                    // InternalDsl.g:748:5: (lv_answer_11_0= ruleExamPaper )
                    // InternalDsl.g:749:6: lv_answer_11_0= ruleExamPaper
                    {

                    						newCompositeNode(grammarAccess.getStudentAccess().getAnswerExamPaperParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_answer_11_0=ruleExamPaper();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStudentRule());
                    						}
                    						add(
                    							current,
                    							"answer",
                    							lv_answer_11_0,
                    							"org.rm2pt.sample.lab2.Dsl.ExamPaper");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:766:4: (otherlv_12= ',' ( (lv_answer_13_0= ruleExamPaper ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==17) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalDsl.g:767:5: otherlv_12= ',' ( (lv_answer_13_0= ruleExamPaper ) )
                    	    {
                    	    otherlv_12=(Token)match(input,17,FOLLOW_29); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getStudentAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalDsl.g:771:5: ( (lv_answer_13_0= ruleExamPaper ) )
                    	    // InternalDsl.g:772:6: (lv_answer_13_0= ruleExamPaper )
                    	    {
                    	    // InternalDsl.g:772:6: (lv_answer_13_0= ruleExamPaper )
                    	    // InternalDsl.g:773:7: lv_answer_13_0= ruleExamPaper
                    	    {

                    	    							newCompositeNode(grammarAccess.getStudentAccess().getAnswerExamPaperParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_answer_13_0=ruleExamPaper();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStudentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"answer",
                    	    								lv_answer_13_0,
                    	    								"org.rm2pt.sample.lab2.Dsl.ExamPaper");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_14, grammarAccess.getStudentAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getStudentAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStudent"


    // $ANTLR start "entryRuleCourse"
    // InternalDsl.g:804:1: entryRuleCourse returns [EObject current=null] : iv_ruleCourse= ruleCourse EOF ;
    public final EObject entryRuleCourse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCourse = null;


        try {
            // InternalDsl.g:804:47: (iv_ruleCourse= ruleCourse EOF )
            // InternalDsl.g:805:2: iv_ruleCourse= ruleCourse EOF
            {
             newCompositeNode(grammarAccess.getCourseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCourse=ruleCourse();

            state._fsp--;

             current =iv_ruleCourse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCourse"


    // $ANTLR start "ruleCourse"
    // InternalDsl.g:811:1: ruleCourse returns [EObject current=null] : ( () otherlv_1= 'Course' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'stunum' ( (lv_stunum_7_0= ruleEInt ) ) )? (otherlv_8= 'mean' ( (lv_mean_9_0= ruleEFloat ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleCourse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_id_5_0 = null;

        AntlrDatatypeRuleToken lv_stunum_7_0 = null;

        AntlrDatatypeRuleToken lv_mean_9_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:817:2: ( ( () otherlv_1= 'Course' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'stunum' ( (lv_stunum_7_0= ruleEInt ) ) )? (otherlv_8= 'mean' ( (lv_mean_9_0= ruleEFloat ) ) )? otherlv_10= '}' ) )
            // InternalDsl.g:818:2: ( () otherlv_1= 'Course' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'stunum' ( (lv_stunum_7_0= ruleEInt ) ) )? (otherlv_8= 'mean' ( (lv_mean_9_0= ruleEFloat ) ) )? otherlv_10= '}' )
            {
            // InternalDsl.g:818:2: ( () otherlv_1= 'Course' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'stunum' ( (lv_stunum_7_0= ruleEInt ) ) )? (otherlv_8= 'mean' ( (lv_mean_9_0= ruleEFloat ) ) )? otherlv_10= '}' )
            // InternalDsl.g:819:3: () otherlv_1= 'Course' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'stunum' ( (lv_stunum_7_0= ruleEInt ) ) )? (otherlv_8= 'mean' ( (lv_mean_9_0= ruleEFloat ) ) )? otherlv_10= '}'
            {
            // InternalDsl.g:819:3: ()
            // InternalDsl.g:820:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCourseAccess().getCourseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCourseAccess().getCourseKeyword_1());
            		
            // InternalDsl.g:830:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:831:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:831:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:832:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCourseAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCourseRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.rm2pt.sample.lab2.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:853:3: (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==13) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDsl.g:854:4: otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getCourseAccess().getIdKeyword_4_0());
                    			
                    // InternalDsl.g:858:4: ( (lv_id_5_0= ruleEString ) )
                    // InternalDsl.g:859:5: (lv_id_5_0= ruleEString )
                    {
                    // InternalDsl.g:859:5: (lv_id_5_0= ruleEString )
                    // InternalDsl.g:860:6: lv_id_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCourseAccess().getIdEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_id_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCourseRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_5_0,
                    							"org.rm2pt.sample.lab2.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:878:3: (otherlv_6= 'stunum' ( (lv_stunum_7_0= ruleEInt ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:879:4: otherlv_6= 'stunum' ( (lv_stunum_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getCourseAccess().getStunumKeyword_5_0());
                    			
                    // InternalDsl.g:883:4: ( (lv_stunum_7_0= ruleEInt ) )
                    // InternalDsl.g:884:5: (lv_stunum_7_0= ruleEInt )
                    {
                    // InternalDsl.g:884:5: (lv_stunum_7_0= ruleEInt )
                    // InternalDsl.g:885:6: lv_stunum_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCourseAccess().getStunumEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_stunum_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCourseRule());
                    						}
                    						set(
                    							current,
                    							"stunum",
                    							lv_stunum_7_0,
                    							"org.rm2pt.sample.lab2.Dsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:903:3: (otherlv_8= 'mean' ( (lv_mean_9_0= ruleEFloat ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDsl.g:904:4: otherlv_8= 'mean' ( (lv_mean_9_0= ruleEFloat ) )
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_33); 

                    				newLeafNode(otherlv_8, grammarAccess.getCourseAccess().getMeanKeyword_6_0());
                    			
                    // InternalDsl.g:908:4: ( (lv_mean_9_0= ruleEFloat ) )
                    // InternalDsl.g:909:5: (lv_mean_9_0= ruleEFloat )
                    {
                    // InternalDsl.g:909:5: (lv_mean_9_0= ruleEFloat )
                    // InternalDsl.g:910:6: lv_mean_9_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getCourseAccess().getMeanEFloatParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_mean_9_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCourseRule());
                    						}
                    						set(
                    							current,
                    							"mean",
                    							lv_mean_9_0,
                    							"org.rm2pt.sample.lab2.Dsl.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCourse"


    // $ANTLR start "entryRuleReportCard"
    // InternalDsl.g:936:1: entryRuleReportCard returns [EObject current=null] : iv_ruleReportCard= ruleReportCard EOF ;
    public final EObject entryRuleReportCard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReportCard = null;


        try {
            // InternalDsl.g:936:51: (iv_ruleReportCard= ruleReportCard EOF )
            // InternalDsl.g:937:2: iv_ruleReportCard= ruleReportCard EOF
            {
             newCompositeNode(grammarAccess.getReportCardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReportCard=ruleReportCard();

            state._fsp--;

             current =iv_ruleReportCard; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReportCard"


    // $ANTLR start "ruleReportCard"
    // InternalDsl.g:943:1: ruleReportCard returns [EObject current=null] : ( () otherlv_1= 'ReportCard' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'stuid' ( (lv_stuid_6_0= ruleEString ) ) )? (otherlv_7= 'stuname' ( (lv_stuname_8_0= ruleEString ) ) )? (otherlv_9= 'totalscore' ( (lv_totalscore_10_0= ruleEFloat ) ) )? (otherlv_11= 'rank' ( (lv_rank_12_0= ruleEInt ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleReportCard() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        AntlrDatatypeRuleToken lv_stuid_6_0 = null;

        AntlrDatatypeRuleToken lv_stuname_8_0 = null;

        AntlrDatatypeRuleToken lv_totalscore_10_0 = null;

        AntlrDatatypeRuleToken lv_rank_12_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:949:2: ( ( () otherlv_1= 'ReportCard' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'stuid' ( (lv_stuid_6_0= ruleEString ) ) )? (otherlv_7= 'stuname' ( (lv_stuname_8_0= ruleEString ) ) )? (otherlv_9= 'totalscore' ( (lv_totalscore_10_0= ruleEFloat ) ) )? (otherlv_11= 'rank' ( (lv_rank_12_0= ruleEInt ) ) )? otherlv_13= '}' ) )
            // InternalDsl.g:950:2: ( () otherlv_1= 'ReportCard' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'stuid' ( (lv_stuid_6_0= ruleEString ) ) )? (otherlv_7= 'stuname' ( (lv_stuname_8_0= ruleEString ) ) )? (otherlv_9= 'totalscore' ( (lv_totalscore_10_0= ruleEFloat ) ) )? (otherlv_11= 'rank' ( (lv_rank_12_0= ruleEInt ) ) )? otherlv_13= '}' )
            {
            // InternalDsl.g:950:2: ( () otherlv_1= 'ReportCard' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'stuid' ( (lv_stuid_6_0= ruleEString ) ) )? (otherlv_7= 'stuname' ( (lv_stuname_8_0= ruleEString ) ) )? (otherlv_9= 'totalscore' ( (lv_totalscore_10_0= ruleEFloat ) ) )? (otherlv_11= 'rank' ( (lv_rank_12_0= ruleEInt ) ) )? otherlv_13= '}' )
            // InternalDsl.g:951:3: () otherlv_1= 'ReportCard' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'stuid' ( (lv_stuid_6_0= ruleEString ) ) )? (otherlv_7= 'stuname' ( (lv_stuname_8_0= ruleEString ) ) )? (otherlv_9= 'totalscore' ( (lv_totalscore_10_0= ruleEFloat ) ) )? (otherlv_11= 'rank' ( (lv_rank_12_0= ruleEInt ) ) )? otherlv_13= '}'
            {
            // InternalDsl.g:951:3: ()
            // InternalDsl.g:952:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReportCardAccess().getReportCardAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getReportCardAccess().getReportCardKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getReportCardAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:966:3: (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==13) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:967:4: otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getReportCardAccess().getIdKeyword_3_0());
                    			
                    // InternalDsl.g:971:4: ( (lv_id_4_0= ruleEString ) )
                    // InternalDsl.g:972:5: (lv_id_4_0= ruleEString )
                    {
                    // InternalDsl.g:972:5: (lv_id_4_0= ruleEString )
                    // InternalDsl.g:973:6: lv_id_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getReportCardAccess().getIdEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_id_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReportCardRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_4_0,
                    							"org.rm2pt.sample.lab2.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:991:3: (otherlv_5= 'stuid' ( (lv_stuid_6_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDsl.g:992:4: otherlv_5= 'stuid' ( (lv_stuid_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getReportCardAccess().getStuidKeyword_4_0());
                    			
                    // InternalDsl.g:996:4: ( (lv_stuid_6_0= ruleEString ) )
                    // InternalDsl.g:997:5: (lv_stuid_6_0= ruleEString )
                    {
                    // InternalDsl.g:997:5: (lv_stuid_6_0= ruleEString )
                    // InternalDsl.g:998:6: lv_stuid_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getReportCardAccess().getStuidEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_stuid_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReportCardRule());
                    						}
                    						set(
                    							current,
                    							"stuid",
                    							lv_stuid_6_0,
                    							"org.rm2pt.sample.lab2.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1016:3: (otherlv_7= 'stuname' ( (lv_stuname_8_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDsl.g:1017:4: otherlv_7= 'stuname' ( (lv_stuname_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,36,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getReportCardAccess().getStunameKeyword_5_0());
                    			
                    // InternalDsl.g:1021:4: ( (lv_stuname_8_0= ruleEString ) )
                    // InternalDsl.g:1022:5: (lv_stuname_8_0= ruleEString )
                    {
                    // InternalDsl.g:1022:5: (lv_stuname_8_0= ruleEString )
                    // InternalDsl.g:1023:6: lv_stuname_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getReportCardAccess().getStunameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_stuname_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReportCardRule());
                    						}
                    						set(
                    							current,
                    							"stuname",
                    							lv_stuname_8_0,
                    							"org.rm2pt.sample.lab2.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1041:3: (otherlv_9= 'totalscore' ( (lv_totalscore_10_0= ruleEFloat ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDsl.g:1042:4: otherlv_9= 'totalscore' ( (lv_totalscore_10_0= ruleEFloat ) )
                    {
                    otherlv_9=(Token)match(input,37,FOLLOW_33); 

                    				newLeafNode(otherlv_9, grammarAccess.getReportCardAccess().getTotalscoreKeyword_6_0());
                    			
                    // InternalDsl.g:1046:4: ( (lv_totalscore_10_0= ruleEFloat ) )
                    // InternalDsl.g:1047:5: (lv_totalscore_10_0= ruleEFloat )
                    {
                    // InternalDsl.g:1047:5: (lv_totalscore_10_0= ruleEFloat )
                    // InternalDsl.g:1048:6: lv_totalscore_10_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getReportCardAccess().getTotalscoreEFloatParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_totalscore_10_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReportCardRule());
                    						}
                    						set(
                    							current,
                    							"totalscore",
                    							lv_totalscore_10_0,
                    							"org.rm2pt.sample.lab2.Dsl.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1066:3: (otherlv_11= 'rank' ( (lv_rank_12_0= ruleEInt ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDsl.g:1067:4: otherlv_11= 'rank' ( (lv_rank_12_0= ruleEInt ) )
                    {
                    otherlv_11=(Token)match(input,38,FOLLOW_7); 

                    				newLeafNode(otherlv_11, grammarAccess.getReportCardAccess().getRankKeyword_7_0());
                    			
                    // InternalDsl.g:1071:4: ( (lv_rank_12_0= ruleEInt ) )
                    // InternalDsl.g:1072:5: (lv_rank_12_0= ruleEInt )
                    {
                    // InternalDsl.g:1072:5: (lv_rank_12_0= ruleEInt )
                    // InternalDsl.g:1073:6: lv_rank_12_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getReportCardAccess().getRankEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_rank_12_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReportCardRule());
                    						}
                    						set(
                    							current,
                    							"rank",
                    							lv_rank_12_0,
                    							"org.rm2pt.sample.lab2.Dsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getReportCardAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReportCard"


    // $ANTLR start "entryRuleSubmitedPaper"
    // InternalDsl.g:1099:1: entryRuleSubmitedPaper returns [EObject current=null] : iv_ruleSubmitedPaper= ruleSubmitedPaper EOF ;
    public final EObject entryRuleSubmitedPaper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubmitedPaper = null;


        try {
            // InternalDsl.g:1099:54: (iv_ruleSubmitedPaper= ruleSubmitedPaper EOF )
            // InternalDsl.g:1100:2: iv_ruleSubmitedPaper= ruleSubmitedPaper EOF
            {
             newCompositeNode(grammarAccess.getSubmitedPaperRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubmitedPaper=ruleSubmitedPaper();

            state._fsp--;

             current =iv_ruleSubmitedPaper; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubmitedPaper"


    // $ANTLR start "ruleSubmitedPaper"
    // InternalDsl.g:1106:1: ruleSubmitedPaper returns [EObject current=null] : ( () ( (lv_ifcorrect_1_0= 'ifcorrect' ) )? ( (lv_ifanswer_2_0= 'ifanswer' ) )? otherlv_3= 'SubmitedPaper' otherlv_4= '{' (otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) )? (otherlv_7= 'stuid' ( (lv_stuid_8_0= ruleEString ) ) )? (otherlv_9= 'teaid' ( (lv_teaid_10_0= ruleEString ) ) )? (otherlv_11= 'courseid' ( (lv_courseid_12_0= ruleEString ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleSubmitedPaper() throws RecognitionException {
        EObject current = null;

        Token lv_ifcorrect_1_0=null;
        Token lv_ifanswer_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_id_6_0 = null;

        AntlrDatatypeRuleToken lv_stuid_8_0 = null;

        AntlrDatatypeRuleToken lv_teaid_10_0 = null;

        AntlrDatatypeRuleToken lv_courseid_12_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1112:2: ( ( () ( (lv_ifcorrect_1_0= 'ifcorrect' ) )? ( (lv_ifanswer_2_0= 'ifanswer' ) )? otherlv_3= 'SubmitedPaper' otherlv_4= '{' (otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) )? (otherlv_7= 'stuid' ( (lv_stuid_8_0= ruleEString ) ) )? (otherlv_9= 'teaid' ( (lv_teaid_10_0= ruleEString ) ) )? (otherlv_11= 'courseid' ( (lv_courseid_12_0= ruleEString ) ) )? otherlv_13= '}' ) )
            // InternalDsl.g:1113:2: ( () ( (lv_ifcorrect_1_0= 'ifcorrect' ) )? ( (lv_ifanswer_2_0= 'ifanswer' ) )? otherlv_3= 'SubmitedPaper' otherlv_4= '{' (otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) )? (otherlv_7= 'stuid' ( (lv_stuid_8_0= ruleEString ) ) )? (otherlv_9= 'teaid' ( (lv_teaid_10_0= ruleEString ) ) )? (otherlv_11= 'courseid' ( (lv_courseid_12_0= ruleEString ) ) )? otherlv_13= '}' )
            {
            // InternalDsl.g:1113:2: ( () ( (lv_ifcorrect_1_0= 'ifcorrect' ) )? ( (lv_ifanswer_2_0= 'ifanswer' ) )? otherlv_3= 'SubmitedPaper' otherlv_4= '{' (otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) )? (otherlv_7= 'stuid' ( (lv_stuid_8_0= ruleEString ) ) )? (otherlv_9= 'teaid' ( (lv_teaid_10_0= ruleEString ) ) )? (otherlv_11= 'courseid' ( (lv_courseid_12_0= ruleEString ) ) )? otherlv_13= '}' )
            // InternalDsl.g:1114:3: () ( (lv_ifcorrect_1_0= 'ifcorrect' ) )? ( (lv_ifanswer_2_0= 'ifanswer' ) )? otherlv_3= 'SubmitedPaper' otherlv_4= '{' (otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) )? (otherlv_7= 'stuid' ( (lv_stuid_8_0= ruleEString ) ) )? (otherlv_9= 'teaid' ( (lv_teaid_10_0= ruleEString ) ) )? (otherlv_11= 'courseid' ( (lv_courseid_12_0= ruleEString ) ) )? otherlv_13= '}'
            {
            // InternalDsl.g:1114:3: ()
            // InternalDsl.g:1115:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubmitedPaperAccess().getSubmitedPaperAction_0(),
            					current);
            			

            }

            // InternalDsl.g:1121:3: ( (lv_ifcorrect_1_0= 'ifcorrect' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==39) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDsl.g:1122:4: (lv_ifcorrect_1_0= 'ifcorrect' )
                    {
                    // InternalDsl.g:1122:4: (lv_ifcorrect_1_0= 'ifcorrect' )
                    // InternalDsl.g:1123:5: lv_ifcorrect_1_0= 'ifcorrect'
                    {
                    lv_ifcorrect_1_0=(Token)match(input,39,FOLLOW_39); 

                    					newLeafNode(lv_ifcorrect_1_0, grammarAccess.getSubmitedPaperAccess().getIfcorrectIfcorrectKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSubmitedPaperRule());
                    					}
                    					setWithLastConsumed(current, "ifcorrect", lv_ifcorrect_1_0 != null, "ifcorrect");
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:1135:3: ( (lv_ifanswer_2_0= 'ifanswer' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==40) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDsl.g:1136:4: (lv_ifanswer_2_0= 'ifanswer' )
                    {
                    // InternalDsl.g:1136:4: (lv_ifanswer_2_0= 'ifanswer' )
                    // InternalDsl.g:1137:5: lv_ifanswer_2_0= 'ifanswer'
                    {
                    lv_ifanswer_2_0=(Token)match(input,40,FOLLOW_40); 

                    					newLeafNode(lv_ifanswer_2_0, grammarAccess.getSubmitedPaperAccess().getIfanswerIfanswerKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSubmitedPaperRule());
                    					}
                    					setWithLastConsumed(current, "ifanswer", lv_ifanswer_2_0 != null, "ifanswer");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getSubmitedPaperAccess().getSubmitedPaperKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_4, grammarAccess.getSubmitedPaperAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDsl.g:1157:3: (otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==13) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDsl.g:1158:4: otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getSubmitedPaperAccess().getIdKeyword_5_0());
                    			
                    // InternalDsl.g:1162:4: ( (lv_id_6_0= ruleEString ) )
                    // InternalDsl.g:1163:5: (lv_id_6_0= ruleEString )
                    {
                    // InternalDsl.g:1163:5: (lv_id_6_0= ruleEString )
                    // InternalDsl.g:1164:6: lv_id_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubmitedPaperAccess().getIdEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_id_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubmitedPaperRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_6_0,
                    							"org.rm2pt.sample.lab2.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1182:3: (otherlv_7= 'stuid' ( (lv_stuid_8_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==35) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDsl.g:1183:4: otherlv_7= 'stuid' ( (lv_stuid_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getSubmitedPaperAccess().getStuidKeyword_6_0());
                    			
                    // InternalDsl.g:1187:4: ( (lv_stuid_8_0= ruleEString ) )
                    // InternalDsl.g:1188:5: (lv_stuid_8_0= ruleEString )
                    {
                    // InternalDsl.g:1188:5: (lv_stuid_8_0= ruleEString )
                    // InternalDsl.g:1189:6: lv_stuid_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubmitedPaperAccess().getStuidEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_stuid_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubmitedPaperRule());
                    						}
                    						set(
                    							current,
                    							"stuid",
                    							lv_stuid_8_0,
                    							"org.rm2pt.sample.lab2.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1207:3: (otherlv_9= 'teaid' ( (lv_teaid_10_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==42) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDsl.g:1208:4: otherlv_9= 'teaid' ( (lv_teaid_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,42,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getSubmitedPaperAccess().getTeaidKeyword_7_0());
                    			
                    // InternalDsl.g:1212:4: ( (lv_teaid_10_0= ruleEString ) )
                    // InternalDsl.g:1213:5: (lv_teaid_10_0= ruleEString )
                    {
                    // InternalDsl.g:1213:5: (lv_teaid_10_0= ruleEString )
                    // InternalDsl.g:1214:6: lv_teaid_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubmitedPaperAccess().getTeaidEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_teaid_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubmitedPaperRule());
                    						}
                    						set(
                    							current,
                    							"teaid",
                    							lv_teaid_10_0,
                    							"org.rm2pt.sample.lab2.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1232:3: (otherlv_11= 'courseid' ( (lv_courseid_12_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==43) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDsl.g:1233:4: otherlv_11= 'courseid' ( (lv_courseid_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,43,FOLLOW_5); 

                    				newLeafNode(otherlv_11, grammarAccess.getSubmitedPaperAccess().getCourseidKeyword_8_0());
                    			
                    // InternalDsl.g:1237:4: ( (lv_courseid_12_0= ruleEString ) )
                    // InternalDsl.g:1238:5: (lv_courseid_12_0= ruleEString )
                    {
                    // InternalDsl.g:1238:5: (lv_courseid_12_0= ruleEString )
                    // InternalDsl.g:1239:6: lv_courseid_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubmitedPaperAccess().getCourseidEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_courseid_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubmitedPaperRule());
                    						}
                    						set(
                    							current,
                    							"courseid",
                    							lv_courseid_12_0,
                    							"org.rm2pt.sample.lab2.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getSubmitedPaperAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubmitedPaper"


    // $ANTLR start "entryRuleEFloat"
    // InternalDsl.g:1265:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalDsl.g:1265:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalDsl.g:1266:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalDsl.g:1272:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalDsl.g:1278:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalDsl.g:1279:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalDsl.g:1279:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalDsl.g:1280:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalDsl.g:1280:3: (kw= '-' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==20) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDsl.g:1281:4: kw= '-'
                    {
                    kw=(Token)match(input,20,FOLLOW_45); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalDsl.g:1287:3: (this_INT_1= RULE_INT )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDsl.g:1288:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_46); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,44,FOLLOW_15); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_47); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalDsl.g:1308:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=45 && LA39_0<=46)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDsl.g:1309:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalDsl.g:1309:4: (kw= 'E' | kw= 'e' )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==45) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==46) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalDsl.g:1310:5: kw= 'E'
                            {
                            kw=(Token)match(input,45,FOLLOW_7); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:1316:5: kw= 'e'
                            {
                            kw=(Token)match(input,46,FOLLOW_7); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalDsl.g:1322:4: (kw= '-' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==20) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalDsl.g:1323:5: kw= '-'
                            {
                            kw=(Token)match(input,20,FOLLOW_15); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleExamPaper"
    // InternalDsl.g:1341:1: entryRuleExamPaper returns [EObject current=null] : iv_ruleExamPaper= ruleExamPaper EOF ;
    public final EObject entryRuleExamPaper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExamPaper = null;


        try {
            // InternalDsl.g:1341:50: (iv_ruleExamPaper= ruleExamPaper EOF )
            // InternalDsl.g:1342:2: iv_ruleExamPaper= ruleExamPaper EOF
            {
             newCompositeNode(grammarAccess.getExamPaperRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExamPaper=ruleExamPaper();

            state._fsp--;

             current =iv_ruleExamPaper; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExamPaper"


    // $ANTLR start "ruleExamPaper"
    // InternalDsl.g:1348:1: ruleExamPaper returns [EObject current=null] : ( () ( (lv_ifanswer_1_0= 'ifanswer' ) )? ( (lv_ifcorrect_2_0= 'ifcorrect' ) )? otherlv_3= 'ExamPaper' otherlv_4= '{' (otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) )? (otherlv_7= 'courseid' ( (lv_courseid_8_0= ruleEString ) ) )? (otherlv_9= 'teaid' ( (lv_teaid_10_0= ruleEString ) ) )? (otherlv_11= 'stuid' ( (lv_stuid_12_0= ruleEString ) ) )? (otherlv_13= 'score' ( (lv_score_14_0= ruleEFloat ) ) )? (otherlv_15= 'submit' otherlv_16= '{' ( (lv_submit_17_0= ruleSubmitedPaper ) ) (otherlv_18= ',' ( (lv_submit_19_0= ruleSubmitedPaper ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleExamPaper() throws RecognitionException {
        EObject current = null;

        Token lv_ifanswer_1_0=null;
        Token lv_ifcorrect_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_id_6_0 = null;

        AntlrDatatypeRuleToken lv_courseid_8_0 = null;

        AntlrDatatypeRuleToken lv_teaid_10_0 = null;

        AntlrDatatypeRuleToken lv_stuid_12_0 = null;

        AntlrDatatypeRuleToken lv_score_14_0 = null;

        EObject lv_submit_17_0 = null;

        EObject lv_submit_19_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1354:2: ( ( () ( (lv_ifanswer_1_0= 'ifanswer' ) )? ( (lv_ifcorrect_2_0= 'ifcorrect' ) )? otherlv_3= 'ExamPaper' otherlv_4= '{' (otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) )? (otherlv_7= 'courseid' ( (lv_courseid_8_0= ruleEString ) ) )? (otherlv_9= 'teaid' ( (lv_teaid_10_0= ruleEString ) ) )? (otherlv_11= 'stuid' ( (lv_stuid_12_0= ruleEString ) ) )? (otherlv_13= 'score' ( (lv_score_14_0= ruleEFloat ) ) )? (otherlv_15= 'submit' otherlv_16= '{' ( (lv_submit_17_0= ruleSubmitedPaper ) ) (otherlv_18= ',' ( (lv_submit_19_0= ruleSubmitedPaper ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalDsl.g:1355:2: ( () ( (lv_ifanswer_1_0= 'ifanswer' ) )? ( (lv_ifcorrect_2_0= 'ifcorrect' ) )? otherlv_3= 'ExamPaper' otherlv_4= '{' (otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) )? (otherlv_7= 'courseid' ( (lv_courseid_8_0= ruleEString ) ) )? (otherlv_9= 'teaid' ( (lv_teaid_10_0= ruleEString ) ) )? (otherlv_11= 'stuid' ( (lv_stuid_12_0= ruleEString ) ) )? (otherlv_13= 'score' ( (lv_score_14_0= ruleEFloat ) ) )? (otherlv_15= 'submit' otherlv_16= '{' ( (lv_submit_17_0= ruleSubmitedPaper ) ) (otherlv_18= ',' ( (lv_submit_19_0= ruleSubmitedPaper ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalDsl.g:1355:2: ( () ( (lv_ifanswer_1_0= 'ifanswer' ) )? ( (lv_ifcorrect_2_0= 'ifcorrect' ) )? otherlv_3= 'ExamPaper' otherlv_4= '{' (otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) )? (otherlv_7= 'courseid' ( (lv_courseid_8_0= ruleEString ) ) )? (otherlv_9= 'teaid' ( (lv_teaid_10_0= ruleEString ) ) )? (otherlv_11= 'stuid' ( (lv_stuid_12_0= ruleEString ) ) )? (otherlv_13= 'score' ( (lv_score_14_0= ruleEFloat ) ) )? (otherlv_15= 'submit' otherlv_16= '{' ( (lv_submit_17_0= ruleSubmitedPaper ) ) (otherlv_18= ',' ( (lv_submit_19_0= ruleSubmitedPaper ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalDsl.g:1356:3: () ( (lv_ifanswer_1_0= 'ifanswer' ) )? ( (lv_ifcorrect_2_0= 'ifcorrect' ) )? otherlv_3= 'ExamPaper' otherlv_4= '{' (otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) )? (otherlv_7= 'courseid' ( (lv_courseid_8_0= ruleEString ) ) )? (otherlv_9= 'teaid' ( (lv_teaid_10_0= ruleEString ) ) )? (otherlv_11= 'stuid' ( (lv_stuid_12_0= ruleEString ) ) )? (otherlv_13= 'score' ( (lv_score_14_0= ruleEFloat ) ) )? (otherlv_15= 'submit' otherlv_16= '{' ( (lv_submit_17_0= ruleSubmitedPaper ) ) (otherlv_18= ',' ( (lv_submit_19_0= ruleSubmitedPaper ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // InternalDsl.g:1356:3: ()
            // InternalDsl.g:1357:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExamPaperAccess().getExamPaperAction_0(),
            					current);
            			

            }

            // InternalDsl.g:1363:3: ( (lv_ifanswer_1_0= 'ifanswer' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==40) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDsl.g:1364:4: (lv_ifanswer_1_0= 'ifanswer' )
                    {
                    // InternalDsl.g:1364:4: (lv_ifanswer_1_0= 'ifanswer' )
                    // InternalDsl.g:1365:5: lv_ifanswer_1_0= 'ifanswer'
                    {
                    lv_ifanswer_1_0=(Token)match(input,40,FOLLOW_48); 

                    					newLeafNode(lv_ifanswer_1_0, grammarAccess.getExamPaperAccess().getIfanswerIfanswerKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExamPaperRule());
                    					}
                    					setWithLastConsumed(current, "ifanswer", lv_ifanswer_1_0 != null, "ifanswer");
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:1377:3: ( (lv_ifcorrect_2_0= 'ifcorrect' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==39) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDsl.g:1378:4: (lv_ifcorrect_2_0= 'ifcorrect' )
                    {
                    // InternalDsl.g:1378:4: (lv_ifcorrect_2_0= 'ifcorrect' )
                    // InternalDsl.g:1379:5: lv_ifcorrect_2_0= 'ifcorrect'
                    {
                    lv_ifcorrect_2_0=(Token)match(input,39,FOLLOW_49); 

                    					newLeafNode(lv_ifcorrect_2_0, grammarAccess.getExamPaperAccess().getIfcorrectIfcorrectKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExamPaperRule());
                    					}
                    					setWithLastConsumed(current, "ifcorrect", lv_ifcorrect_2_0 != null, "ifcorrect");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getExamPaperAccess().getExamPaperKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_50); 

            			newLeafNode(otherlv_4, grammarAccess.getExamPaperAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDsl.g:1399:3: (otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==13) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDsl.g:1400:4: otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getExamPaperAccess().getIdKeyword_5_0());
                    			
                    // InternalDsl.g:1404:4: ( (lv_id_6_0= ruleEString ) )
                    // InternalDsl.g:1405:5: (lv_id_6_0= ruleEString )
                    {
                    // InternalDsl.g:1405:5: (lv_id_6_0= ruleEString )
                    // InternalDsl.g:1406:6: lv_id_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getExamPaperAccess().getIdEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_id_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExamPaperRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_6_0,
                    							"org.rm2pt.sample.lab2.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1424:3: (otherlv_7= 'courseid' ( (lv_courseid_8_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==43) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDsl.g:1425:4: otherlv_7= 'courseid' ( (lv_courseid_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,43,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getExamPaperAccess().getCourseidKeyword_6_0());
                    			
                    // InternalDsl.g:1429:4: ( (lv_courseid_8_0= ruleEString ) )
                    // InternalDsl.g:1430:5: (lv_courseid_8_0= ruleEString )
                    {
                    // InternalDsl.g:1430:5: (lv_courseid_8_0= ruleEString )
                    // InternalDsl.g:1431:6: lv_courseid_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getExamPaperAccess().getCourseidEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_courseid_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExamPaperRule());
                    						}
                    						set(
                    							current,
                    							"courseid",
                    							lv_courseid_8_0,
                    							"org.rm2pt.sample.lab2.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1449:3: (otherlv_9= 'teaid' ( (lv_teaid_10_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==42) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDsl.g:1450:4: otherlv_9= 'teaid' ( (lv_teaid_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,42,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getExamPaperAccess().getTeaidKeyword_7_0());
                    			
                    // InternalDsl.g:1454:4: ( (lv_teaid_10_0= ruleEString ) )
                    // InternalDsl.g:1455:5: (lv_teaid_10_0= ruleEString )
                    {
                    // InternalDsl.g:1455:5: (lv_teaid_10_0= ruleEString )
                    // InternalDsl.g:1456:6: lv_teaid_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getExamPaperAccess().getTeaidEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_teaid_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExamPaperRule());
                    						}
                    						set(
                    							current,
                    							"teaid",
                    							lv_teaid_10_0,
                    							"org.rm2pt.sample.lab2.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1474:3: (otherlv_11= 'stuid' ( (lv_stuid_12_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==35) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDsl.g:1475:4: otherlv_11= 'stuid' ( (lv_stuid_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_11, grammarAccess.getExamPaperAccess().getStuidKeyword_8_0());
                    			
                    // InternalDsl.g:1479:4: ( (lv_stuid_12_0= ruleEString ) )
                    // InternalDsl.g:1480:5: (lv_stuid_12_0= ruleEString )
                    {
                    // InternalDsl.g:1480:5: (lv_stuid_12_0= ruleEString )
                    // InternalDsl.g:1481:6: lv_stuid_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getExamPaperAccess().getStuidEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_54);
                    lv_stuid_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExamPaperRule());
                    						}
                    						set(
                    							current,
                    							"stuid",
                    							lv_stuid_12_0,
                    							"org.rm2pt.sample.lab2.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1499:3: (otherlv_13= 'score' ( (lv_score_14_0= ruleEFloat ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==48) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDsl.g:1500:4: otherlv_13= 'score' ( (lv_score_14_0= ruleEFloat ) )
                    {
                    otherlv_13=(Token)match(input,48,FOLLOW_33); 

                    				newLeafNode(otherlv_13, grammarAccess.getExamPaperAccess().getScoreKeyword_9_0());
                    			
                    // InternalDsl.g:1504:4: ( (lv_score_14_0= ruleEFloat ) )
                    // InternalDsl.g:1505:5: (lv_score_14_0= ruleEFloat )
                    {
                    // InternalDsl.g:1505:5: (lv_score_14_0= ruleEFloat )
                    // InternalDsl.g:1506:6: lv_score_14_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getExamPaperAccess().getScoreEFloatParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_55);
                    lv_score_14_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExamPaperRule());
                    						}
                    						set(
                    							current,
                    							"score",
                    							lv_score_14_0,
                    							"org.rm2pt.sample.lab2.Dsl.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1524:3: (otherlv_15= 'submit' otherlv_16= '{' ( (lv_submit_17_0= ruleSubmitedPaper ) ) (otherlv_18= ',' ( (lv_submit_19_0= ruleSubmitedPaper ) ) )* otherlv_20= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==49) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDsl.g:1525:4: otherlv_15= 'submit' otherlv_16= '{' ( (lv_submit_17_0= ruleSubmitedPaper ) ) (otherlv_18= ',' ( (lv_submit_19_0= ruleSubmitedPaper ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,49,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getExamPaperAccess().getSubmitKeyword_10_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_56); 

                    				newLeafNode(otherlv_16, grammarAccess.getExamPaperAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalDsl.g:1533:4: ( (lv_submit_17_0= ruleSubmitedPaper ) )
                    // InternalDsl.g:1534:5: (lv_submit_17_0= ruleSubmitedPaper )
                    {
                    // InternalDsl.g:1534:5: (lv_submit_17_0= ruleSubmitedPaper )
                    // InternalDsl.g:1535:6: lv_submit_17_0= ruleSubmitedPaper
                    {

                    						newCompositeNode(grammarAccess.getExamPaperAccess().getSubmitSubmitedPaperParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_submit_17_0=ruleSubmitedPaper();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExamPaperRule());
                    						}
                    						add(
                    							current,
                    							"submit",
                    							lv_submit_17_0,
                    							"org.rm2pt.sample.lab2.Dsl.SubmitedPaper");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1552:4: (otherlv_18= ',' ( (lv_submit_19_0= ruleSubmitedPaper ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==17) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalDsl.g:1553:5: otherlv_18= ',' ( (lv_submit_19_0= ruleSubmitedPaper ) )
                    	    {
                    	    otherlv_18=(Token)match(input,17,FOLLOW_56); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getExamPaperAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalDsl.g:1557:5: ( (lv_submit_19_0= ruleSubmitedPaper ) )
                    	    // InternalDsl.g:1558:6: (lv_submit_19_0= ruleSubmitedPaper )
                    	    {
                    	    // InternalDsl.g:1558:6: (lv_submit_19_0= ruleSubmitedPaper )
                    	    // InternalDsl.g:1559:7: lv_submit_19_0= ruleSubmitedPaper
                    	    {

                    	    							newCompositeNode(grammarAccess.getExamPaperAccess().getSubmitSubmitedPaperParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_submit_19_0=ruleSubmitedPaper();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExamPaperRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"submit",
                    	    								lv_submit_19_0,
                    	    								"org.rm2pt.sample.lab2.Dsl.SubmitedPaper");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_20, grammarAccess.getExamPaperAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getExamPaperAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExamPaper"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000DE000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000DC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000D8000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000D0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C02000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000C040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020402000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000818000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000300042000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000300040000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200040000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000100040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000007800042000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000007800040000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000007000040000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000006000040000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000040000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00000C0800042000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000C0800040000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00000C0000040000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000080000040000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000100000000040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000808000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00030C0800042000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x00030C0800040000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0003040800040000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0003000800040000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0003000000040000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0002000000040000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000038000000000L});

}