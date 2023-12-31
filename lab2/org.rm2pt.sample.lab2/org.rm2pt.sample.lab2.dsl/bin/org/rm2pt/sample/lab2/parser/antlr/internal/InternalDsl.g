/*
 * generated by Xtext 2.25.0
 */
grammar InternalDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.rm2pt.sample.lab2.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleClass
entryRuleClass returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassRule()); }
	iv_ruleClass=ruleClass
	{ $current=$iv_ruleClass.current; }
	EOF;

// Rule Class
ruleClass returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getClassAccess().getClassAction_0(),
					$current);
			}
		)
		otherlv_1='Class'
		{
			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='id'
			{
				newLeafNode(otherlv_3, grammarAccess.getClassAccess().getIdKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getClassAccess().getIdEStringParserRuleCall_3_1_0());
					}
					lv_id_4_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getClassRule());
						}
						set(
							$current,
							"id",
							lv_id_4_0,
							"org.rm2pt.sample.lab2.Dsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='studentnum'
			{
				newLeafNode(otherlv_5, grammarAccess.getClassAccess().getStudentnumKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getClassAccess().getStudentnumEIntParserRuleCall_4_1_0());
					}
					lv_studentnum_6_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getClassRule());
						}
						set(
							$current,
							"studentnum",
							lv_studentnum_6_0,
							"org.rm2pt.sample.lab2.Dsl.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_7='grade'
			{
				newLeafNode(otherlv_7, grammarAccess.getClassAccess().getGradeKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getClassAccess().getGradeEStringParserRuleCall_5_1_0());
					}
					lv_grade_8_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getClassRule());
						}
						set(
							$current,
							"grade",
							lv_grade_8_0,
							"org.rm2pt.sample.lab2.Dsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_9='teacher'
			{
				newLeafNode(otherlv_9, grammarAccess.getClassAccess().getTeacherKeyword_6_0());
			}
			otherlv_10='{'
			{
				newLeafNode(otherlv_10, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_6_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getClassAccess().getTeacherTeacherParserRuleCall_6_2_0());
					}
					lv_teacher_11_0=ruleTeacher
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getClassRule());
						}
						add(
							$current,
							"teacher",
							lv_teacher_11_0,
							"org.rm2pt.sample.lab2.Dsl.Teacher");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_12=','
				{
					newLeafNode(otherlv_12, grammarAccess.getClassAccess().getCommaKeyword_6_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getClassAccess().getTeacherTeacherParserRuleCall_6_3_1_0());
						}
						lv_teacher_13_0=ruleTeacher
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getClassRule());
							}
							add(
								$current,
								"teacher",
								lv_teacher_13_0,
								"org.rm2pt.sample.lab2.Dsl.Teacher");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_14='}'
			{
				newLeafNode(otherlv_14, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6_4());
			}
		)?
		(
			otherlv_15='student'
			{
				newLeafNode(otherlv_15, grammarAccess.getClassAccess().getStudentKeyword_7_0());
			}
			otherlv_16='{'
			{
				newLeafNode(otherlv_16, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_7_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getClassAccess().getStudentStudentParserRuleCall_7_2_0());
					}
					lv_student_17_0=ruleStudent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getClassRule());
						}
						add(
							$current,
							"student",
							lv_student_17_0,
							"org.rm2pt.sample.lab2.Dsl.Student");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_18=','
				{
					newLeafNode(otherlv_18, grammarAccess.getClassAccess().getCommaKeyword_7_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getClassAccess().getStudentStudentParserRuleCall_7_3_1_0());
						}
						lv_student_19_0=ruleStudent
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getClassRule());
							}
							add(
								$current,
								"student",
								lv_student_19_0,
								"org.rm2pt.sample.lab2.Dsl.Student");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_20='}'
			{
				newLeafNode(otherlv_20, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7_4());
			}
		)?
		otherlv_21='}'
		{
			newLeafNode(otherlv_21, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleTeacher
entryRuleTeacher returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTeacherRule()); }
	iv_ruleTeacher=ruleTeacher
	{ $current=$iv_ruleTeacher.current; }
	EOF;

// Rule Teacher
ruleTeacher returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Teacher'
		{
			newLeafNode(otherlv_0, grammarAccess.getTeacherAccess().getTeacherKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTeacherAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTeacherRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.rm2pt.sample.lab2.Dsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getTeacherAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='id'
			{
				newLeafNode(otherlv_3, grammarAccess.getTeacherAccess().getIdKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTeacherAccess().getIdEStringParserRuleCall_3_1_0());
					}
					lv_id_4_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTeacherRule());
						}
						set(
							$current,
							"id",
							lv_id_4_0,
							"org.rm2pt.sample.lab2.Dsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='classid'
			{
				newLeafNode(otherlv_5, grammarAccess.getTeacherAccess().getClassidKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTeacherAccess().getClassidEStringParserRuleCall_4_1_0());
					}
					lv_classid_6_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTeacherRule());
						}
						set(
							$current,
							"classid",
							lv_classid_6_0,
							"org.rm2pt.sample.lab2.Dsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_7='correct'
		{
			newLeafNode(otherlv_7, grammarAccess.getTeacherAccess().getCorrectKeyword_5());
		}
		otherlv_8='('
		{
			newLeafNode(otherlv_8, grammarAccess.getTeacherAccess().getLeftParenthesisKeyword_6());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTeacherRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTeacherAccess().getCorrectSubmitedPaperCrossReference_7_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_10=','
			{
				newLeafNode(otherlv_10, grammarAccess.getTeacherAccess().getCommaKeyword_8_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTeacherRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getTeacherAccess().getCorrectSubmitedPaperCrossReference_8_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_12=')'
		{
			newLeafNode(otherlv_12, grammarAccess.getTeacherAccess().getRightParenthesisKeyword_9());
		}
		(
			otherlv_13='teaching'
			{
				newLeafNode(otherlv_13, grammarAccess.getTeacherAccess().getTeachingKeyword_10_0());
			}
			otherlv_14='{'
			{
				newLeafNode(otherlv_14, grammarAccess.getTeacherAccess().getLeftCurlyBracketKeyword_10_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTeacherAccess().getTeachingCourseParserRuleCall_10_2_0());
					}
					lv_teaching_15_0=ruleCourse
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTeacherRule());
						}
						add(
							$current,
							"teaching",
							lv_teaching_15_0,
							"org.rm2pt.sample.lab2.Dsl.Course");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_16=','
				{
					newLeafNode(otherlv_16, grammarAccess.getTeacherAccess().getCommaKeyword_10_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getTeacherAccess().getTeachingCourseParserRuleCall_10_3_1_0());
						}
						lv_teaching_17_0=ruleCourse
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTeacherRule());
							}
							add(
								$current,
								"teaching",
								lv_teaching_17_0,
								"org.rm2pt.sample.lab2.Dsl.Course");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_18='}'
			{
				newLeafNode(otherlv_18, grammarAccess.getTeacherAccess().getRightCurlyBracketKeyword_10_4());
			}
		)?
		(
			otherlv_19='input'
			{
				newLeafNode(otherlv_19, grammarAccess.getTeacherAccess().getInputKeyword_11_0());
			}
			otherlv_20='{'
			{
				newLeafNode(otherlv_20, grammarAccess.getTeacherAccess().getLeftCurlyBracketKeyword_11_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTeacherAccess().getInputReportCardParserRuleCall_11_2_0());
					}
					lv_input_21_0=ruleReportCard
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTeacherRule());
						}
						add(
							$current,
							"input",
							lv_input_21_0,
							"org.rm2pt.sample.lab2.Dsl.ReportCard");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_22=','
				{
					newLeafNode(otherlv_22, grammarAccess.getTeacherAccess().getCommaKeyword_11_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getTeacherAccess().getInputReportCardParserRuleCall_11_3_1_0());
						}
						lv_input_23_0=ruleReportCard
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTeacherRule());
							}
							add(
								$current,
								"input",
								lv_input_23_0,
								"org.rm2pt.sample.lab2.Dsl.ReportCard");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_24='}'
			{
				newLeafNode(otherlv_24, grammarAccess.getTeacherAccess().getRightCurlyBracketKeyword_11_4());
			}
		)?
		otherlv_25='}'
		{
			newLeafNode(otherlv_25, grammarAccess.getTeacherAccess().getRightCurlyBracketKeyword_12());
		}
	)
;

// Entry rule entryRuleStudent
entryRuleStudent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStudentRule()); }
	iv_ruleStudent=ruleStudent
	{ $current=$iv_ruleStudent.current; }
	EOF;

// Rule Student
ruleStudent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Student'
		{
			newLeafNode(otherlv_0, grammarAccess.getStudentAccess().getStudentKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStudentAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStudentRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.rm2pt.sample.lab2.Dsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getStudentAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='id'
			{
				newLeafNode(otherlv_3, grammarAccess.getStudentAccess().getIdKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStudentAccess().getIdEStringParserRuleCall_3_1_0());
					}
					lv_id_4_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStudentRule());
						}
						set(
							$current,
							"id",
							lv_id_4_0,
							"org.rm2pt.sample.lab2.Dsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='classid'
			{
				newLeafNode(otherlv_5, grammarAccess.getStudentAccess().getClassidKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStudentAccess().getClassidEStringParserRuleCall_4_1_0());
					}
					lv_classid_6_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStudentRule());
						}
						set(
							$current,
							"classid",
							lv_classid_6_0,
							"org.rm2pt.sample.lab2.Dsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_7='have'
		{
			newLeafNode(otherlv_7, grammarAccess.getStudentAccess().getHaveKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStudentRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getStudentAccess().getHaveReportCardCrossReference_6_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_9='answer'
			{
				newLeafNode(otherlv_9, grammarAccess.getStudentAccess().getAnswerKeyword_7_0());
			}
			otherlv_10='{'
			{
				newLeafNode(otherlv_10, grammarAccess.getStudentAccess().getLeftCurlyBracketKeyword_7_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStudentAccess().getAnswerExamPaperParserRuleCall_7_2_0());
					}
					lv_answer_11_0=ruleExamPaper
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStudentRule());
						}
						add(
							$current,
							"answer",
							lv_answer_11_0,
							"org.rm2pt.sample.lab2.Dsl.ExamPaper");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_12=','
				{
					newLeafNode(otherlv_12, grammarAccess.getStudentAccess().getCommaKeyword_7_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStudentAccess().getAnswerExamPaperParserRuleCall_7_3_1_0());
						}
						lv_answer_13_0=ruleExamPaper
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStudentRule());
							}
							add(
								$current,
								"answer",
								lv_answer_13_0,
								"org.rm2pt.sample.lab2.Dsl.ExamPaper");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_14='}'
			{
				newLeafNode(otherlv_14, grammarAccess.getStudentAccess().getRightCurlyBracketKeyword_7_4());
			}
		)?
		otherlv_15='}'
		{
			newLeafNode(otherlv_15, grammarAccess.getStudentAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleCourse
entryRuleCourse returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCourseRule()); }
	iv_ruleCourse=ruleCourse
	{ $current=$iv_ruleCourse.current; }
	EOF;

// Rule Course
ruleCourse returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getCourseAccess().getCourseAction_0(),
					$current);
			}
		)
		otherlv_1='Course'
		{
			newLeafNode(otherlv_1, grammarAccess.getCourseAccess().getCourseKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCourseAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCourseRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.rm2pt.sample.lab2.Dsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='id'
			{
				newLeafNode(otherlv_4, grammarAccess.getCourseAccess().getIdKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCourseAccess().getIdEStringParserRuleCall_4_1_0());
					}
					lv_id_5_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCourseRule());
						}
						set(
							$current,
							"id",
							lv_id_5_0,
							"org.rm2pt.sample.lab2.Dsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_6='stunum'
			{
				newLeafNode(otherlv_6, grammarAccess.getCourseAccess().getStunumKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCourseAccess().getStunumEIntParserRuleCall_5_1_0());
					}
					lv_stunum_7_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCourseRule());
						}
						set(
							$current,
							"stunum",
							lv_stunum_7_0,
							"org.rm2pt.sample.lab2.Dsl.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_8='mean'
			{
				newLeafNode(otherlv_8, grammarAccess.getCourseAccess().getMeanKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCourseAccess().getMeanEFloatParserRuleCall_6_1_0());
					}
					lv_mean_9_0=ruleEFloat
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCourseRule());
						}
						set(
							$current,
							"mean",
							lv_mean_9_0,
							"org.rm2pt.sample.lab2.Dsl.EFloat");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleReportCard
entryRuleReportCard returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReportCardRule()); }
	iv_ruleReportCard=ruleReportCard
	{ $current=$iv_ruleReportCard.current; }
	EOF;

// Rule ReportCard
ruleReportCard returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getReportCardAccess().getReportCardAction_0(),
					$current);
			}
		)
		otherlv_1='ReportCard'
		{
			newLeafNode(otherlv_1, grammarAccess.getReportCardAccess().getReportCardKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getReportCardAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='id'
			{
				newLeafNode(otherlv_3, grammarAccess.getReportCardAccess().getIdKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getReportCardAccess().getIdEStringParserRuleCall_3_1_0());
					}
					lv_id_4_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getReportCardRule());
						}
						set(
							$current,
							"id",
							lv_id_4_0,
							"org.rm2pt.sample.lab2.Dsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='stuid'
			{
				newLeafNode(otherlv_5, grammarAccess.getReportCardAccess().getStuidKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getReportCardAccess().getStuidEStringParserRuleCall_4_1_0());
					}
					lv_stuid_6_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getReportCardRule());
						}
						set(
							$current,
							"stuid",
							lv_stuid_6_0,
							"org.rm2pt.sample.lab2.Dsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_7='stuname'
			{
				newLeafNode(otherlv_7, grammarAccess.getReportCardAccess().getStunameKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getReportCardAccess().getStunameEStringParserRuleCall_5_1_0());
					}
					lv_stuname_8_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getReportCardRule());
						}
						set(
							$current,
							"stuname",
							lv_stuname_8_0,
							"org.rm2pt.sample.lab2.Dsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_9='totalscore'
			{
				newLeafNode(otherlv_9, grammarAccess.getReportCardAccess().getTotalscoreKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getReportCardAccess().getTotalscoreEFloatParserRuleCall_6_1_0());
					}
					lv_totalscore_10_0=ruleEFloat
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getReportCardRule());
						}
						set(
							$current,
							"totalscore",
							lv_totalscore_10_0,
							"org.rm2pt.sample.lab2.Dsl.EFloat");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_11='rank'
			{
				newLeafNode(otherlv_11, grammarAccess.getReportCardAccess().getRankKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getReportCardAccess().getRankEIntParserRuleCall_7_1_0());
					}
					lv_rank_12_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getReportCardRule());
						}
						set(
							$current,
							"rank",
							lv_rank_12_0,
							"org.rm2pt.sample.lab2.Dsl.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getReportCardAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleSubmitedPaper
entryRuleSubmitedPaper returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSubmitedPaperRule()); }
	iv_ruleSubmitedPaper=ruleSubmitedPaper
	{ $current=$iv_ruleSubmitedPaper.current; }
	EOF;

// Rule SubmitedPaper
ruleSubmitedPaper returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSubmitedPaperAccess().getSubmitedPaperAction_0(),
					$current);
			}
		)
		(
			(
				lv_ifcorrect_1_0='ifcorrect'
				{
					newLeafNode(lv_ifcorrect_1_0, grammarAccess.getSubmitedPaperAccess().getIfcorrectIfcorrectKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSubmitedPaperRule());
					}
					setWithLastConsumed($current, "ifcorrect", lv_ifcorrect_1_0 != null, "ifcorrect");
				}
			)
		)?
		(
			(
				lv_ifanswer_2_0='ifanswer'
				{
					newLeafNode(lv_ifanswer_2_0, grammarAccess.getSubmitedPaperAccess().getIfanswerIfanswerKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSubmitedPaperRule());
					}
					setWithLastConsumed($current, "ifanswer", lv_ifanswer_2_0 != null, "ifanswer");
				}
			)
		)?
		otherlv_3='SubmitedPaper'
		{
			newLeafNode(otherlv_3, grammarAccess.getSubmitedPaperAccess().getSubmitedPaperKeyword_3());
		}
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getSubmitedPaperAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			otherlv_5='id'
			{
				newLeafNode(otherlv_5, grammarAccess.getSubmitedPaperAccess().getIdKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSubmitedPaperAccess().getIdEStringParserRuleCall_5_1_0());
					}
					lv_id_6_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSubmitedPaperRule());
						}
						set(
							$current,
							"id",
							lv_id_6_0,
							"org.rm2pt.sample.lab2.Dsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_7='stuid'
			{
				newLeafNode(otherlv_7, grammarAccess.getSubmitedPaperAccess().getStuidKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSubmitedPaperAccess().getStuidEStringParserRuleCall_6_1_0());
					}
					lv_stuid_8_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSubmitedPaperRule());
						}
						set(
							$current,
							"stuid",
							lv_stuid_8_0,
							"org.rm2pt.sample.lab2.Dsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_9='teaid'
			{
				newLeafNode(otherlv_9, grammarAccess.getSubmitedPaperAccess().getTeaidKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSubmitedPaperAccess().getTeaidEStringParserRuleCall_7_1_0());
					}
					lv_teaid_10_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSubmitedPaperRule());
						}
						set(
							$current,
							"teaid",
							lv_teaid_10_0,
							"org.rm2pt.sample.lab2.Dsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_11='courseid'
			{
				newLeafNode(otherlv_11, grammarAccess.getSubmitedPaperAccess().getCourseidKeyword_8_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSubmitedPaperAccess().getCourseidEStringParserRuleCall_8_1_0());
					}
					lv_courseid_12_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSubmitedPaperRule());
						}
						set(
							$current,
							"courseid",
							lv_courseid_12_0,
							"org.rm2pt.sample.lab2.Dsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getSubmitedPaperAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleEFloat
entryRuleEFloat returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEFloatRule()); }
	iv_ruleEFloat=ruleEFloat
	{ $current=$iv_ruleEFloat.current.getText(); }
	EOF;

// Rule EFloat
ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
			}
		)?
		(
			this_INT_1=RULE_INT
			{
				$current.merge(this_INT_1);
			}
			{
				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
			}
		)?
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
		}
		this_INT_3=RULE_INT
		{
			$current.merge(this_INT_3);
		}
		{
			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
		}
		(
			(
				kw='E'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
				}
				    |
				kw='e'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
				}
			)
			(
				kw='-'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1());
				}
			)?
			this_INT_7=RULE_INT
			{
				$current.merge(this_INT_7);
			}
			{
				newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2());
			}
		)?
	)
;

// Entry rule entryRuleExamPaper
entryRuleExamPaper returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExamPaperRule()); }
	iv_ruleExamPaper=ruleExamPaper
	{ $current=$iv_ruleExamPaper.current; }
	EOF;

// Rule ExamPaper
ruleExamPaper returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getExamPaperAccess().getExamPaperAction_0(),
					$current);
			}
		)
		(
			(
				lv_ifanswer_1_0='ifanswer'
				{
					newLeafNode(lv_ifanswer_1_0, grammarAccess.getExamPaperAccess().getIfanswerIfanswerKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExamPaperRule());
					}
					setWithLastConsumed($current, "ifanswer", lv_ifanswer_1_0 != null, "ifanswer");
				}
			)
		)?
		(
			(
				lv_ifcorrect_2_0='ifcorrect'
				{
					newLeafNode(lv_ifcorrect_2_0, grammarAccess.getExamPaperAccess().getIfcorrectIfcorrectKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExamPaperRule());
					}
					setWithLastConsumed($current, "ifcorrect", lv_ifcorrect_2_0 != null, "ifcorrect");
				}
			)
		)?
		otherlv_3='ExamPaper'
		{
			newLeafNode(otherlv_3, grammarAccess.getExamPaperAccess().getExamPaperKeyword_3());
		}
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getExamPaperAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			otherlv_5='id'
			{
				newLeafNode(otherlv_5, grammarAccess.getExamPaperAccess().getIdKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExamPaperAccess().getIdEStringParserRuleCall_5_1_0());
					}
					lv_id_6_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExamPaperRule());
						}
						set(
							$current,
							"id",
							lv_id_6_0,
							"org.rm2pt.sample.lab2.Dsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_7='courseid'
			{
				newLeafNode(otherlv_7, grammarAccess.getExamPaperAccess().getCourseidKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExamPaperAccess().getCourseidEStringParserRuleCall_6_1_0());
					}
					lv_courseid_8_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExamPaperRule());
						}
						set(
							$current,
							"courseid",
							lv_courseid_8_0,
							"org.rm2pt.sample.lab2.Dsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_9='teaid'
			{
				newLeafNode(otherlv_9, grammarAccess.getExamPaperAccess().getTeaidKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExamPaperAccess().getTeaidEStringParserRuleCall_7_1_0());
					}
					lv_teaid_10_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExamPaperRule());
						}
						set(
							$current,
							"teaid",
							lv_teaid_10_0,
							"org.rm2pt.sample.lab2.Dsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_11='stuid'
			{
				newLeafNode(otherlv_11, grammarAccess.getExamPaperAccess().getStuidKeyword_8_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExamPaperAccess().getStuidEStringParserRuleCall_8_1_0());
					}
					lv_stuid_12_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExamPaperRule());
						}
						set(
							$current,
							"stuid",
							lv_stuid_12_0,
							"org.rm2pt.sample.lab2.Dsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_13='score'
			{
				newLeafNode(otherlv_13, grammarAccess.getExamPaperAccess().getScoreKeyword_9_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExamPaperAccess().getScoreEFloatParserRuleCall_9_1_0());
					}
					lv_score_14_0=ruleEFloat
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExamPaperRule());
						}
						set(
							$current,
							"score",
							lv_score_14_0,
							"org.rm2pt.sample.lab2.Dsl.EFloat");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_15='submit'
			{
				newLeafNode(otherlv_15, grammarAccess.getExamPaperAccess().getSubmitKeyword_10_0());
			}
			otherlv_16='{'
			{
				newLeafNode(otherlv_16, grammarAccess.getExamPaperAccess().getLeftCurlyBracketKeyword_10_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExamPaperAccess().getSubmitSubmitedPaperParserRuleCall_10_2_0());
					}
					lv_submit_17_0=ruleSubmitedPaper
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExamPaperRule());
						}
						add(
							$current,
							"submit",
							lv_submit_17_0,
							"org.rm2pt.sample.lab2.Dsl.SubmitedPaper");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_18=','
				{
					newLeafNode(otherlv_18, grammarAccess.getExamPaperAccess().getCommaKeyword_10_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getExamPaperAccess().getSubmitSubmitedPaperParserRuleCall_10_3_1_0());
						}
						lv_submit_19_0=ruleSubmitedPaper
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getExamPaperRule());
							}
							add(
								$current,
								"submit",
								lv_submit_19_0,
								"org.rm2pt.sample.lab2.Dsl.SubmitedPaper");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_20='}'
			{
				newLeafNode(otherlv_20, grammarAccess.getExamPaperAccess().getRightCurlyBracketKeyword_10_4());
			}
		)?
		otherlv_21='}'
		{
			newLeafNode(otherlv_21, grammarAccess.getExamPaperAccess().getRightCurlyBracketKeyword_11());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
