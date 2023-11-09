package org.rm2pt.sample.lab2.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.rm2pt.sample.lab2.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'Class'", "'{'", "'}'", "'id'", "'studentnum'", "'grade'", "'teacher'", "','", "'student'", "'-'", "'Teacher'", "'correct'", "'('", "')'", "'classid'", "'teaching'", "'input'", "'Student'", "'have'", "'answer'", "'Course'", "'stunum'", "'mean'", "'ReportCard'", "'stuid'", "'stuname'", "'totalscore'", "'rank'", "'SubmitedPaper'", "'teaid'", "'courseid'", "'.'", "'ExamPaper'", "'score'", "'submit'", "'ifcorrect'", "'ifanswer'"
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

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleClass"
    // InternalDsl.g:53:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleClass EOF )
            // InternalDsl.g:55:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalDsl.g:62:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalDsl.g:67:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalDsl.g:67:2: ( ( rule__Class__Group__0 ) )
            // InternalDsl.g:68:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalDsl.g:69:3: ( rule__Class__Group__0 )
            // InternalDsl.g:69:4: rule__Class__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleEString"
    // InternalDsl.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleEString EOF )
            // InternalDsl.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDsl.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalDsl.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDsl.g:94:3: ( rule__EString__Alternatives )
            // InternalDsl.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalDsl.g:103:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleEInt EOF )
            // InternalDsl.g:105:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDsl.g:112:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalDsl.g:117:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalDsl.g:117:2: ( ( rule__EInt__Group__0 ) )
            // InternalDsl.g:118:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalDsl.g:119:3: ( rule__EInt__Group__0 )
            // InternalDsl.g:119:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleTeacher"
    // InternalDsl.g:128:1: entryRuleTeacher : ruleTeacher EOF ;
    public final void entryRuleTeacher() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleTeacher EOF )
            // InternalDsl.g:130:1: ruleTeacher EOF
            {
             before(grammarAccess.getTeacherRule()); 
            pushFollow(FOLLOW_1);
            ruleTeacher();

            state._fsp--;

             after(grammarAccess.getTeacherRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTeacher"


    // $ANTLR start "ruleTeacher"
    // InternalDsl.g:137:1: ruleTeacher : ( ( rule__Teacher__Group__0 ) ) ;
    public final void ruleTeacher() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__Teacher__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__Teacher__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__Teacher__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__Teacher__Group__0 )
            {
             before(grammarAccess.getTeacherAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__Teacher__Group__0 )
            // InternalDsl.g:144:4: rule__Teacher__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTeacher"


    // $ANTLR start "entryRuleStudent"
    // InternalDsl.g:153:1: entryRuleStudent : ruleStudent EOF ;
    public final void entryRuleStudent() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleStudent EOF )
            // InternalDsl.g:155:1: ruleStudent EOF
            {
             before(grammarAccess.getStudentRule()); 
            pushFollow(FOLLOW_1);
            ruleStudent();

            state._fsp--;

             after(grammarAccess.getStudentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStudent"


    // $ANTLR start "ruleStudent"
    // InternalDsl.g:162:1: ruleStudent : ( ( rule__Student__Group__0 ) ) ;
    public final void ruleStudent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__Student__Group__0 ) ) )
            // InternalDsl.g:167:2: ( ( rule__Student__Group__0 ) )
            {
            // InternalDsl.g:167:2: ( ( rule__Student__Group__0 ) )
            // InternalDsl.g:168:3: ( rule__Student__Group__0 )
            {
             before(grammarAccess.getStudentAccess().getGroup()); 
            // InternalDsl.g:169:3: ( rule__Student__Group__0 )
            // InternalDsl.g:169:4: rule__Student__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Student__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStudent"


    // $ANTLR start "entryRuleCourse"
    // InternalDsl.g:178:1: entryRuleCourse : ruleCourse EOF ;
    public final void entryRuleCourse() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleCourse EOF )
            // InternalDsl.g:180:1: ruleCourse EOF
            {
             before(grammarAccess.getCourseRule()); 
            pushFollow(FOLLOW_1);
            ruleCourse();

            state._fsp--;

             after(grammarAccess.getCourseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCourse"


    // $ANTLR start "ruleCourse"
    // InternalDsl.g:187:1: ruleCourse : ( ( rule__Course__Group__0 ) ) ;
    public final void ruleCourse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__Course__Group__0 ) ) )
            // InternalDsl.g:192:2: ( ( rule__Course__Group__0 ) )
            {
            // InternalDsl.g:192:2: ( ( rule__Course__Group__0 ) )
            // InternalDsl.g:193:3: ( rule__Course__Group__0 )
            {
             before(grammarAccess.getCourseAccess().getGroup()); 
            // InternalDsl.g:194:3: ( rule__Course__Group__0 )
            // InternalDsl.g:194:4: rule__Course__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Course__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCourse"


    // $ANTLR start "entryRuleReportCard"
    // InternalDsl.g:203:1: entryRuleReportCard : ruleReportCard EOF ;
    public final void entryRuleReportCard() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleReportCard EOF )
            // InternalDsl.g:205:1: ruleReportCard EOF
            {
             before(grammarAccess.getReportCardRule()); 
            pushFollow(FOLLOW_1);
            ruleReportCard();

            state._fsp--;

             after(grammarAccess.getReportCardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReportCard"


    // $ANTLR start "ruleReportCard"
    // InternalDsl.g:212:1: ruleReportCard : ( ( rule__ReportCard__Group__0 ) ) ;
    public final void ruleReportCard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__ReportCard__Group__0 ) ) )
            // InternalDsl.g:217:2: ( ( rule__ReportCard__Group__0 ) )
            {
            // InternalDsl.g:217:2: ( ( rule__ReportCard__Group__0 ) )
            // InternalDsl.g:218:3: ( rule__ReportCard__Group__0 )
            {
             before(grammarAccess.getReportCardAccess().getGroup()); 
            // InternalDsl.g:219:3: ( rule__ReportCard__Group__0 )
            // InternalDsl.g:219:4: rule__ReportCard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReportCard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReportCardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReportCard"


    // $ANTLR start "entryRuleSubmitedPaper"
    // InternalDsl.g:228:1: entryRuleSubmitedPaper : ruleSubmitedPaper EOF ;
    public final void entryRuleSubmitedPaper() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( ruleSubmitedPaper EOF )
            // InternalDsl.g:230:1: ruleSubmitedPaper EOF
            {
             before(grammarAccess.getSubmitedPaperRule()); 
            pushFollow(FOLLOW_1);
            ruleSubmitedPaper();

            state._fsp--;

             after(grammarAccess.getSubmitedPaperRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubmitedPaper"


    // $ANTLR start "ruleSubmitedPaper"
    // InternalDsl.g:237:1: ruleSubmitedPaper : ( ( rule__SubmitedPaper__Group__0 ) ) ;
    public final void ruleSubmitedPaper() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__SubmitedPaper__Group__0 ) ) )
            // InternalDsl.g:242:2: ( ( rule__SubmitedPaper__Group__0 ) )
            {
            // InternalDsl.g:242:2: ( ( rule__SubmitedPaper__Group__0 ) )
            // InternalDsl.g:243:3: ( rule__SubmitedPaper__Group__0 )
            {
             before(grammarAccess.getSubmitedPaperAccess().getGroup()); 
            // InternalDsl.g:244:3: ( rule__SubmitedPaper__Group__0 )
            // InternalDsl.g:244:4: rule__SubmitedPaper__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubmitedPaper__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubmitedPaperAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubmitedPaper"


    // $ANTLR start "entryRuleEFloat"
    // InternalDsl.g:253:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( ruleEFloat EOF )
            // InternalDsl.g:255:1: ruleEFloat EOF
            {
             before(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEFloatRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalDsl.g:262:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalDsl.g:267:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalDsl.g:267:2: ( ( rule__EFloat__Group__0 ) )
            // InternalDsl.g:268:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalDsl.g:269:3: ( rule__EFloat__Group__0 )
            // InternalDsl.g:269:4: rule__EFloat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleExamPaper"
    // InternalDsl.g:278:1: entryRuleExamPaper : ruleExamPaper EOF ;
    public final void entryRuleExamPaper() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( ruleExamPaper EOF )
            // InternalDsl.g:280:1: ruleExamPaper EOF
            {
             before(grammarAccess.getExamPaperRule()); 
            pushFollow(FOLLOW_1);
            ruleExamPaper();

            state._fsp--;

             after(grammarAccess.getExamPaperRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExamPaper"


    // $ANTLR start "ruleExamPaper"
    // InternalDsl.g:287:1: ruleExamPaper : ( ( rule__ExamPaper__Group__0 ) ) ;
    public final void ruleExamPaper() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ( rule__ExamPaper__Group__0 ) ) )
            // InternalDsl.g:292:2: ( ( rule__ExamPaper__Group__0 ) )
            {
            // InternalDsl.g:292:2: ( ( rule__ExamPaper__Group__0 ) )
            // InternalDsl.g:293:3: ( rule__ExamPaper__Group__0 )
            {
             before(grammarAccess.getExamPaperAccess().getGroup()); 
            // InternalDsl.g:294:3: ( rule__ExamPaper__Group__0 )
            // InternalDsl.g:294:4: rule__ExamPaper__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExamPaper__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExamPaperAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExamPaper"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalDsl.g:302:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:306:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:307:2: ( RULE_STRING )
                    {
                    // InternalDsl.g:307:2: ( RULE_STRING )
                    // InternalDsl.g:308:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:313:2: ( RULE_ID )
                    {
                    // InternalDsl.g:313:2: ( RULE_ID )
                    // InternalDsl.g:314:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EFloat__Alternatives_4_0"
    // InternalDsl.g:323:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:327:1: ( ( 'E' ) | ( 'e' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:328:2: ( 'E' )
                    {
                    // InternalDsl.g:328:2: ( 'E' )
                    // InternalDsl.g:329:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:334:2: ( 'e' )
                    {
                    // InternalDsl.g:334:2: ( 'e' )
                    // InternalDsl.g:335:3: 'e'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Alternatives_4_0"


    // $ANTLR start "rule__Class__Group__0"
    // InternalDsl.g:344:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:348:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalDsl.g:349:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // InternalDsl.g:356:1: rule__Class__Group__0__Impl : ( () ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:360:1: ( ( () ) )
            // InternalDsl.g:361:1: ( () )
            {
            // InternalDsl.g:361:1: ( () )
            // InternalDsl.g:362:2: ()
            {
             before(grammarAccess.getClassAccess().getClassAction_0()); 
            // InternalDsl.g:363:2: ()
            // InternalDsl.g:363:3: 
            {
            }

             after(grammarAccess.getClassAccess().getClassAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // InternalDsl.g:371:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:375:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalDsl.g:376:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // InternalDsl.g:383:1: rule__Class__Group__1__Impl : ( 'Class' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:387:1: ( ( 'Class' ) )
            // InternalDsl.g:388:1: ( 'Class' )
            {
            // InternalDsl.g:388:1: ( 'Class' )
            // InternalDsl.g:389:2: 'Class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getClassKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // InternalDsl.g:398:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:402:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalDsl.g:403:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // InternalDsl.g:410:1: rule__Class__Group__2__Impl : ( '{' ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:414:1: ( ( '{' ) )
            // InternalDsl.g:415:1: ( '{' )
            {
            // InternalDsl.g:415:1: ( '{' )
            // InternalDsl.g:416:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // InternalDsl.g:425:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:429:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalDsl.g:430:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // InternalDsl.g:437:1: rule__Class__Group__3__Impl : ( ( rule__Class__Group_3__0 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:441:1: ( ( ( rule__Class__Group_3__0 )? ) )
            // InternalDsl.g:442:1: ( ( rule__Class__Group_3__0 )? )
            {
            // InternalDsl.g:442:1: ( ( rule__Class__Group_3__0 )? )
            // InternalDsl.g:443:2: ( rule__Class__Group_3__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_3()); 
            // InternalDsl.g:444:2: ( rule__Class__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:444:3: rule__Class__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // InternalDsl.g:452:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:456:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalDsl.g:457:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // InternalDsl.g:464:1: rule__Class__Group__4__Impl : ( ( rule__Class__Group_4__0 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:468:1: ( ( ( rule__Class__Group_4__0 )? ) )
            // InternalDsl.g:469:1: ( ( rule__Class__Group_4__0 )? )
            {
            // InternalDsl.g:469:1: ( ( rule__Class__Group_4__0 )? )
            // InternalDsl.g:470:2: ( rule__Class__Group_4__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_4()); 
            // InternalDsl.g:471:2: ( rule__Class__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:471:3: rule__Class__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__5"
    // InternalDsl.g:479:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:483:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalDsl.g:484:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Class__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5"


    // $ANTLR start "rule__Class__Group__5__Impl"
    // InternalDsl.g:491:1: rule__Class__Group__5__Impl : ( ( rule__Class__Group_5__0 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:495:1: ( ( ( rule__Class__Group_5__0 )? ) )
            // InternalDsl.g:496:1: ( ( rule__Class__Group_5__0 )? )
            {
            // InternalDsl.g:496:1: ( ( rule__Class__Group_5__0 )? )
            // InternalDsl.g:497:2: ( rule__Class__Group_5__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_5()); 
            // InternalDsl.g:498:2: ( rule__Class__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:498:3: rule__Class__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5__Impl"


    // $ANTLR start "rule__Class__Group__6"
    // InternalDsl.g:506:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:510:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // InternalDsl.g:511:2: rule__Class__Group__6__Impl rule__Class__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Class__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6"


    // $ANTLR start "rule__Class__Group__6__Impl"
    // InternalDsl.g:518:1: rule__Class__Group__6__Impl : ( ( rule__Class__Group_6__0 )? ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:522:1: ( ( ( rule__Class__Group_6__0 )? ) )
            // InternalDsl.g:523:1: ( ( rule__Class__Group_6__0 )? )
            {
            // InternalDsl.g:523:1: ( ( rule__Class__Group_6__0 )? )
            // InternalDsl.g:524:2: ( rule__Class__Group_6__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_6()); 
            // InternalDsl.g:525:2: ( rule__Class__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:525:3: rule__Class__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6__Impl"


    // $ANTLR start "rule__Class__Group__7"
    // InternalDsl.g:533:1: rule__Class__Group__7 : rule__Class__Group__7__Impl rule__Class__Group__8 ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:537:1: ( rule__Class__Group__7__Impl rule__Class__Group__8 )
            // InternalDsl.g:538:2: rule__Class__Group__7__Impl rule__Class__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__Class__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__7"


    // $ANTLR start "rule__Class__Group__7__Impl"
    // InternalDsl.g:545:1: rule__Class__Group__7__Impl : ( ( rule__Class__Group_7__0 )? ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:549:1: ( ( ( rule__Class__Group_7__0 )? ) )
            // InternalDsl.g:550:1: ( ( rule__Class__Group_7__0 )? )
            {
            // InternalDsl.g:550:1: ( ( rule__Class__Group_7__0 )? )
            // InternalDsl.g:551:2: ( rule__Class__Group_7__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_7()); 
            // InternalDsl.g:552:2: ( rule__Class__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:552:3: rule__Class__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__7__Impl"


    // $ANTLR start "rule__Class__Group__8"
    // InternalDsl.g:560:1: rule__Class__Group__8 : rule__Class__Group__8__Impl ;
    public final void rule__Class__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:564:1: ( rule__Class__Group__8__Impl )
            // InternalDsl.g:565:2: rule__Class__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__8"


    // $ANTLR start "rule__Class__Group__8__Impl"
    // InternalDsl.g:571:1: rule__Class__Group__8__Impl : ( '}' ) ;
    public final void rule__Class__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:575:1: ( ( '}' ) )
            // InternalDsl.g:576:1: ( '}' )
            {
            // InternalDsl.g:576:1: ( '}' )
            // InternalDsl.g:577:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__8__Impl"


    // $ANTLR start "rule__Class__Group_3__0"
    // InternalDsl.g:587:1: rule__Class__Group_3__0 : rule__Class__Group_3__0__Impl rule__Class__Group_3__1 ;
    public final void rule__Class__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:591:1: ( rule__Class__Group_3__0__Impl rule__Class__Group_3__1 )
            // InternalDsl.g:592:2: rule__Class__Group_3__0__Impl rule__Class__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Class__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__0"


    // $ANTLR start "rule__Class__Group_3__0__Impl"
    // InternalDsl.g:599:1: rule__Class__Group_3__0__Impl : ( 'id' ) ;
    public final void rule__Class__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:603:1: ( ( 'id' ) )
            // InternalDsl.g:604:1: ( 'id' )
            {
            // InternalDsl.g:604:1: ( 'id' )
            // InternalDsl.g:605:2: 'id'
            {
             before(grammarAccess.getClassAccess().getIdKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getIdKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__0__Impl"


    // $ANTLR start "rule__Class__Group_3__1"
    // InternalDsl.g:614:1: rule__Class__Group_3__1 : rule__Class__Group_3__1__Impl ;
    public final void rule__Class__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:618:1: ( rule__Class__Group_3__1__Impl )
            // InternalDsl.g:619:2: rule__Class__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__1"


    // $ANTLR start "rule__Class__Group_3__1__Impl"
    // InternalDsl.g:625:1: rule__Class__Group_3__1__Impl : ( ( rule__Class__IdAssignment_3_1 ) ) ;
    public final void rule__Class__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:629:1: ( ( ( rule__Class__IdAssignment_3_1 ) ) )
            // InternalDsl.g:630:1: ( ( rule__Class__IdAssignment_3_1 ) )
            {
            // InternalDsl.g:630:1: ( ( rule__Class__IdAssignment_3_1 ) )
            // InternalDsl.g:631:2: ( rule__Class__IdAssignment_3_1 )
            {
             before(grammarAccess.getClassAccess().getIdAssignment_3_1()); 
            // InternalDsl.g:632:2: ( rule__Class__IdAssignment_3_1 )
            // InternalDsl.g:632:3: rule__Class__IdAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__IdAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getIdAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__1__Impl"


    // $ANTLR start "rule__Class__Group_4__0"
    // InternalDsl.g:641:1: rule__Class__Group_4__0 : rule__Class__Group_4__0__Impl rule__Class__Group_4__1 ;
    public final void rule__Class__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:645:1: ( rule__Class__Group_4__0__Impl rule__Class__Group_4__1 )
            // InternalDsl.g:646:2: rule__Class__Group_4__0__Impl rule__Class__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__Class__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__0"


    // $ANTLR start "rule__Class__Group_4__0__Impl"
    // InternalDsl.g:653:1: rule__Class__Group_4__0__Impl : ( 'studentnum' ) ;
    public final void rule__Class__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:657:1: ( ( 'studentnum' ) )
            // InternalDsl.g:658:1: ( 'studentnum' )
            {
            // InternalDsl.g:658:1: ( 'studentnum' )
            // InternalDsl.g:659:2: 'studentnum'
            {
             before(grammarAccess.getClassAccess().getStudentnumKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getStudentnumKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__0__Impl"


    // $ANTLR start "rule__Class__Group_4__1"
    // InternalDsl.g:668:1: rule__Class__Group_4__1 : rule__Class__Group_4__1__Impl ;
    public final void rule__Class__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:672:1: ( rule__Class__Group_4__1__Impl )
            // InternalDsl.g:673:2: rule__Class__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__1"


    // $ANTLR start "rule__Class__Group_4__1__Impl"
    // InternalDsl.g:679:1: rule__Class__Group_4__1__Impl : ( ( rule__Class__StudentnumAssignment_4_1 ) ) ;
    public final void rule__Class__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:683:1: ( ( ( rule__Class__StudentnumAssignment_4_1 ) ) )
            // InternalDsl.g:684:1: ( ( rule__Class__StudentnumAssignment_4_1 ) )
            {
            // InternalDsl.g:684:1: ( ( rule__Class__StudentnumAssignment_4_1 ) )
            // InternalDsl.g:685:2: ( rule__Class__StudentnumAssignment_4_1 )
            {
             before(grammarAccess.getClassAccess().getStudentnumAssignment_4_1()); 
            // InternalDsl.g:686:2: ( rule__Class__StudentnumAssignment_4_1 )
            // InternalDsl.g:686:3: rule__Class__StudentnumAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__StudentnumAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getStudentnumAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__1__Impl"


    // $ANTLR start "rule__Class__Group_5__0"
    // InternalDsl.g:695:1: rule__Class__Group_5__0 : rule__Class__Group_5__0__Impl rule__Class__Group_5__1 ;
    public final void rule__Class__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:699:1: ( rule__Class__Group_5__0__Impl rule__Class__Group_5__1 )
            // InternalDsl.g:700:2: rule__Class__Group_5__0__Impl rule__Class__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__Class__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__0"


    // $ANTLR start "rule__Class__Group_5__0__Impl"
    // InternalDsl.g:707:1: rule__Class__Group_5__0__Impl : ( 'grade' ) ;
    public final void rule__Class__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:711:1: ( ( 'grade' ) )
            // InternalDsl.g:712:1: ( 'grade' )
            {
            // InternalDsl.g:712:1: ( 'grade' )
            // InternalDsl.g:713:2: 'grade'
            {
             before(grammarAccess.getClassAccess().getGradeKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getGradeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__0__Impl"


    // $ANTLR start "rule__Class__Group_5__1"
    // InternalDsl.g:722:1: rule__Class__Group_5__1 : rule__Class__Group_5__1__Impl ;
    public final void rule__Class__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:726:1: ( rule__Class__Group_5__1__Impl )
            // InternalDsl.g:727:2: rule__Class__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__1"


    // $ANTLR start "rule__Class__Group_5__1__Impl"
    // InternalDsl.g:733:1: rule__Class__Group_5__1__Impl : ( ( rule__Class__GradeAssignment_5_1 ) ) ;
    public final void rule__Class__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:737:1: ( ( ( rule__Class__GradeAssignment_5_1 ) ) )
            // InternalDsl.g:738:1: ( ( rule__Class__GradeAssignment_5_1 ) )
            {
            // InternalDsl.g:738:1: ( ( rule__Class__GradeAssignment_5_1 ) )
            // InternalDsl.g:739:2: ( rule__Class__GradeAssignment_5_1 )
            {
             before(grammarAccess.getClassAccess().getGradeAssignment_5_1()); 
            // InternalDsl.g:740:2: ( rule__Class__GradeAssignment_5_1 )
            // InternalDsl.g:740:3: rule__Class__GradeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__GradeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGradeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__1__Impl"


    // $ANTLR start "rule__Class__Group_6__0"
    // InternalDsl.g:749:1: rule__Class__Group_6__0 : rule__Class__Group_6__0__Impl rule__Class__Group_6__1 ;
    public final void rule__Class__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:753:1: ( rule__Class__Group_6__0__Impl rule__Class__Group_6__1 )
            // InternalDsl.g:754:2: rule__Class__Group_6__0__Impl rule__Class__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Class__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__0"


    // $ANTLR start "rule__Class__Group_6__0__Impl"
    // InternalDsl.g:761:1: rule__Class__Group_6__0__Impl : ( 'teacher' ) ;
    public final void rule__Class__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:765:1: ( ( 'teacher' ) )
            // InternalDsl.g:766:1: ( 'teacher' )
            {
            // InternalDsl.g:766:1: ( 'teacher' )
            // InternalDsl.g:767:2: 'teacher'
            {
             before(grammarAccess.getClassAccess().getTeacherKeyword_6_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getTeacherKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__0__Impl"


    // $ANTLR start "rule__Class__Group_6__1"
    // InternalDsl.g:776:1: rule__Class__Group_6__1 : rule__Class__Group_6__1__Impl rule__Class__Group_6__2 ;
    public final void rule__Class__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:780:1: ( rule__Class__Group_6__1__Impl rule__Class__Group_6__2 )
            // InternalDsl.g:781:2: rule__Class__Group_6__1__Impl rule__Class__Group_6__2
            {
            pushFollow(FOLLOW_8);
            rule__Class__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__1"


    // $ANTLR start "rule__Class__Group_6__1__Impl"
    // InternalDsl.g:788:1: rule__Class__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Class__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:792:1: ( ( '{' ) )
            // InternalDsl.g:793:1: ( '{' )
            {
            // InternalDsl.g:793:1: ( '{' )
            // InternalDsl.g:794:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__1__Impl"


    // $ANTLR start "rule__Class__Group_6__2"
    // InternalDsl.g:803:1: rule__Class__Group_6__2 : rule__Class__Group_6__2__Impl rule__Class__Group_6__3 ;
    public final void rule__Class__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:807:1: ( rule__Class__Group_6__2__Impl rule__Class__Group_6__3 )
            // InternalDsl.g:808:2: rule__Class__Group_6__2__Impl rule__Class__Group_6__3
            {
            pushFollow(FOLLOW_9);
            rule__Class__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__2"


    // $ANTLR start "rule__Class__Group_6__2__Impl"
    // InternalDsl.g:815:1: rule__Class__Group_6__2__Impl : ( ( rule__Class__TeacherAssignment_6_2 ) ) ;
    public final void rule__Class__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:819:1: ( ( ( rule__Class__TeacherAssignment_6_2 ) ) )
            // InternalDsl.g:820:1: ( ( rule__Class__TeacherAssignment_6_2 ) )
            {
            // InternalDsl.g:820:1: ( ( rule__Class__TeacherAssignment_6_2 ) )
            // InternalDsl.g:821:2: ( rule__Class__TeacherAssignment_6_2 )
            {
             before(grammarAccess.getClassAccess().getTeacherAssignment_6_2()); 
            // InternalDsl.g:822:2: ( rule__Class__TeacherAssignment_6_2 )
            // InternalDsl.g:822:3: rule__Class__TeacherAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__TeacherAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getTeacherAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__2__Impl"


    // $ANTLR start "rule__Class__Group_6__3"
    // InternalDsl.g:830:1: rule__Class__Group_6__3 : rule__Class__Group_6__3__Impl rule__Class__Group_6__4 ;
    public final void rule__Class__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:834:1: ( rule__Class__Group_6__3__Impl rule__Class__Group_6__4 )
            // InternalDsl.g:835:2: rule__Class__Group_6__3__Impl rule__Class__Group_6__4
            {
            pushFollow(FOLLOW_9);
            rule__Class__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__3"


    // $ANTLR start "rule__Class__Group_6__3__Impl"
    // InternalDsl.g:842:1: rule__Class__Group_6__3__Impl : ( ( rule__Class__Group_6_3__0 )* ) ;
    public final void rule__Class__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:846:1: ( ( ( rule__Class__Group_6_3__0 )* ) )
            // InternalDsl.g:847:1: ( ( rule__Class__Group_6_3__0 )* )
            {
            // InternalDsl.g:847:1: ( ( rule__Class__Group_6_3__0 )* )
            // InternalDsl.g:848:2: ( rule__Class__Group_6_3__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_6_3()); 
            // InternalDsl.g:849:2: ( rule__Class__Group_6_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:849:3: rule__Class__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Class__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__3__Impl"


    // $ANTLR start "rule__Class__Group_6__4"
    // InternalDsl.g:857:1: rule__Class__Group_6__4 : rule__Class__Group_6__4__Impl ;
    public final void rule__Class__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:861:1: ( rule__Class__Group_6__4__Impl )
            // InternalDsl.g:862:2: rule__Class__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__4"


    // $ANTLR start "rule__Class__Group_6__4__Impl"
    // InternalDsl.g:868:1: rule__Class__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Class__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:872:1: ( ( '}' ) )
            // InternalDsl.g:873:1: ( '}' )
            {
            // InternalDsl.g:873:1: ( '}' )
            // InternalDsl.g:874:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__4__Impl"


    // $ANTLR start "rule__Class__Group_6_3__0"
    // InternalDsl.g:884:1: rule__Class__Group_6_3__0 : rule__Class__Group_6_3__0__Impl rule__Class__Group_6_3__1 ;
    public final void rule__Class__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:888:1: ( rule__Class__Group_6_3__0__Impl rule__Class__Group_6_3__1 )
            // InternalDsl.g:889:2: rule__Class__Group_6_3__0__Impl rule__Class__Group_6_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Class__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6_3__0"


    // $ANTLR start "rule__Class__Group_6_3__0__Impl"
    // InternalDsl.g:896:1: rule__Class__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:900:1: ( ( ',' ) )
            // InternalDsl.g:901:1: ( ',' )
            {
            // InternalDsl.g:901:1: ( ',' )
            // InternalDsl.g:902:2: ','
            {
             before(grammarAccess.getClassAccess().getCommaKeyword_6_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6_3__0__Impl"


    // $ANTLR start "rule__Class__Group_6_3__1"
    // InternalDsl.g:911:1: rule__Class__Group_6_3__1 : rule__Class__Group_6_3__1__Impl ;
    public final void rule__Class__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:915:1: ( rule__Class__Group_6_3__1__Impl )
            // InternalDsl.g:916:2: rule__Class__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6_3__1"


    // $ANTLR start "rule__Class__Group_6_3__1__Impl"
    // InternalDsl.g:922:1: rule__Class__Group_6_3__1__Impl : ( ( rule__Class__TeacherAssignment_6_3_1 ) ) ;
    public final void rule__Class__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:926:1: ( ( ( rule__Class__TeacherAssignment_6_3_1 ) ) )
            // InternalDsl.g:927:1: ( ( rule__Class__TeacherAssignment_6_3_1 ) )
            {
            // InternalDsl.g:927:1: ( ( rule__Class__TeacherAssignment_6_3_1 ) )
            // InternalDsl.g:928:2: ( rule__Class__TeacherAssignment_6_3_1 )
            {
             before(grammarAccess.getClassAccess().getTeacherAssignment_6_3_1()); 
            // InternalDsl.g:929:2: ( rule__Class__TeacherAssignment_6_3_1 )
            // InternalDsl.g:929:3: rule__Class__TeacherAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__TeacherAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getTeacherAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6_3__1__Impl"


    // $ANTLR start "rule__Class__Group_7__0"
    // InternalDsl.g:938:1: rule__Class__Group_7__0 : rule__Class__Group_7__0__Impl rule__Class__Group_7__1 ;
    public final void rule__Class__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:942:1: ( rule__Class__Group_7__0__Impl rule__Class__Group_7__1 )
            // InternalDsl.g:943:2: rule__Class__Group_7__0__Impl rule__Class__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__Class__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__0"


    // $ANTLR start "rule__Class__Group_7__0__Impl"
    // InternalDsl.g:950:1: rule__Class__Group_7__0__Impl : ( 'student' ) ;
    public final void rule__Class__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:954:1: ( ( 'student' ) )
            // InternalDsl.g:955:1: ( 'student' )
            {
            // InternalDsl.g:955:1: ( 'student' )
            // InternalDsl.g:956:2: 'student'
            {
             before(grammarAccess.getClassAccess().getStudentKeyword_7_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getStudentKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__0__Impl"


    // $ANTLR start "rule__Class__Group_7__1"
    // InternalDsl.g:965:1: rule__Class__Group_7__1 : rule__Class__Group_7__1__Impl rule__Class__Group_7__2 ;
    public final void rule__Class__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:969:1: ( rule__Class__Group_7__1__Impl rule__Class__Group_7__2 )
            // InternalDsl.g:970:2: rule__Class__Group_7__1__Impl rule__Class__Group_7__2
            {
            pushFollow(FOLLOW_11);
            rule__Class__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__1"


    // $ANTLR start "rule__Class__Group_7__1__Impl"
    // InternalDsl.g:977:1: rule__Class__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Class__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:981:1: ( ( '{' ) )
            // InternalDsl.g:982:1: ( '{' )
            {
            // InternalDsl.g:982:1: ( '{' )
            // InternalDsl.g:983:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__1__Impl"


    // $ANTLR start "rule__Class__Group_7__2"
    // InternalDsl.g:992:1: rule__Class__Group_7__2 : rule__Class__Group_7__2__Impl rule__Class__Group_7__3 ;
    public final void rule__Class__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:996:1: ( rule__Class__Group_7__2__Impl rule__Class__Group_7__3 )
            // InternalDsl.g:997:2: rule__Class__Group_7__2__Impl rule__Class__Group_7__3
            {
            pushFollow(FOLLOW_9);
            rule__Class__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__2"


    // $ANTLR start "rule__Class__Group_7__2__Impl"
    // InternalDsl.g:1004:1: rule__Class__Group_7__2__Impl : ( ( rule__Class__StudentAssignment_7_2 ) ) ;
    public final void rule__Class__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1008:1: ( ( ( rule__Class__StudentAssignment_7_2 ) ) )
            // InternalDsl.g:1009:1: ( ( rule__Class__StudentAssignment_7_2 ) )
            {
            // InternalDsl.g:1009:1: ( ( rule__Class__StudentAssignment_7_2 ) )
            // InternalDsl.g:1010:2: ( rule__Class__StudentAssignment_7_2 )
            {
             before(grammarAccess.getClassAccess().getStudentAssignment_7_2()); 
            // InternalDsl.g:1011:2: ( rule__Class__StudentAssignment_7_2 )
            // InternalDsl.g:1011:3: rule__Class__StudentAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__StudentAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getStudentAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__2__Impl"


    // $ANTLR start "rule__Class__Group_7__3"
    // InternalDsl.g:1019:1: rule__Class__Group_7__3 : rule__Class__Group_7__3__Impl rule__Class__Group_7__4 ;
    public final void rule__Class__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1023:1: ( rule__Class__Group_7__3__Impl rule__Class__Group_7__4 )
            // InternalDsl.g:1024:2: rule__Class__Group_7__3__Impl rule__Class__Group_7__4
            {
            pushFollow(FOLLOW_9);
            rule__Class__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__3"


    // $ANTLR start "rule__Class__Group_7__3__Impl"
    // InternalDsl.g:1031:1: rule__Class__Group_7__3__Impl : ( ( rule__Class__Group_7_3__0 )* ) ;
    public final void rule__Class__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1035:1: ( ( ( rule__Class__Group_7_3__0 )* ) )
            // InternalDsl.g:1036:1: ( ( rule__Class__Group_7_3__0 )* )
            {
            // InternalDsl.g:1036:1: ( ( rule__Class__Group_7_3__0 )* )
            // InternalDsl.g:1037:2: ( rule__Class__Group_7_3__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_7_3()); 
            // InternalDsl.g:1038:2: ( rule__Class__Group_7_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:1038:3: rule__Class__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Class__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__3__Impl"


    // $ANTLR start "rule__Class__Group_7__4"
    // InternalDsl.g:1046:1: rule__Class__Group_7__4 : rule__Class__Group_7__4__Impl ;
    public final void rule__Class__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1050:1: ( rule__Class__Group_7__4__Impl )
            // InternalDsl.g:1051:2: rule__Class__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__4"


    // $ANTLR start "rule__Class__Group_7__4__Impl"
    // InternalDsl.g:1057:1: rule__Class__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Class__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1061:1: ( ( '}' ) )
            // InternalDsl.g:1062:1: ( '}' )
            {
            // InternalDsl.g:1062:1: ( '}' )
            // InternalDsl.g:1063:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__4__Impl"


    // $ANTLR start "rule__Class__Group_7_3__0"
    // InternalDsl.g:1073:1: rule__Class__Group_7_3__0 : rule__Class__Group_7_3__0__Impl rule__Class__Group_7_3__1 ;
    public final void rule__Class__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1077:1: ( rule__Class__Group_7_3__0__Impl rule__Class__Group_7_3__1 )
            // InternalDsl.g:1078:2: rule__Class__Group_7_3__0__Impl rule__Class__Group_7_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Class__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7_3__0"


    // $ANTLR start "rule__Class__Group_7_3__0__Impl"
    // InternalDsl.g:1085:1: rule__Class__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1089:1: ( ( ',' ) )
            // InternalDsl.g:1090:1: ( ',' )
            {
            // InternalDsl.g:1090:1: ( ',' )
            // InternalDsl.g:1091:2: ','
            {
             before(grammarAccess.getClassAccess().getCommaKeyword_7_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7_3__0__Impl"


    // $ANTLR start "rule__Class__Group_7_3__1"
    // InternalDsl.g:1100:1: rule__Class__Group_7_3__1 : rule__Class__Group_7_3__1__Impl ;
    public final void rule__Class__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1104:1: ( rule__Class__Group_7_3__1__Impl )
            // InternalDsl.g:1105:2: rule__Class__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7_3__1"


    // $ANTLR start "rule__Class__Group_7_3__1__Impl"
    // InternalDsl.g:1111:1: rule__Class__Group_7_3__1__Impl : ( ( rule__Class__StudentAssignment_7_3_1 ) ) ;
    public final void rule__Class__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1115:1: ( ( ( rule__Class__StudentAssignment_7_3_1 ) ) )
            // InternalDsl.g:1116:1: ( ( rule__Class__StudentAssignment_7_3_1 ) )
            {
            // InternalDsl.g:1116:1: ( ( rule__Class__StudentAssignment_7_3_1 ) )
            // InternalDsl.g:1117:2: ( rule__Class__StudentAssignment_7_3_1 )
            {
             before(grammarAccess.getClassAccess().getStudentAssignment_7_3_1()); 
            // InternalDsl.g:1118:2: ( rule__Class__StudentAssignment_7_3_1 )
            // InternalDsl.g:1118:3: rule__Class__StudentAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__StudentAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getStudentAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7_3__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalDsl.g:1127:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1131:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalDsl.g:1132:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalDsl.g:1139:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1143:1: ( ( ( '-' )? ) )
            // InternalDsl.g:1144:1: ( ( '-' )? )
            {
            // InternalDsl.g:1144:1: ( ( '-' )? )
            // InternalDsl.g:1145:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalDsl.g:1146:2: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:1146:3: '-'
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalDsl.g:1154:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1158:1: ( rule__EInt__Group__1__Impl )
            // InternalDsl.g:1159:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalDsl.g:1165:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1169:1: ( ( RULE_INT ) )
            // InternalDsl.g:1170:1: ( RULE_INT )
            {
            // InternalDsl.g:1170:1: ( RULE_INT )
            // InternalDsl.g:1171:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Teacher__Group__0"
    // InternalDsl.g:1181:1: rule__Teacher__Group__0 : rule__Teacher__Group__0__Impl rule__Teacher__Group__1 ;
    public final void rule__Teacher__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1185:1: ( rule__Teacher__Group__0__Impl rule__Teacher__Group__1 )
            // InternalDsl.g:1186:2: rule__Teacher__Group__0__Impl rule__Teacher__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Teacher__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__0"


    // $ANTLR start "rule__Teacher__Group__0__Impl"
    // InternalDsl.g:1193:1: rule__Teacher__Group__0__Impl : ( 'Teacher' ) ;
    public final void rule__Teacher__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1197:1: ( ( 'Teacher' ) )
            // InternalDsl.g:1198:1: ( 'Teacher' )
            {
            // InternalDsl.g:1198:1: ( 'Teacher' )
            // InternalDsl.g:1199:2: 'Teacher'
            {
             before(grammarAccess.getTeacherAccess().getTeacherKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getTeacherKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__0__Impl"


    // $ANTLR start "rule__Teacher__Group__1"
    // InternalDsl.g:1208:1: rule__Teacher__Group__1 : rule__Teacher__Group__1__Impl rule__Teacher__Group__2 ;
    public final void rule__Teacher__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1212:1: ( rule__Teacher__Group__1__Impl rule__Teacher__Group__2 )
            // InternalDsl.g:1213:2: rule__Teacher__Group__1__Impl rule__Teacher__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Teacher__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__1"


    // $ANTLR start "rule__Teacher__Group__1__Impl"
    // InternalDsl.g:1220:1: rule__Teacher__Group__1__Impl : ( ( rule__Teacher__NameAssignment_1 ) ) ;
    public final void rule__Teacher__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1224:1: ( ( ( rule__Teacher__NameAssignment_1 ) ) )
            // InternalDsl.g:1225:1: ( ( rule__Teacher__NameAssignment_1 ) )
            {
            // InternalDsl.g:1225:1: ( ( rule__Teacher__NameAssignment_1 ) )
            // InternalDsl.g:1226:2: ( rule__Teacher__NameAssignment_1 )
            {
             before(grammarAccess.getTeacherAccess().getNameAssignment_1()); 
            // InternalDsl.g:1227:2: ( rule__Teacher__NameAssignment_1 )
            // InternalDsl.g:1227:3: rule__Teacher__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__1__Impl"


    // $ANTLR start "rule__Teacher__Group__2"
    // InternalDsl.g:1235:1: rule__Teacher__Group__2 : rule__Teacher__Group__2__Impl rule__Teacher__Group__3 ;
    public final void rule__Teacher__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1239:1: ( rule__Teacher__Group__2__Impl rule__Teacher__Group__3 )
            // InternalDsl.g:1240:2: rule__Teacher__Group__2__Impl rule__Teacher__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Teacher__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__2"


    // $ANTLR start "rule__Teacher__Group__2__Impl"
    // InternalDsl.g:1247:1: rule__Teacher__Group__2__Impl : ( '{' ) ;
    public final void rule__Teacher__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1251:1: ( ( '{' ) )
            // InternalDsl.g:1252:1: ( '{' )
            {
            // InternalDsl.g:1252:1: ( '{' )
            // InternalDsl.g:1253:2: '{'
            {
             before(grammarAccess.getTeacherAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__2__Impl"


    // $ANTLR start "rule__Teacher__Group__3"
    // InternalDsl.g:1262:1: rule__Teacher__Group__3 : rule__Teacher__Group__3__Impl rule__Teacher__Group__4 ;
    public final void rule__Teacher__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1266:1: ( rule__Teacher__Group__3__Impl rule__Teacher__Group__4 )
            // InternalDsl.g:1267:2: rule__Teacher__Group__3__Impl rule__Teacher__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Teacher__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__3"


    // $ANTLR start "rule__Teacher__Group__3__Impl"
    // InternalDsl.g:1274:1: rule__Teacher__Group__3__Impl : ( ( rule__Teacher__Group_3__0 )? ) ;
    public final void rule__Teacher__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1278:1: ( ( ( rule__Teacher__Group_3__0 )? ) )
            // InternalDsl.g:1279:1: ( ( rule__Teacher__Group_3__0 )? )
            {
            // InternalDsl.g:1279:1: ( ( rule__Teacher__Group_3__0 )? )
            // InternalDsl.g:1280:2: ( rule__Teacher__Group_3__0 )?
            {
             before(grammarAccess.getTeacherAccess().getGroup_3()); 
            // InternalDsl.g:1281:2: ( rule__Teacher__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:1281:3: rule__Teacher__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Teacher__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTeacherAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__3__Impl"


    // $ANTLR start "rule__Teacher__Group__4"
    // InternalDsl.g:1289:1: rule__Teacher__Group__4 : rule__Teacher__Group__4__Impl rule__Teacher__Group__5 ;
    public final void rule__Teacher__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1293:1: ( rule__Teacher__Group__4__Impl rule__Teacher__Group__5 )
            // InternalDsl.g:1294:2: rule__Teacher__Group__4__Impl rule__Teacher__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Teacher__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__4"


    // $ANTLR start "rule__Teacher__Group__4__Impl"
    // InternalDsl.g:1301:1: rule__Teacher__Group__4__Impl : ( ( rule__Teacher__Group_4__0 )? ) ;
    public final void rule__Teacher__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1305:1: ( ( ( rule__Teacher__Group_4__0 )? ) )
            // InternalDsl.g:1306:1: ( ( rule__Teacher__Group_4__0 )? )
            {
            // InternalDsl.g:1306:1: ( ( rule__Teacher__Group_4__0 )? )
            // InternalDsl.g:1307:2: ( rule__Teacher__Group_4__0 )?
            {
             before(grammarAccess.getTeacherAccess().getGroup_4()); 
            // InternalDsl.g:1308:2: ( rule__Teacher__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:1308:3: rule__Teacher__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Teacher__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTeacherAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__4__Impl"


    // $ANTLR start "rule__Teacher__Group__5"
    // InternalDsl.g:1316:1: rule__Teacher__Group__5 : rule__Teacher__Group__5__Impl rule__Teacher__Group__6 ;
    public final void rule__Teacher__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1320:1: ( rule__Teacher__Group__5__Impl rule__Teacher__Group__6 )
            // InternalDsl.g:1321:2: rule__Teacher__Group__5__Impl rule__Teacher__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Teacher__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__5"


    // $ANTLR start "rule__Teacher__Group__5__Impl"
    // InternalDsl.g:1328:1: rule__Teacher__Group__5__Impl : ( 'correct' ) ;
    public final void rule__Teacher__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1332:1: ( ( 'correct' ) )
            // InternalDsl.g:1333:1: ( 'correct' )
            {
            // InternalDsl.g:1333:1: ( 'correct' )
            // InternalDsl.g:1334:2: 'correct'
            {
             before(grammarAccess.getTeacherAccess().getCorrectKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getCorrectKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__5__Impl"


    // $ANTLR start "rule__Teacher__Group__6"
    // InternalDsl.g:1343:1: rule__Teacher__Group__6 : rule__Teacher__Group__6__Impl rule__Teacher__Group__7 ;
    public final void rule__Teacher__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1347:1: ( rule__Teacher__Group__6__Impl rule__Teacher__Group__7 )
            // InternalDsl.g:1348:2: rule__Teacher__Group__6__Impl rule__Teacher__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Teacher__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__6"


    // $ANTLR start "rule__Teacher__Group__6__Impl"
    // InternalDsl.g:1355:1: rule__Teacher__Group__6__Impl : ( '(' ) ;
    public final void rule__Teacher__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1359:1: ( ( '(' ) )
            // InternalDsl.g:1360:1: ( '(' )
            {
            // InternalDsl.g:1360:1: ( '(' )
            // InternalDsl.g:1361:2: '('
            {
             before(grammarAccess.getTeacherAccess().getLeftParenthesisKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getLeftParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__6__Impl"


    // $ANTLR start "rule__Teacher__Group__7"
    // InternalDsl.g:1370:1: rule__Teacher__Group__7 : rule__Teacher__Group__7__Impl rule__Teacher__Group__8 ;
    public final void rule__Teacher__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1374:1: ( rule__Teacher__Group__7__Impl rule__Teacher__Group__8 )
            // InternalDsl.g:1375:2: rule__Teacher__Group__7__Impl rule__Teacher__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__Teacher__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__7"


    // $ANTLR start "rule__Teacher__Group__7__Impl"
    // InternalDsl.g:1382:1: rule__Teacher__Group__7__Impl : ( ( rule__Teacher__CorrectAssignment_7 ) ) ;
    public final void rule__Teacher__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1386:1: ( ( ( rule__Teacher__CorrectAssignment_7 ) ) )
            // InternalDsl.g:1387:1: ( ( rule__Teacher__CorrectAssignment_7 ) )
            {
            // InternalDsl.g:1387:1: ( ( rule__Teacher__CorrectAssignment_7 ) )
            // InternalDsl.g:1388:2: ( rule__Teacher__CorrectAssignment_7 )
            {
             before(grammarAccess.getTeacherAccess().getCorrectAssignment_7()); 
            // InternalDsl.g:1389:2: ( rule__Teacher__CorrectAssignment_7 )
            // InternalDsl.g:1389:3: rule__Teacher__CorrectAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__CorrectAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getCorrectAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__7__Impl"


    // $ANTLR start "rule__Teacher__Group__8"
    // InternalDsl.g:1397:1: rule__Teacher__Group__8 : rule__Teacher__Group__8__Impl rule__Teacher__Group__9 ;
    public final void rule__Teacher__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1401:1: ( rule__Teacher__Group__8__Impl rule__Teacher__Group__9 )
            // InternalDsl.g:1402:2: rule__Teacher__Group__8__Impl rule__Teacher__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__Teacher__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__8"


    // $ANTLR start "rule__Teacher__Group__8__Impl"
    // InternalDsl.g:1409:1: rule__Teacher__Group__8__Impl : ( ( rule__Teacher__Group_8__0 )* ) ;
    public final void rule__Teacher__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1413:1: ( ( ( rule__Teacher__Group_8__0 )* ) )
            // InternalDsl.g:1414:1: ( ( rule__Teacher__Group_8__0 )* )
            {
            // InternalDsl.g:1414:1: ( ( rule__Teacher__Group_8__0 )* )
            // InternalDsl.g:1415:2: ( rule__Teacher__Group_8__0 )*
            {
             before(grammarAccess.getTeacherAccess().getGroup_8()); 
            // InternalDsl.g:1416:2: ( rule__Teacher__Group_8__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:1416:3: rule__Teacher__Group_8__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Teacher__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getTeacherAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__8__Impl"


    // $ANTLR start "rule__Teacher__Group__9"
    // InternalDsl.g:1424:1: rule__Teacher__Group__9 : rule__Teacher__Group__9__Impl rule__Teacher__Group__10 ;
    public final void rule__Teacher__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1428:1: ( rule__Teacher__Group__9__Impl rule__Teacher__Group__10 )
            // InternalDsl.g:1429:2: rule__Teacher__Group__9__Impl rule__Teacher__Group__10
            {
            pushFollow(FOLLOW_15);
            rule__Teacher__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__9"


    // $ANTLR start "rule__Teacher__Group__9__Impl"
    // InternalDsl.g:1436:1: rule__Teacher__Group__9__Impl : ( ')' ) ;
    public final void rule__Teacher__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1440:1: ( ( ')' ) )
            // InternalDsl.g:1441:1: ( ')' )
            {
            // InternalDsl.g:1441:1: ( ')' )
            // InternalDsl.g:1442:2: ')'
            {
             before(grammarAccess.getTeacherAccess().getRightParenthesisKeyword_9()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__9__Impl"


    // $ANTLR start "rule__Teacher__Group__10"
    // InternalDsl.g:1451:1: rule__Teacher__Group__10 : rule__Teacher__Group__10__Impl rule__Teacher__Group__11 ;
    public final void rule__Teacher__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1455:1: ( rule__Teacher__Group__10__Impl rule__Teacher__Group__11 )
            // InternalDsl.g:1456:2: rule__Teacher__Group__10__Impl rule__Teacher__Group__11
            {
            pushFollow(FOLLOW_15);
            rule__Teacher__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__10"


    // $ANTLR start "rule__Teacher__Group__10__Impl"
    // InternalDsl.g:1463:1: rule__Teacher__Group__10__Impl : ( ( rule__Teacher__Group_10__0 )? ) ;
    public final void rule__Teacher__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1467:1: ( ( ( rule__Teacher__Group_10__0 )? ) )
            // InternalDsl.g:1468:1: ( ( rule__Teacher__Group_10__0 )? )
            {
            // InternalDsl.g:1468:1: ( ( rule__Teacher__Group_10__0 )? )
            // InternalDsl.g:1469:2: ( rule__Teacher__Group_10__0 )?
            {
             before(grammarAccess.getTeacherAccess().getGroup_10()); 
            // InternalDsl.g:1470:2: ( rule__Teacher__Group_10__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:1470:3: rule__Teacher__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Teacher__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTeacherAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__10__Impl"


    // $ANTLR start "rule__Teacher__Group__11"
    // InternalDsl.g:1478:1: rule__Teacher__Group__11 : rule__Teacher__Group__11__Impl rule__Teacher__Group__12 ;
    public final void rule__Teacher__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1482:1: ( rule__Teacher__Group__11__Impl rule__Teacher__Group__12 )
            // InternalDsl.g:1483:2: rule__Teacher__Group__11__Impl rule__Teacher__Group__12
            {
            pushFollow(FOLLOW_15);
            rule__Teacher__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__11"


    // $ANTLR start "rule__Teacher__Group__11__Impl"
    // InternalDsl.g:1490:1: rule__Teacher__Group__11__Impl : ( ( rule__Teacher__Group_11__0 )? ) ;
    public final void rule__Teacher__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1494:1: ( ( ( rule__Teacher__Group_11__0 )? ) )
            // InternalDsl.g:1495:1: ( ( rule__Teacher__Group_11__0 )? )
            {
            // InternalDsl.g:1495:1: ( ( rule__Teacher__Group_11__0 )? )
            // InternalDsl.g:1496:2: ( rule__Teacher__Group_11__0 )?
            {
             before(grammarAccess.getTeacherAccess().getGroup_11()); 
            // InternalDsl.g:1497:2: ( rule__Teacher__Group_11__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:1497:3: rule__Teacher__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Teacher__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTeacherAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__11__Impl"


    // $ANTLR start "rule__Teacher__Group__12"
    // InternalDsl.g:1505:1: rule__Teacher__Group__12 : rule__Teacher__Group__12__Impl ;
    public final void rule__Teacher__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1509:1: ( rule__Teacher__Group__12__Impl )
            // InternalDsl.g:1510:2: rule__Teacher__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__12"


    // $ANTLR start "rule__Teacher__Group__12__Impl"
    // InternalDsl.g:1516:1: rule__Teacher__Group__12__Impl : ( '}' ) ;
    public final void rule__Teacher__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1520:1: ( ( '}' ) )
            // InternalDsl.g:1521:1: ( '}' )
            {
            // InternalDsl.g:1521:1: ( '}' )
            // InternalDsl.g:1522:2: '}'
            {
             before(grammarAccess.getTeacherAccess().getRightCurlyBracketKeyword_12()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__12__Impl"


    // $ANTLR start "rule__Teacher__Group_3__0"
    // InternalDsl.g:1532:1: rule__Teacher__Group_3__0 : rule__Teacher__Group_3__0__Impl rule__Teacher__Group_3__1 ;
    public final void rule__Teacher__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1536:1: ( rule__Teacher__Group_3__0__Impl rule__Teacher__Group_3__1 )
            // InternalDsl.g:1537:2: rule__Teacher__Group_3__0__Impl rule__Teacher__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Teacher__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_3__0"


    // $ANTLR start "rule__Teacher__Group_3__0__Impl"
    // InternalDsl.g:1544:1: rule__Teacher__Group_3__0__Impl : ( 'id' ) ;
    public final void rule__Teacher__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1548:1: ( ( 'id' ) )
            // InternalDsl.g:1549:1: ( 'id' )
            {
            // InternalDsl.g:1549:1: ( 'id' )
            // InternalDsl.g:1550:2: 'id'
            {
             before(grammarAccess.getTeacherAccess().getIdKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getIdKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_3__0__Impl"


    // $ANTLR start "rule__Teacher__Group_3__1"
    // InternalDsl.g:1559:1: rule__Teacher__Group_3__1 : rule__Teacher__Group_3__1__Impl ;
    public final void rule__Teacher__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1563:1: ( rule__Teacher__Group_3__1__Impl )
            // InternalDsl.g:1564:2: rule__Teacher__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_3__1"


    // $ANTLR start "rule__Teacher__Group_3__1__Impl"
    // InternalDsl.g:1570:1: rule__Teacher__Group_3__1__Impl : ( ( rule__Teacher__IdAssignment_3_1 ) ) ;
    public final void rule__Teacher__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1574:1: ( ( ( rule__Teacher__IdAssignment_3_1 ) ) )
            // InternalDsl.g:1575:1: ( ( rule__Teacher__IdAssignment_3_1 ) )
            {
            // InternalDsl.g:1575:1: ( ( rule__Teacher__IdAssignment_3_1 ) )
            // InternalDsl.g:1576:2: ( rule__Teacher__IdAssignment_3_1 )
            {
             before(grammarAccess.getTeacherAccess().getIdAssignment_3_1()); 
            // InternalDsl.g:1577:2: ( rule__Teacher__IdAssignment_3_1 )
            // InternalDsl.g:1577:3: rule__Teacher__IdAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__IdAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getIdAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_3__1__Impl"


    // $ANTLR start "rule__Teacher__Group_4__0"
    // InternalDsl.g:1586:1: rule__Teacher__Group_4__0 : rule__Teacher__Group_4__0__Impl rule__Teacher__Group_4__1 ;
    public final void rule__Teacher__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1590:1: ( rule__Teacher__Group_4__0__Impl rule__Teacher__Group_4__1 )
            // InternalDsl.g:1591:2: rule__Teacher__Group_4__0__Impl rule__Teacher__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Teacher__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4__0"


    // $ANTLR start "rule__Teacher__Group_4__0__Impl"
    // InternalDsl.g:1598:1: rule__Teacher__Group_4__0__Impl : ( 'classid' ) ;
    public final void rule__Teacher__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1602:1: ( ( 'classid' ) )
            // InternalDsl.g:1603:1: ( 'classid' )
            {
            // InternalDsl.g:1603:1: ( 'classid' )
            // InternalDsl.g:1604:2: 'classid'
            {
             before(grammarAccess.getTeacherAccess().getClassidKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getClassidKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4__0__Impl"


    // $ANTLR start "rule__Teacher__Group_4__1"
    // InternalDsl.g:1613:1: rule__Teacher__Group_4__1 : rule__Teacher__Group_4__1__Impl ;
    public final void rule__Teacher__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1617:1: ( rule__Teacher__Group_4__1__Impl )
            // InternalDsl.g:1618:2: rule__Teacher__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4__1"


    // $ANTLR start "rule__Teacher__Group_4__1__Impl"
    // InternalDsl.g:1624:1: rule__Teacher__Group_4__1__Impl : ( ( rule__Teacher__ClassidAssignment_4_1 ) ) ;
    public final void rule__Teacher__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1628:1: ( ( ( rule__Teacher__ClassidAssignment_4_1 ) ) )
            // InternalDsl.g:1629:1: ( ( rule__Teacher__ClassidAssignment_4_1 ) )
            {
            // InternalDsl.g:1629:1: ( ( rule__Teacher__ClassidAssignment_4_1 ) )
            // InternalDsl.g:1630:2: ( rule__Teacher__ClassidAssignment_4_1 )
            {
             before(grammarAccess.getTeacherAccess().getClassidAssignment_4_1()); 
            // InternalDsl.g:1631:2: ( rule__Teacher__ClassidAssignment_4_1 )
            // InternalDsl.g:1631:3: rule__Teacher__ClassidAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__ClassidAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getClassidAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4__1__Impl"


    // $ANTLR start "rule__Teacher__Group_8__0"
    // InternalDsl.g:1640:1: rule__Teacher__Group_8__0 : rule__Teacher__Group_8__0__Impl rule__Teacher__Group_8__1 ;
    public final void rule__Teacher__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1644:1: ( rule__Teacher__Group_8__0__Impl rule__Teacher__Group_8__1 )
            // InternalDsl.g:1645:2: rule__Teacher__Group_8__0__Impl rule__Teacher__Group_8__1
            {
            pushFollow(FOLLOW_6);
            rule__Teacher__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_8__0"


    // $ANTLR start "rule__Teacher__Group_8__0__Impl"
    // InternalDsl.g:1652:1: rule__Teacher__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Teacher__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1656:1: ( ( ',' ) )
            // InternalDsl.g:1657:1: ( ',' )
            {
            // InternalDsl.g:1657:1: ( ',' )
            // InternalDsl.g:1658:2: ','
            {
             before(grammarAccess.getTeacherAccess().getCommaKeyword_8_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_8__0__Impl"


    // $ANTLR start "rule__Teacher__Group_8__1"
    // InternalDsl.g:1667:1: rule__Teacher__Group_8__1 : rule__Teacher__Group_8__1__Impl ;
    public final void rule__Teacher__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1671:1: ( rule__Teacher__Group_8__1__Impl )
            // InternalDsl.g:1672:2: rule__Teacher__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_8__1"


    // $ANTLR start "rule__Teacher__Group_8__1__Impl"
    // InternalDsl.g:1678:1: rule__Teacher__Group_8__1__Impl : ( ( rule__Teacher__CorrectAssignment_8_1 ) ) ;
    public final void rule__Teacher__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1682:1: ( ( ( rule__Teacher__CorrectAssignment_8_1 ) ) )
            // InternalDsl.g:1683:1: ( ( rule__Teacher__CorrectAssignment_8_1 ) )
            {
            // InternalDsl.g:1683:1: ( ( rule__Teacher__CorrectAssignment_8_1 ) )
            // InternalDsl.g:1684:2: ( rule__Teacher__CorrectAssignment_8_1 )
            {
             before(grammarAccess.getTeacherAccess().getCorrectAssignment_8_1()); 
            // InternalDsl.g:1685:2: ( rule__Teacher__CorrectAssignment_8_1 )
            // InternalDsl.g:1685:3: rule__Teacher__CorrectAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__CorrectAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getCorrectAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_8__1__Impl"


    // $ANTLR start "rule__Teacher__Group_10__0"
    // InternalDsl.g:1694:1: rule__Teacher__Group_10__0 : rule__Teacher__Group_10__0__Impl rule__Teacher__Group_10__1 ;
    public final void rule__Teacher__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1698:1: ( rule__Teacher__Group_10__0__Impl rule__Teacher__Group_10__1 )
            // InternalDsl.g:1699:2: rule__Teacher__Group_10__0__Impl rule__Teacher__Group_10__1
            {
            pushFollow(FOLLOW_4);
            rule__Teacher__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_10__0"


    // $ANTLR start "rule__Teacher__Group_10__0__Impl"
    // InternalDsl.g:1706:1: rule__Teacher__Group_10__0__Impl : ( 'teaching' ) ;
    public final void rule__Teacher__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1710:1: ( ( 'teaching' ) )
            // InternalDsl.g:1711:1: ( 'teaching' )
            {
            // InternalDsl.g:1711:1: ( 'teaching' )
            // InternalDsl.g:1712:2: 'teaching'
            {
             before(grammarAccess.getTeacherAccess().getTeachingKeyword_10_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getTeachingKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_10__0__Impl"


    // $ANTLR start "rule__Teacher__Group_10__1"
    // InternalDsl.g:1721:1: rule__Teacher__Group_10__1 : rule__Teacher__Group_10__1__Impl rule__Teacher__Group_10__2 ;
    public final void rule__Teacher__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1725:1: ( rule__Teacher__Group_10__1__Impl rule__Teacher__Group_10__2 )
            // InternalDsl.g:1726:2: rule__Teacher__Group_10__1__Impl rule__Teacher__Group_10__2
            {
            pushFollow(FOLLOW_16);
            rule__Teacher__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_10__1"


    // $ANTLR start "rule__Teacher__Group_10__1__Impl"
    // InternalDsl.g:1733:1: rule__Teacher__Group_10__1__Impl : ( '{' ) ;
    public final void rule__Teacher__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1737:1: ( ( '{' ) )
            // InternalDsl.g:1738:1: ( '{' )
            {
            // InternalDsl.g:1738:1: ( '{' )
            // InternalDsl.g:1739:2: '{'
            {
             before(grammarAccess.getTeacherAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getLeftCurlyBracketKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_10__1__Impl"


    // $ANTLR start "rule__Teacher__Group_10__2"
    // InternalDsl.g:1748:1: rule__Teacher__Group_10__2 : rule__Teacher__Group_10__2__Impl rule__Teacher__Group_10__3 ;
    public final void rule__Teacher__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1752:1: ( rule__Teacher__Group_10__2__Impl rule__Teacher__Group_10__3 )
            // InternalDsl.g:1753:2: rule__Teacher__Group_10__2__Impl rule__Teacher__Group_10__3
            {
            pushFollow(FOLLOW_9);
            rule__Teacher__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_10__2"


    // $ANTLR start "rule__Teacher__Group_10__2__Impl"
    // InternalDsl.g:1760:1: rule__Teacher__Group_10__2__Impl : ( ( rule__Teacher__TeachingAssignment_10_2 ) ) ;
    public final void rule__Teacher__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1764:1: ( ( ( rule__Teacher__TeachingAssignment_10_2 ) ) )
            // InternalDsl.g:1765:1: ( ( rule__Teacher__TeachingAssignment_10_2 ) )
            {
            // InternalDsl.g:1765:1: ( ( rule__Teacher__TeachingAssignment_10_2 ) )
            // InternalDsl.g:1766:2: ( rule__Teacher__TeachingAssignment_10_2 )
            {
             before(grammarAccess.getTeacherAccess().getTeachingAssignment_10_2()); 
            // InternalDsl.g:1767:2: ( rule__Teacher__TeachingAssignment_10_2 )
            // InternalDsl.g:1767:3: rule__Teacher__TeachingAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__TeachingAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getTeachingAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_10__2__Impl"


    // $ANTLR start "rule__Teacher__Group_10__3"
    // InternalDsl.g:1775:1: rule__Teacher__Group_10__3 : rule__Teacher__Group_10__3__Impl rule__Teacher__Group_10__4 ;
    public final void rule__Teacher__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1779:1: ( rule__Teacher__Group_10__3__Impl rule__Teacher__Group_10__4 )
            // InternalDsl.g:1780:2: rule__Teacher__Group_10__3__Impl rule__Teacher__Group_10__4
            {
            pushFollow(FOLLOW_9);
            rule__Teacher__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_10__3"


    // $ANTLR start "rule__Teacher__Group_10__3__Impl"
    // InternalDsl.g:1787:1: rule__Teacher__Group_10__3__Impl : ( ( rule__Teacher__Group_10_3__0 )* ) ;
    public final void rule__Teacher__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1791:1: ( ( ( rule__Teacher__Group_10_3__0 )* ) )
            // InternalDsl.g:1792:1: ( ( rule__Teacher__Group_10_3__0 )* )
            {
            // InternalDsl.g:1792:1: ( ( rule__Teacher__Group_10_3__0 )* )
            // InternalDsl.g:1793:2: ( rule__Teacher__Group_10_3__0 )*
            {
             before(grammarAccess.getTeacherAccess().getGroup_10_3()); 
            // InternalDsl.g:1794:2: ( rule__Teacher__Group_10_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==20) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:1794:3: rule__Teacher__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Teacher__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getTeacherAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_10__3__Impl"


    // $ANTLR start "rule__Teacher__Group_10__4"
    // InternalDsl.g:1802:1: rule__Teacher__Group_10__4 : rule__Teacher__Group_10__4__Impl ;
    public final void rule__Teacher__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1806:1: ( rule__Teacher__Group_10__4__Impl )
            // InternalDsl.g:1807:2: rule__Teacher__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__Group_10__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_10__4"


    // $ANTLR start "rule__Teacher__Group_10__4__Impl"
    // InternalDsl.g:1813:1: rule__Teacher__Group_10__4__Impl : ( '}' ) ;
    public final void rule__Teacher__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1817:1: ( ( '}' ) )
            // InternalDsl.g:1818:1: ( '}' )
            {
            // InternalDsl.g:1818:1: ( '}' )
            // InternalDsl.g:1819:2: '}'
            {
             before(grammarAccess.getTeacherAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getRightCurlyBracketKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_10__4__Impl"


    // $ANTLR start "rule__Teacher__Group_10_3__0"
    // InternalDsl.g:1829:1: rule__Teacher__Group_10_3__0 : rule__Teacher__Group_10_3__0__Impl rule__Teacher__Group_10_3__1 ;
    public final void rule__Teacher__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1833:1: ( rule__Teacher__Group_10_3__0__Impl rule__Teacher__Group_10_3__1 )
            // InternalDsl.g:1834:2: rule__Teacher__Group_10_3__0__Impl rule__Teacher__Group_10_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Teacher__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group_10_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_10_3__0"


    // $ANTLR start "rule__Teacher__Group_10_3__0__Impl"
    // InternalDsl.g:1841:1: rule__Teacher__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__Teacher__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1845:1: ( ( ',' ) )
            // InternalDsl.g:1846:1: ( ',' )
            {
            // InternalDsl.g:1846:1: ( ',' )
            // InternalDsl.g:1847:2: ','
            {
             before(grammarAccess.getTeacherAccess().getCommaKeyword_10_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_10_3__0__Impl"


    // $ANTLR start "rule__Teacher__Group_10_3__1"
    // InternalDsl.g:1856:1: rule__Teacher__Group_10_3__1 : rule__Teacher__Group_10_3__1__Impl ;
    public final void rule__Teacher__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1860:1: ( rule__Teacher__Group_10_3__1__Impl )
            // InternalDsl.g:1861:2: rule__Teacher__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__Group_10_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_10_3__1"


    // $ANTLR start "rule__Teacher__Group_10_3__1__Impl"
    // InternalDsl.g:1867:1: rule__Teacher__Group_10_3__1__Impl : ( ( rule__Teacher__TeachingAssignment_10_3_1 ) ) ;
    public final void rule__Teacher__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1871:1: ( ( ( rule__Teacher__TeachingAssignment_10_3_1 ) ) )
            // InternalDsl.g:1872:1: ( ( rule__Teacher__TeachingAssignment_10_3_1 ) )
            {
            // InternalDsl.g:1872:1: ( ( rule__Teacher__TeachingAssignment_10_3_1 ) )
            // InternalDsl.g:1873:2: ( rule__Teacher__TeachingAssignment_10_3_1 )
            {
             before(grammarAccess.getTeacherAccess().getTeachingAssignment_10_3_1()); 
            // InternalDsl.g:1874:2: ( rule__Teacher__TeachingAssignment_10_3_1 )
            // InternalDsl.g:1874:3: rule__Teacher__TeachingAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__TeachingAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getTeachingAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_10_3__1__Impl"


    // $ANTLR start "rule__Teacher__Group_11__0"
    // InternalDsl.g:1883:1: rule__Teacher__Group_11__0 : rule__Teacher__Group_11__0__Impl rule__Teacher__Group_11__1 ;
    public final void rule__Teacher__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1887:1: ( rule__Teacher__Group_11__0__Impl rule__Teacher__Group_11__1 )
            // InternalDsl.g:1888:2: rule__Teacher__Group_11__0__Impl rule__Teacher__Group_11__1
            {
            pushFollow(FOLLOW_4);
            rule__Teacher__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_11__0"


    // $ANTLR start "rule__Teacher__Group_11__0__Impl"
    // InternalDsl.g:1895:1: rule__Teacher__Group_11__0__Impl : ( 'input' ) ;
    public final void rule__Teacher__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1899:1: ( ( 'input' ) )
            // InternalDsl.g:1900:1: ( 'input' )
            {
            // InternalDsl.g:1900:1: ( 'input' )
            // InternalDsl.g:1901:2: 'input'
            {
             before(grammarAccess.getTeacherAccess().getInputKeyword_11_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getInputKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_11__0__Impl"


    // $ANTLR start "rule__Teacher__Group_11__1"
    // InternalDsl.g:1910:1: rule__Teacher__Group_11__1 : rule__Teacher__Group_11__1__Impl rule__Teacher__Group_11__2 ;
    public final void rule__Teacher__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1914:1: ( rule__Teacher__Group_11__1__Impl rule__Teacher__Group_11__2 )
            // InternalDsl.g:1915:2: rule__Teacher__Group_11__1__Impl rule__Teacher__Group_11__2
            {
            pushFollow(FOLLOW_17);
            rule__Teacher__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_11__1"


    // $ANTLR start "rule__Teacher__Group_11__1__Impl"
    // InternalDsl.g:1922:1: rule__Teacher__Group_11__1__Impl : ( '{' ) ;
    public final void rule__Teacher__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1926:1: ( ( '{' ) )
            // InternalDsl.g:1927:1: ( '{' )
            {
            // InternalDsl.g:1927:1: ( '{' )
            // InternalDsl.g:1928:2: '{'
            {
             before(grammarAccess.getTeacherAccess().getLeftCurlyBracketKeyword_11_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getLeftCurlyBracketKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_11__1__Impl"


    // $ANTLR start "rule__Teacher__Group_11__2"
    // InternalDsl.g:1937:1: rule__Teacher__Group_11__2 : rule__Teacher__Group_11__2__Impl rule__Teacher__Group_11__3 ;
    public final void rule__Teacher__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1941:1: ( rule__Teacher__Group_11__2__Impl rule__Teacher__Group_11__3 )
            // InternalDsl.g:1942:2: rule__Teacher__Group_11__2__Impl rule__Teacher__Group_11__3
            {
            pushFollow(FOLLOW_9);
            rule__Teacher__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group_11__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_11__2"


    // $ANTLR start "rule__Teacher__Group_11__2__Impl"
    // InternalDsl.g:1949:1: rule__Teacher__Group_11__2__Impl : ( ( rule__Teacher__InputAssignment_11_2 ) ) ;
    public final void rule__Teacher__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1953:1: ( ( ( rule__Teacher__InputAssignment_11_2 ) ) )
            // InternalDsl.g:1954:1: ( ( rule__Teacher__InputAssignment_11_2 ) )
            {
            // InternalDsl.g:1954:1: ( ( rule__Teacher__InputAssignment_11_2 ) )
            // InternalDsl.g:1955:2: ( rule__Teacher__InputAssignment_11_2 )
            {
             before(grammarAccess.getTeacherAccess().getInputAssignment_11_2()); 
            // InternalDsl.g:1956:2: ( rule__Teacher__InputAssignment_11_2 )
            // InternalDsl.g:1956:3: rule__Teacher__InputAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__InputAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getInputAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_11__2__Impl"


    // $ANTLR start "rule__Teacher__Group_11__3"
    // InternalDsl.g:1964:1: rule__Teacher__Group_11__3 : rule__Teacher__Group_11__3__Impl rule__Teacher__Group_11__4 ;
    public final void rule__Teacher__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1968:1: ( rule__Teacher__Group_11__3__Impl rule__Teacher__Group_11__4 )
            // InternalDsl.g:1969:2: rule__Teacher__Group_11__3__Impl rule__Teacher__Group_11__4
            {
            pushFollow(FOLLOW_9);
            rule__Teacher__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group_11__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_11__3"


    // $ANTLR start "rule__Teacher__Group_11__3__Impl"
    // InternalDsl.g:1976:1: rule__Teacher__Group_11__3__Impl : ( ( rule__Teacher__Group_11_3__0 )* ) ;
    public final void rule__Teacher__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1980:1: ( ( ( rule__Teacher__Group_11_3__0 )* ) )
            // InternalDsl.g:1981:1: ( ( rule__Teacher__Group_11_3__0 )* )
            {
            // InternalDsl.g:1981:1: ( ( rule__Teacher__Group_11_3__0 )* )
            // InternalDsl.g:1982:2: ( rule__Teacher__Group_11_3__0 )*
            {
             before(grammarAccess.getTeacherAccess().getGroup_11_3()); 
            // InternalDsl.g:1983:2: ( rule__Teacher__Group_11_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==20) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDsl.g:1983:3: rule__Teacher__Group_11_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Teacher__Group_11_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getTeacherAccess().getGroup_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_11__3__Impl"


    // $ANTLR start "rule__Teacher__Group_11__4"
    // InternalDsl.g:1991:1: rule__Teacher__Group_11__4 : rule__Teacher__Group_11__4__Impl ;
    public final void rule__Teacher__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1995:1: ( rule__Teacher__Group_11__4__Impl )
            // InternalDsl.g:1996:2: rule__Teacher__Group_11__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__Group_11__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_11__4"


    // $ANTLR start "rule__Teacher__Group_11__4__Impl"
    // InternalDsl.g:2002:1: rule__Teacher__Group_11__4__Impl : ( '}' ) ;
    public final void rule__Teacher__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2006:1: ( ( '}' ) )
            // InternalDsl.g:2007:1: ( '}' )
            {
            // InternalDsl.g:2007:1: ( '}' )
            // InternalDsl.g:2008:2: '}'
            {
             before(grammarAccess.getTeacherAccess().getRightCurlyBracketKeyword_11_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getRightCurlyBracketKeyword_11_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_11__4__Impl"


    // $ANTLR start "rule__Teacher__Group_11_3__0"
    // InternalDsl.g:2018:1: rule__Teacher__Group_11_3__0 : rule__Teacher__Group_11_3__0__Impl rule__Teacher__Group_11_3__1 ;
    public final void rule__Teacher__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2022:1: ( rule__Teacher__Group_11_3__0__Impl rule__Teacher__Group_11_3__1 )
            // InternalDsl.g:2023:2: rule__Teacher__Group_11_3__0__Impl rule__Teacher__Group_11_3__1
            {
            pushFollow(FOLLOW_17);
            rule__Teacher__Group_11_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group_11_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_11_3__0"


    // $ANTLR start "rule__Teacher__Group_11_3__0__Impl"
    // InternalDsl.g:2030:1: rule__Teacher__Group_11_3__0__Impl : ( ',' ) ;
    public final void rule__Teacher__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2034:1: ( ( ',' ) )
            // InternalDsl.g:2035:1: ( ',' )
            {
            // InternalDsl.g:2035:1: ( ',' )
            // InternalDsl.g:2036:2: ','
            {
             before(grammarAccess.getTeacherAccess().getCommaKeyword_11_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getCommaKeyword_11_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_11_3__0__Impl"


    // $ANTLR start "rule__Teacher__Group_11_3__1"
    // InternalDsl.g:2045:1: rule__Teacher__Group_11_3__1 : rule__Teacher__Group_11_3__1__Impl ;
    public final void rule__Teacher__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2049:1: ( rule__Teacher__Group_11_3__1__Impl )
            // InternalDsl.g:2050:2: rule__Teacher__Group_11_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__Group_11_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_11_3__1"


    // $ANTLR start "rule__Teacher__Group_11_3__1__Impl"
    // InternalDsl.g:2056:1: rule__Teacher__Group_11_3__1__Impl : ( ( rule__Teacher__InputAssignment_11_3_1 ) ) ;
    public final void rule__Teacher__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2060:1: ( ( ( rule__Teacher__InputAssignment_11_3_1 ) ) )
            // InternalDsl.g:2061:1: ( ( rule__Teacher__InputAssignment_11_3_1 ) )
            {
            // InternalDsl.g:2061:1: ( ( rule__Teacher__InputAssignment_11_3_1 ) )
            // InternalDsl.g:2062:2: ( rule__Teacher__InputAssignment_11_3_1 )
            {
             before(grammarAccess.getTeacherAccess().getInputAssignment_11_3_1()); 
            // InternalDsl.g:2063:2: ( rule__Teacher__InputAssignment_11_3_1 )
            // InternalDsl.g:2063:3: rule__Teacher__InputAssignment_11_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__InputAssignment_11_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getInputAssignment_11_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_11_3__1__Impl"


    // $ANTLR start "rule__Student__Group__0"
    // InternalDsl.g:2072:1: rule__Student__Group__0 : rule__Student__Group__0__Impl rule__Student__Group__1 ;
    public final void rule__Student__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2076:1: ( rule__Student__Group__0__Impl rule__Student__Group__1 )
            // InternalDsl.g:2077:2: rule__Student__Group__0__Impl rule__Student__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Student__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__0"


    // $ANTLR start "rule__Student__Group__0__Impl"
    // InternalDsl.g:2084:1: rule__Student__Group__0__Impl : ( 'Student' ) ;
    public final void rule__Student__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2088:1: ( ( 'Student' ) )
            // InternalDsl.g:2089:1: ( 'Student' )
            {
            // InternalDsl.g:2089:1: ( 'Student' )
            // InternalDsl.g:2090:2: 'Student'
            {
             before(grammarAccess.getStudentAccess().getStudentKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getStudentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__0__Impl"


    // $ANTLR start "rule__Student__Group__1"
    // InternalDsl.g:2099:1: rule__Student__Group__1 : rule__Student__Group__1__Impl rule__Student__Group__2 ;
    public final void rule__Student__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2103:1: ( rule__Student__Group__1__Impl rule__Student__Group__2 )
            // InternalDsl.g:2104:2: rule__Student__Group__1__Impl rule__Student__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Student__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__1"


    // $ANTLR start "rule__Student__Group__1__Impl"
    // InternalDsl.g:2111:1: rule__Student__Group__1__Impl : ( ( rule__Student__NameAssignment_1 ) ) ;
    public final void rule__Student__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2115:1: ( ( ( rule__Student__NameAssignment_1 ) ) )
            // InternalDsl.g:2116:1: ( ( rule__Student__NameAssignment_1 ) )
            {
            // InternalDsl.g:2116:1: ( ( rule__Student__NameAssignment_1 ) )
            // InternalDsl.g:2117:2: ( rule__Student__NameAssignment_1 )
            {
             before(grammarAccess.getStudentAccess().getNameAssignment_1()); 
            // InternalDsl.g:2118:2: ( rule__Student__NameAssignment_1 )
            // InternalDsl.g:2118:3: rule__Student__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Student__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__1__Impl"


    // $ANTLR start "rule__Student__Group__2"
    // InternalDsl.g:2126:1: rule__Student__Group__2 : rule__Student__Group__2__Impl rule__Student__Group__3 ;
    public final void rule__Student__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2130:1: ( rule__Student__Group__2__Impl rule__Student__Group__3 )
            // InternalDsl.g:2131:2: rule__Student__Group__2__Impl rule__Student__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Student__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__2"


    // $ANTLR start "rule__Student__Group__2__Impl"
    // InternalDsl.g:2138:1: rule__Student__Group__2__Impl : ( '{' ) ;
    public final void rule__Student__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2142:1: ( ( '{' ) )
            // InternalDsl.g:2143:1: ( '{' )
            {
            // InternalDsl.g:2143:1: ( '{' )
            // InternalDsl.g:2144:2: '{'
            {
             before(grammarAccess.getStudentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__2__Impl"


    // $ANTLR start "rule__Student__Group__3"
    // InternalDsl.g:2153:1: rule__Student__Group__3 : rule__Student__Group__3__Impl rule__Student__Group__4 ;
    public final void rule__Student__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2157:1: ( rule__Student__Group__3__Impl rule__Student__Group__4 )
            // InternalDsl.g:2158:2: rule__Student__Group__3__Impl rule__Student__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Student__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__3"


    // $ANTLR start "rule__Student__Group__3__Impl"
    // InternalDsl.g:2165:1: rule__Student__Group__3__Impl : ( ( rule__Student__Group_3__0 )? ) ;
    public final void rule__Student__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2169:1: ( ( ( rule__Student__Group_3__0 )? ) )
            // InternalDsl.g:2170:1: ( ( rule__Student__Group_3__0 )? )
            {
            // InternalDsl.g:2170:1: ( ( rule__Student__Group_3__0 )? )
            // InternalDsl.g:2171:2: ( rule__Student__Group_3__0 )?
            {
             before(grammarAccess.getStudentAccess().getGroup_3()); 
            // InternalDsl.g:2172:2: ( rule__Student__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==16) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDsl.g:2172:3: rule__Student__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Student__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStudentAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__3__Impl"


    // $ANTLR start "rule__Student__Group__4"
    // InternalDsl.g:2180:1: rule__Student__Group__4 : rule__Student__Group__4__Impl rule__Student__Group__5 ;
    public final void rule__Student__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2184:1: ( rule__Student__Group__4__Impl rule__Student__Group__5 )
            // InternalDsl.g:2185:2: rule__Student__Group__4__Impl rule__Student__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Student__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__4"


    // $ANTLR start "rule__Student__Group__4__Impl"
    // InternalDsl.g:2192:1: rule__Student__Group__4__Impl : ( ( rule__Student__Group_4__0 )? ) ;
    public final void rule__Student__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2196:1: ( ( ( rule__Student__Group_4__0 )? ) )
            // InternalDsl.g:2197:1: ( ( rule__Student__Group_4__0 )? )
            {
            // InternalDsl.g:2197:1: ( ( rule__Student__Group_4__0 )? )
            // InternalDsl.g:2198:2: ( rule__Student__Group_4__0 )?
            {
             before(grammarAccess.getStudentAccess().getGroup_4()); 
            // InternalDsl.g:2199:2: ( rule__Student__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDsl.g:2199:3: rule__Student__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Student__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStudentAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__4__Impl"


    // $ANTLR start "rule__Student__Group__5"
    // InternalDsl.g:2207:1: rule__Student__Group__5 : rule__Student__Group__5__Impl rule__Student__Group__6 ;
    public final void rule__Student__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2211:1: ( rule__Student__Group__5__Impl rule__Student__Group__6 )
            // InternalDsl.g:2212:2: rule__Student__Group__5__Impl rule__Student__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Student__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__5"


    // $ANTLR start "rule__Student__Group__5__Impl"
    // InternalDsl.g:2219:1: rule__Student__Group__5__Impl : ( 'have' ) ;
    public final void rule__Student__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2223:1: ( ( 'have' ) )
            // InternalDsl.g:2224:1: ( 'have' )
            {
            // InternalDsl.g:2224:1: ( 'have' )
            // InternalDsl.g:2225:2: 'have'
            {
             before(grammarAccess.getStudentAccess().getHaveKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getHaveKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__5__Impl"


    // $ANTLR start "rule__Student__Group__6"
    // InternalDsl.g:2234:1: rule__Student__Group__6 : rule__Student__Group__6__Impl rule__Student__Group__7 ;
    public final void rule__Student__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2238:1: ( rule__Student__Group__6__Impl rule__Student__Group__7 )
            // InternalDsl.g:2239:2: rule__Student__Group__6__Impl rule__Student__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__Student__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__6"


    // $ANTLR start "rule__Student__Group__6__Impl"
    // InternalDsl.g:2246:1: rule__Student__Group__6__Impl : ( ( rule__Student__HaveAssignment_6 ) ) ;
    public final void rule__Student__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2250:1: ( ( ( rule__Student__HaveAssignment_6 ) ) )
            // InternalDsl.g:2251:1: ( ( rule__Student__HaveAssignment_6 ) )
            {
            // InternalDsl.g:2251:1: ( ( rule__Student__HaveAssignment_6 ) )
            // InternalDsl.g:2252:2: ( rule__Student__HaveAssignment_6 )
            {
             before(grammarAccess.getStudentAccess().getHaveAssignment_6()); 
            // InternalDsl.g:2253:2: ( rule__Student__HaveAssignment_6 )
            // InternalDsl.g:2253:3: rule__Student__HaveAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Student__HaveAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getHaveAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__6__Impl"


    // $ANTLR start "rule__Student__Group__7"
    // InternalDsl.g:2261:1: rule__Student__Group__7 : rule__Student__Group__7__Impl rule__Student__Group__8 ;
    public final void rule__Student__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2265:1: ( rule__Student__Group__7__Impl rule__Student__Group__8 )
            // InternalDsl.g:2266:2: rule__Student__Group__7__Impl rule__Student__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__Student__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__7"


    // $ANTLR start "rule__Student__Group__7__Impl"
    // InternalDsl.g:2273:1: rule__Student__Group__7__Impl : ( ( rule__Student__Group_7__0 )? ) ;
    public final void rule__Student__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2277:1: ( ( ( rule__Student__Group_7__0 )? ) )
            // InternalDsl.g:2278:1: ( ( rule__Student__Group_7__0 )? )
            {
            // InternalDsl.g:2278:1: ( ( rule__Student__Group_7__0 )? )
            // InternalDsl.g:2279:2: ( rule__Student__Group_7__0 )?
            {
             before(grammarAccess.getStudentAccess().getGroup_7()); 
            // InternalDsl.g:2280:2: ( rule__Student__Group_7__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:2280:3: rule__Student__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Student__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStudentAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__7__Impl"


    // $ANTLR start "rule__Student__Group__8"
    // InternalDsl.g:2288:1: rule__Student__Group__8 : rule__Student__Group__8__Impl ;
    public final void rule__Student__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2292:1: ( rule__Student__Group__8__Impl )
            // InternalDsl.g:2293:2: rule__Student__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Student__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__8"


    // $ANTLR start "rule__Student__Group__8__Impl"
    // InternalDsl.g:2299:1: rule__Student__Group__8__Impl : ( '}' ) ;
    public final void rule__Student__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2303:1: ( ( '}' ) )
            // InternalDsl.g:2304:1: ( '}' )
            {
            // InternalDsl.g:2304:1: ( '}' )
            // InternalDsl.g:2305:2: '}'
            {
             before(grammarAccess.getStudentAccess().getRightCurlyBracketKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__8__Impl"


    // $ANTLR start "rule__Student__Group_3__0"
    // InternalDsl.g:2315:1: rule__Student__Group_3__0 : rule__Student__Group_3__0__Impl rule__Student__Group_3__1 ;
    public final void rule__Student__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2319:1: ( rule__Student__Group_3__0__Impl rule__Student__Group_3__1 )
            // InternalDsl.g:2320:2: rule__Student__Group_3__0__Impl rule__Student__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Student__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_3__0"


    // $ANTLR start "rule__Student__Group_3__0__Impl"
    // InternalDsl.g:2327:1: rule__Student__Group_3__0__Impl : ( 'id' ) ;
    public final void rule__Student__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2331:1: ( ( 'id' ) )
            // InternalDsl.g:2332:1: ( 'id' )
            {
            // InternalDsl.g:2332:1: ( 'id' )
            // InternalDsl.g:2333:2: 'id'
            {
             before(grammarAccess.getStudentAccess().getIdKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getIdKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_3__0__Impl"


    // $ANTLR start "rule__Student__Group_3__1"
    // InternalDsl.g:2342:1: rule__Student__Group_3__1 : rule__Student__Group_3__1__Impl ;
    public final void rule__Student__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2346:1: ( rule__Student__Group_3__1__Impl )
            // InternalDsl.g:2347:2: rule__Student__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Student__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_3__1"


    // $ANTLR start "rule__Student__Group_3__1__Impl"
    // InternalDsl.g:2353:1: rule__Student__Group_3__1__Impl : ( ( rule__Student__IdAssignment_3_1 ) ) ;
    public final void rule__Student__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2357:1: ( ( ( rule__Student__IdAssignment_3_1 ) ) )
            // InternalDsl.g:2358:1: ( ( rule__Student__IdAssignment_3_1 ) )
            {
            // InternalDsl.g:2358:1: ( ( rule__Student__IdAssignment_3_1 ) )
            // InternalDsl.g:2359:2: ( rule__Student__IdAssignment_3_1 )
            {
             before(grammarAccess.getStudentAccess().getIdAssignment_3_1()); 
            // InternalDsl.g:2360:2: ( rule__Student__IdAssignment_3_1 )
            // InternalDsl.g:2360:3: rule__Student__IdAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Student__IdAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getIdAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_3__1__Impl"


    // $ANTLR start "rule__Student__Group_4__0"
    // InternalDsl.g:2369:1: rule__Student__Group_4__0 : rule__Student__Group_4__0__Impl rule__Student__Group_4__1 ;
    public final void rule__Student__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2373:1: ( rule__Student__Group_4__0__Impl rule__Student__Group_4__1 )
            // InternalDsl.g:2374:2: rule__Student__Group_4__0__Impl rule__Student__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Student__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4__0"


    // $ANTLR start "rule__Student__Group_4__0__Impl"
    // InternalDsl.g:2381:1: rule__Student__Group_4__0__Impl : ( 'classid' ) ;
    public final void rule__Student__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2385:1: ( ( 'classid' ) )
            // InternalDsl.g:2386:1: ( 'classid' )
            {
            // InternalDsl.g:2386:1: ( 'classid' )
            // InternalDsl.g:2387:2: 'classid'
            {
             before(grammarAccess.getStudentAccess().getClassidKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getClassidKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4__0__Impl"


    // $ANTLR start "rule__Student__Group_4__1"
    // InternalDsl.g:2396:1: rule__Student__Group_4__1 : rule__Student__Group_4__1__Impl ;
    public final void rule__Student__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2400:1: ( rule__Student__Group_4__1__Impl )
            // InternalDsl.g:2401:2: rule__Student__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Student__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4__1"


    // $ANTLR start "rule__Student__Group_4__1__Impl"
    // InternalDsl.g:2407:1: rule__Student__Group_4__1__Impl : ( ( rule__Student__ClassidAssignment_4_1 ) ) ;
    public final void rule__Student__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2411:1: ( ( ( rule__Student__ClassidAssignment_4_1 ) ) )
            // InternalDsl.g:2412:1: ( ( rule__Student__ClassidAssignment_4_1 ) )
            {
            // InternalDsl.g:2412:1: ( ( rule__Student__ClassidAssignment_4_1 ) )
            // InternalDsl.g:2413:2: ( rule__Student__ClassidAssignment_4_1 )
            {
             before(grammarAccess.getStudentAccess().getClassidAssignment_4_1()); 
            // InternalDsl.g:2414:2: ( rule__Student__ClassidAssignment_4_1 )
            // InternalDsl.g:2414:3: rule__Student__ClassidAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Student__ClassidAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getClassidAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4__1__Impl"


    // $ANTLR start "rule__Student__Group_7__0"
    // InternalDsl.g:2423:1: rule__Student__Group_7__0 : rule__Student__Group_7__0__Impl rule__Student__Group_7__1 ;
    public final void rule__Student__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2427:1: ( rule__Student__Group_7__0__Impl rule__Student__Group_7__1 )
            // InternalDsl.g:2428:2: rule__Student__Group_7__0__Impl rule__Student__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__Student__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_7__0"


    // $ANTLR start "rule__Student__Group_7__0__Impl"
    // InternalDsl.g:2435:1: rule__Student__Group_7__0__Impl : ( 'answer' ) ;
    public final void rule__Student__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2439:1: ( ( 'answer' ) )
            // InternalDsl.g:2440:1: ( 'answer' )
            {
            // InternalDsl.g:2440:1: ( 'answer' )
            // InternalDsl.g:2441:2: 'answer'
            {
             before(grammarAccess.getStudentAccess().getAnswerKeyword_7_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getAnswerKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_7__0__Impl"


    // $ANTLR start "rule__Student__Group_7__1"
    // InternalDsl.g:2450:1: rule__Student__Group_7__1 : rule__Student__Group_7__1__Impl rule__Student__Group_7__2 ;
    public final void rule__Student__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2454:1: ( rule__Student__Group_7__1__Impl rule__Student__Group_7__2 )
            // InternalDsl.g:2455:2: rule__Student__Group_7__1__Impl rule__Student__Group_7__2
            {
            pushFollow(FOLLOW_20);
            rule__Student__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_7__1"


    // $ANTLR start "rule__Student__Group_7__1__Impl"
    // InternalDsl.g:2462:1: rule__Student__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Student__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2466:1: ( ( '{' ) )
            // InternalDsl.g:2467:1: ( '{' )
            {
            // InternalDsl.g:2467:1: ( '{' )
            // InternalDsl.g:2468:2: '{'
            {
             before(grammarAccess.getStudentAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_7__1__Impl"


    // $ANTLR start "rule__Student__Group_7__2"
    // InternalDsl.g:2477:1: rule__Student__Group_7__2 : rule__Student__Group_7__2__Impl rule__Student__Group_7__3 ;
    public final void rule__Student__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2481:1: ( rule__Student__Group_7__2__Impl rule__Student__Group_7__3 )
            // InternalDsl.g:2482:2: rule__Student__Group_7__2__Impl rule__Student__Group_7__3
            {
            pushFollow(FOLLOW_9);
            rule__Student__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_7__2"


    // $ANTLR start "rule__Student__Group_7__2__Impl"
    // InternalDsl.g:2489:1: rule__Student__Group_7__2__Impl : ( ( rule__Student__AnswerAssignment_7_2 ) ) ;
    public final void rule__Student__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2493:1: ( ( ( rule__Student__AnswerAssignment_7_2 ) ) )
            // InternalDsl.g:2494:1: ( ( rule__Student__AnswerAssignment_7_2 ) )
            {
            // InternalDsl.g:2494:1: ( ( rule__Student__AnswerAssignment_7_2 ) )
            // InternalDsl.g:2495:2: ( rule__Student__AnswerAssignment_7_2 )
            {
             before(grammarAccess.getStudentAccess().getAnswerAssignment_7_2()); 
            // InternalDsl.g:2496:2: ( rule__Student__AnswerAssignment_7_2 )
            // InternalDsl.g:2496:3: rule__Student__AnswerAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Student__AnswerAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getAnswerAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_7__2__Impl"


    // $ANTLR start "rule__Student__Group_7__3"
    // InternalDsl.g:2504:1: rule__Student__Group_7__3 : rule__Student__Group_7__3__Impl rule__Student__Group_7__4 ;
    public final void rule__Student__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2508:1: ( rule__Student__Group_7__3__Impl rule__Student__Group_7__4 )
            // InternalDsl.g:2509:2: rule__Student__Group_7__3__Impl rule__Student__Group_7__4
            {
            pushFollow(FOLLOW_9);
            rule__Student__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_7__3"


    // $ANTLR start "rule__Student__Group_7__3__Impl"
    // InternalDsl.g:2516:1: rule__Student__Group_7__3__Impl : ( ( rule__Student__Group_7_3__0 )* ) ;
    public final void rule__Student__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2520:1: ( ( ( rule__Student__Group_7_3__0 )* ) )
            // InternalDsl.g:2521:1: ( ( rule__Student__Group_7_3__0 )* )
            {
            // InternalDsl.g:2521:1: ( ( rule__Student__Group_7_3__0 )* )
            // InternalDsl.g:2522:2: ( rule__Student__Group_7_3__0 )*
            {
             before(grammarAccess.getStudentAccess().getGroup_7_3()); 
            // InternalDsl.g:2523:2: ( rule__Student__Group_7_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==20) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDsl.g:2523:3: rule__Student__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Student__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getStudentAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_7__3__Impl"


    // $ANTLR start "rule__Student__Group_7__4"
    // InternalDsl.g:2531:1: rule__Student__Group_7__4 : rule__Student__Group_7__4__Impl ;
    public final void rule__Student__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2535:1: ( rule__Student__Group_7__4__Impl )
            // InternalDsl.g:2536:2: rule__Student__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Student__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_7__4"


    // $ANTLR start "rule__Student__Group_7__4__Impl"
    // InternalDsl.g:2542:1: rule__Student__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Student__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2546:1: ( ( '}' ) )
            // InternalDsl.g:2547:1: ( '}' )
            {
            // InternalDsl.g:2547:1: ( '}' )
            // InternalDsl.g:2548:2: '}'
            {
             before(grammarAccess.getStudentAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_7__4__Impl"


    // $ANTLR start "rule__Student__Group_7_3__0"
    // InternalDsl.g:2558:1: rule__Student__Group_7_3__0 : rule__Student__Group_7_3__0__Impl rule__Student__Group_7_3__1 ;
    public final void rule__Student__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2562:1: ( rule__Student__Group_7_3__0__Impl rule__Student__Group_7_3__1 )
            // InternalDsl.g:2563:2: rule__Student__Group_7_3__0__Impl rule__Student__Group_7_3__1
            {
            pushFollow(FOLLOW_20);
            rule__Student__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_7_3__0"


    // $ANTLR start "rule__Student__Group_7_3__0__Impl"
    // InternalDsl.g:2570:1: rule__Student__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Student__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2574:1: ( ( ',' ) )
            // InternalDsl.g:2575:1: ( ',' )
            {
            // InternalDsl.g:2575:1: ( ',' )
            // InternalDsl.g:2576:2: ','
            {
             before(grammarAccess.getStudentAccess().getCommaKeyword_7_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_7_3__0__Impl"


    // $ANTLR start "rule__Student__Group_7_3__1"
    // InternalDsl.g:2585:1: rule__Student__Group_7_3__1 : rule__Student__Group_7_3__1__Impl ;
    public final void rule__Student__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2589:1: ( rule__Student__Group_7_3__1__Impl )
            // InternalDsl.g:2590:2: rule__Student__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Student__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_7_3__1"


    // $ANTLR start "rule__Student__Group_7_3__1__Impl"
    // InternalDsl.g:2596:1: rule__Student__Group_7_3__1__Impl : ( ( rule__Student__AnswerAssignment_7_3_1 ) ) ;
    public final void rule__Student__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2600:1: ( ( ( rule__Student__AnswerAssignment_7_3_1 ) ) )
            // InternalDsl.g:2601:1: ( ( rule__Student__AnswerAssignment_7_3_1 ) )
            {
            // InternalDsl.g:2601:1: ( ( rule__Student__AnswerAssignment_7_3_1 ) )
            // InternalDsl.g:2602:2: ( rule__Student__AnswerAssignment_7_3_1 )
            {
             before(grammarAccess.getStudentAccess().getAnswerAssignment_7_3_1()); 
            // InternalDsl.g:2603:2: ( rule__Student__AnswerAssignment_7_3_1 )
            // InternalDsl.g:2603:3: rule__Student__AnswerAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Student__AnswerAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getAnswerAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_7_3__1__Impl"


    // $ANTLR start "rule__Course__Group__0"
    // InternalDsl.g:2612:1: rule__Course__Group__0 : rule__Course__Group__0__Impl rule__Course__Group__1 ;
    public final void rule__Course__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2616:1: ( rule__Course__Group__0__Impl rule__Course__Group__1 )
            // InternalDsl.g:2617:2: rule__Course__Group__0__Impl rule__Course__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Course__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__0"


    // $ANTLR start "rule__Course__Group__0__Impl"
    // InternalDsl.g:2624:1: rule__Course__Group__0__Impl : ( () ) ;
    public final void rule__Course__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2628:1: ( ( () ) )
            // InternalDsl.g:2629:1: ( () )
            {
            // InternalDsl.g:2629:1: ( () )
            // InternalDsl.g:2630:2: ()
            {
             before(grammarAccess.getCourseAccess().getCourseAction_0()); 
            // InternalDsl.g:2631:2: ()
            // InternalDsl.g:2631:3: 
            {
            }

             after(grammarAccess.getCourseAccess().getCourseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__0__Impl"


    // $ANTLR start "rule__Course__Group__1"
    // InternalDsl.g:2639:1: rule__Course__Group__1 : rule__Course__Group__1__Impl rule__Course__Group__2 ;
    public final void rule__Course__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2643:1: ( rule__Course__Group__1__Impl rule__Course__Group__2 )
            // InternalDsl.g:2644:2: rule__Course__Group__1__Impl rule__Course__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Course__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__1"


    // $ANTLR start "rule__Course__Group__1__Impl"
    // InternalDsl.g:2651:1: rule__Course__Group__1__Impl : ( 'Course' ) ;
    public final void rule__Course__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2655:1: ( ( 'Course' ) )
            // InternalDsl.g:2656:1: ( 'Course' )
            {
            // InternalDsl.g:2656:1: ( 'Course' )
            // InternalDsl.g:2657:2: 'Course'
            {
             before(grammarAccess.getCourseAccess().getCourseKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getCourseKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__1__Impl"


    // $ANTLR start "rule__Course__Group__2"
    // InternalDsl.g:2666:1: rule__Course__Group__2 : rule__Course__Group__2__Impl rule__Course__Group__3 ;
    public final void rule__Course__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2670:1: ( rule__Course__Group__2__Impl rule__Course__Group__3 )
            // InternalDsl.g:2671:2: rule__Course__Group__2__Impl rule__Course__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Course__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__2"


    // $ANTLR start "rule__Course__Group__2__Impl"
    // InternalDsl.g:2678:1: rule__Course__Group__2__Impl : ( ( rule__Course__NameAssignment_2 ) ) ;
    public final void rule__Course__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2682:1: ( ( ( rule__Course__NameAssignment_2 ) ) )
            // InternalDsl.g:2683:1: ( ( rule__Course__NameAssignment_2 ) )
            {
            // InternalDsl.g:2683:1: ( ( rule__Course__NameAssignment_2 ) )
            // InternalDsl.g:2684:2: ( rule__Course__NameAssignment_2 )
            {
             before(grammarAccess.getCourseAccess().getNameAssignment_2()); 
            // InternalDsl.g:2685:2: ( rule__Course__NameAssignment_2 )
            // InternalDsl.g:2685:3: rule__Course__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Course__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__2__Impl"


    // $ANTLR start "rule__Course__Group__3"
    // InternalDsl.g:2693:1: rule__Course__Group__3 : rule__Course__Group__3__Impl rule__Course__Group__4 ;
    public final void rule__Course__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2697:1: ( rule__Course__Group__3__Impl rule__Course__Group__4 )
            // InternalDsl.g:2698:2: rule__Course__Group__3__Impl rule__Course__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Course__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__3"


    // $ANTLR start "rule__Course__Group__3__Impl"
    // InternalDsl.g:2705:1: rule__Course__Group__3__Impl : ( '{' ) ;
    public final void rule__Course__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2709:1: ( ( '{' ) )
            // InternalDsl.g:2710:1: ( '{' )
            {
            // InternalDsl.g:2710:1: ( '{' )
            // InternalDsl.g:2711:2: '{'
            {
             before(grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__3__Impl"


    // $ANTLR start "rule__Course__Group__4"
    // InternalDsl.g:2720:1: rule__Course__Group__4 : rule__Course__Group__4__Impl rule__Course__Group__5 ;
    public final void rule__Course__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2724:1: ( rule__Course__Group__4__Impl rule__Course__Group__5 )
            // InternalDsl.g:2725:2: rule__Course__Group__4__Impl rule__Course__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Course__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__4"


    // $ANTLR start "rule__Course__Group__4__Impl"
    // InternalDsl.g:2732:1: rule__Course__Group__4__Impl : ( ( rule__Course__Group_4__0 )? ) ;
    public final void rule__Course__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2736:1: ( ( ( rule__Course__Group_4__0 )? ) )
            // InternalDsl.g:2737:1: ( ( rule__Course__Group_4__0 )? )
            {
            // InternalDsl.g:2737:1: ( ( rule__Course__Group_4__0 )? )
            // InternalDsl.g:2738:2: ( rule__Course__Group_4__0 )?
            {
             before(grammarAccess.getCourseAccess().getGroup_4()); 
            // InternalDsl.g:2739:2: ( rule__Course__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==16) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:2739:3: rule__Course__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Course__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCourseAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__4__Impl"


    // $ANTLR start "rule__Course__Group__5"
    // InternalDsl.g:2747:1: rule__Course__Group__5 : rule__Course__Group__5__Impl rule__Course__Group__6 ;
    public final void rule__Course__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2751:1: ( rule__Course__Group__5__Impl rule__Course__Group__6 )
            // InternalDsl.g:2752:2: rule__Course__Group__5__Impl rule__Course__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Course__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__5"


    // $ANTLR start "rule__Course__Group__5__Impl"
    // InternalDsl.g:2759:1: rule__Course__Group__5__Impl : ( ( rule__Course__Group_5__0 )? ) ;
    public final void rule__Course__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2763:1: ( ( ( rule__Course__Group_5__0 )? ) )
            // InternalDsl.g:2764:1: ( ( rule__Course__Group_5__0 )? )
            {
            // InternalDsl.g:2764:1: ( ( rule__Course__Group_5__0 )? )
            // InternalDsl.g:2765:2: ( rule__Course__Group_5__0 )?
            {
             before(grammarAccess.getCourseAccess().getGroup_5()); 
            // InternalDsl.g:2766:2: ( rule__Course__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDsl.g:2766:3: rule__Course__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Course__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCourseAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__5__Impl"


    // $ANTLR start "rule__Course__Group__6"
    // InternalDsl.g:2774:1: rule__Course__Group__6 : rule__Course__Group__6__Impl rule__Course__Group__7 ;
    public final void rule__Course__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2778:1: ( rule__Course__Group__6__Impl rule__Course__Group__7 )
            // InternalDsl.g:2779:2: rule__Course__Group__6__Impl rule__Course__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Course__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__6"


    // $ANTLR start "rule__Course__Group__6__Impl"
    // InternalDsl.g:2786:1: rule__Course__Group__6__Impl : ( ( rule__Course__Group_6__0 )? ) ;
    public final void rule__Course__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2790:1: ( ( ( rule__Course__Group_6__0 )? ) )
            // InternalDsl.g:2791:1: ( ( rule__Course__Group_6__0 )? )
            {
            // InternalDsl.g:2791:1: ( ( rule__Course__Group_6__0 )? )
            // InternalDsl.g:2792:2: ( rule__Course__Group_6__0 )?
            {
             before(grammarAccess.getCourseAccess().getGroup_6()); 
            // InternalDsl.g:2793:2: ( rule__Course__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:2793:3: rule__Course__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Course__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCourseAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__6__Impl"


    // $ANTLR start "rule__Course__Group__7"
    // InternalDsl.g:2801:1: rule__Course__Group__7 : rule__Course__Group__7__Impl ;
    public final void rule__Course__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2805:1: ( rule__Course__Group__7__Impl )
            // InternalDsl.g:2806:2: rule__Course__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Course__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__7"


    // $ANTLR start "rule__Course__Group__7__Impl"
    // InternalDsl.g:2812:1: rule__Course__Group__7__Impl : ( '}' ) ;
    public final void rule__Course__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2816:1: ( ( '}' ) )
            // InternalDsl.g:2817:1: ( '}' )
            {
            // InternalDsl.g:2817:1: ( '}' )
            // InternalDsl.g:2818:2: '}'
            {
             before(grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__7__Impl"


    // $ANTLR start "rule__Course__Group_4__0"
    // InternalDsl.g:2828:1: rule__Course__Group_4__0 : rule__Course__Group_4__0__Impl rule__Course__Group_4__1 ;
    public final void rule__Course__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2832:1: ( rule__Course__Group_4__0__Impl rule__Course__Group_4__1 )
            // InternalDsl.g:2833:2: rule__Course__Group_4__0__Impl rule__Course__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Course__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4__0"


    // $ANTLR start "rule__Course__Group_4__0__Impl"
    // InternalDsl.g:2840:1: rule__Course__Group_4__0__Impl : ( 'id' ) ;
    public final void rule__Course__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2844:1: ( ( 'id' ) )
            // InternalDsl.g:2845:1: ( 'id' )
            {
            // InternalDsl.g:2845:1: ( 'id' )
            // InternalDsl.g:2846:2: 'id'
            {
             before(grammarAccess.getCourseAccess().getIdKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getIdKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4__0__Impl"


    // $ANTLR start "rule__Course__Group_4__1"
    // InternalDsl.g:2855:1: rule__Course__Group_4__1 : rule__Course__Group_4__1__Impl ;
    public final void rule__Course__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2859:1: ( rule__Course__Group_4__1__Impl )
            // InternalDsl.g:2860:2: rule__Course__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Course__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4__1"


    // $ANTLR start "rule__Course__Group_4__1__Impl"
    // InternalDsl.g:2866:1: rule__Course__Group_4__1__Impl : ( ( rule__Course__IdAssignment_4_1 ) ) ;
    public final void rule__Course__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2870:1: ( ( ( rule__Course__IdAssignment_4_1 ) ) )
            // InternalDsl.g:2871:1: ( ( rule__Course__IdAssignment_4_1 ) )
            {
            // InternalDsl.g:2871:1: ( ( rule__Course__IdAssignment_4_1 ) )
            // InternalDsl.g:2872:2: ( rule__Course__IdAssignment_4_1 )
            {
             before(grammarAccess.getCourseAccess().getIdAssignment_4_1()); 
            // InternalDsl.g:2873:2: ( rule__Course__IdAssignment_4_1 )
            // InternalDsl.g:2873:3: rule__Course__IdAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Course__IdAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getIdAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4__1__Impl"


    // $ANTLR start "rule__Course__Group_5__0"
    // InternalDsl.g:2882:1: rule__Course__Group_5__0 : rule__Course__Group_5__0__Impl rule__Course__Group_5__1 ;
    public final void rule__Course__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2886:1: ( rule__Course__Group_5__0__Impl rule__Course__Group_5__1 )
            // InternalDsl.g:2887:2: rule__Course__Group_5__0__Impl rule__Course__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__Course__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_5__0"


    // $ANTLR start "rule__Course__Group_5__0__Impl"
    // InternalDsl.g:2894:1: rule__Course__Group_5__0__Impl : ( 'stunum' ) ;
    public final void rule__Course__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2898:1: ( ( 'stunum' ) )
            // InternalDsl.g:2899:1: ( 'stunum' )
            {
            // InternalDsl.g:2899:1: ( 'stunum' )
            // InternalDsl.g:2900:2: 'stunum'
            {
             before(grammarAccess.getCourseAccess().getStunumKeyword_5_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getStunumKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_5__0__Impl"


    // $ANTLR start "rule__Course__Group_5__1"
    // InternalDsl.g:2909:1: rule__Course__Group_5__1 : rule__Course__Group_5__1__Impl ;
    public final void rule__Course__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2913:1: ( rule__Course__Group_5__1__Impl )
            // InternalDsl.g:2914:2: rule__Course__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Course__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_5__1"


    // $ANTLR start "rule__Course__Group_5__1__Impl"
    // InternalDsl.g:2920:1: rule__Course__Group_5__1__Impl : ( ( rule__Course__StunumAssignment_5_1 ) ) ;
    public final void rule__Course__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2924:1: ( ( ( rule__Course__StunumAssignment_5_1 ) ) )
            // InternalDsl.g:2925:1: ( ( rule__Course__StunumAssignment_5_1 ) )
            {
            // InternalDsl.g:2925:1: ( ( rule__Course__StunumAssignment_5_1 ) )
            // InternalDsl.g:2926:2: ( rule__Course__StunumAssignment_5_1 )
            {
             before(grammarAccess.getCourseAccess().getStunumAssignment_5_1()); 
            // InternalDsl.g:2927:2: ( rule__Course__StunumAssignment_5_1 )
            // InternalDsl.g:2927:3: rule__Course__StunumAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Course__StunumAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getStunumAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_5__1__Impl"


    // $ANTLR start "rule__Course__Group_6__0"
    // InternalDsl.g:2936:1: rule__Course__Group_6__0 : rule__Course__Group_6__0__Impl rule__Course__Group_6__1 ;
    public final void rule__Course__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2940:1: ( rule__Course__Group_6__0__Impl rule__Course__Group_6__1 )
            // InternalDsl.g:2941:2: rule__Course__Group_6__0__Impl rule__Course__Group_6__1
            {
            pushFollow(FOLLOW_22);
            rule__Course__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_6__0"


    // $ANTLR start "rule__Course__Group_6__0__Impl"
    // InternalDsl.g:2948:1: rule__Course__Group_6__0__Impl : ( 'mean' ) ;
    public final void rule__Course__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2952:1: ( ( 'mean' ) )
            // InternalDsl.g:2953:1: ( 'mean' )
            {
            // InternalDsl.g:2953:1: ( 'mean' )
            // InternalDsl.g:2954:2: 'mean'
            {
             before(grammarAccess.getCourseAccess().getMeanKeyword_6_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getMeanKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_6__0__Impl"


    // $ANTLR start "rule__Course__Group_6__1"
    // InternalDsl.g:2963:1: rule__Course__Group_6__1 : rule__Course__Group_6__1__Impl ;
    public final void rule__Course__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2967:1: ( rule__Course__Group_6__1__Impl )
            // InternalDsl.g:2968:2: rule__Course__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Course__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_6__1"


    // $ANTLR start "rule__Course__Group_6__1__Impl"
    // InternalDsl.g:2974:1: rule__Course__Group_6__1__Impl : ( ( rule__Course__MeanAssignment_6_1 ) ) ;
    public final void rule__Course__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2978:1: ( ( ( rule__Course__MeanAssignment_6_1 ) ) )
            // InternalDsl.g:2979:1: ( ( rule__Course__MeanAssignment_6_1 ) )
            {
            // InternalDsl.g:2979:1: ( ( rule__Course__MeanAssignment_6_1 ) )
            // InternalDsl.g:2980:2: ( rule__Course__MeanAssignment_6_1 )
            {
             before(grammarAccess.getCourseAccess().getMeanAssignment_6_1()); 
            // InternalDsl.g:2981:2: ( rule__Course__MeanAssignment_6_1 )
            // InternalDsl.g:2981:3: rule__Course__MeanAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Course__MeanAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getMeanAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_6__1__Impl"


    // $ANTLR start "rule__ReportCard__Group__0"
    // InternalDsl.g:2990:1: rule__ReportCard__Group__0 : rule__ReportCard__Group__0__Impl rule__ReportCard__Group__1 ;
    public final void rule__ReportCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2994:1: ( rule__ReportCard__Group__0__Impl rule__ReportCard__Group__1 )
            // InternalDsl.g:2995:2: rule__ReportCard__Group__0__Impl rule__ReportCard__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__ReportCard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReportCard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group__0"


    // $ANTLR start "rule__ReportCard__Group__0__Impl"
    // InternalDsl.g:3002:1: rule__ReportCard__Group__0__Impl : ( () ) ;
    public final void rule__ReportCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3006:1: ( ( () ) )
            // InternalDsl.g:3007:1: ( () )
            {
            // InternalDsl.g:3007:1: ( () )
            // InternalDsl.g:3008:2: ()
            {
             before(grammarAccess.getReportCardAccess().getReportCardAction_0()); 
            // InternalDsl.g:3009:2: ()
            // InternalDsl.g:3009:3: 
            {
            }

             after(grammarAccess.getReportCardAccess().getReportCardAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group__0__Impl"


    // $ANTLR start "rule__ReportCard__Group__1"
    // InternalDsl.g:3017:1: rule__ReportCard__Group__1 : rule__ReportCard__Group__1__Impl rule__ReportCard__Group__2 ;
    public final void rule__ReportCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3021:1: ( rule__ReportCard__Group__1__Impl rule__ReportCard__Group__2 )
            // InternalDsl.g:3022:2: rule__ReportCard__Group__1__Impl rule__ReportCard__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ReportCard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReportCard__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group__1"


    // $ANTLR start "rule__ReportCard__Group__1__Impl"
    // InternalDsl.g:3029:1: rule__ReportCard__Group__1__Impl : ( 'ReportCard' ) ;
    public final void rule__ReportCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3033:1: ( ( 'ReportCard' ) )
            // InternalDsl.g:3034:1: ( 'ReportCard' )
            {
            // InternalDsl.g:3034:1: ( 'ReportCard' )
            // InternalDsl.g:3035:2: 'ReportCard'
            {
             before(grammarAccess.getReportCardAccess().getReportCardKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getReportCardAccess().getReportCardKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group__1__Impl"


    // $ANTLR start "rule__ReportCard__Group__2"
    // InternalDsl.g:3044:1: rule__ReportCard__Group__2 : rule__ReportCard__Group__2__Impl rule__ReportCard__Group__3 ;
    public final void rule__ReportCard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3048:1: ( rule__ReportCard__Group__2__Impl rule__ReportCard__Group__3 )
            // InternalDsl.g:3049:2: rule__ReportCard__Group__2__Impl rule__ReportCard__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__ReportCard__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReportCard__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group__2"


    // $ANTLR start "rule__ReportCard__Group__2__Impl"
    // InternalDsl.g:3056:1: rule__ReportCard__Group__2__Impl : ( '{' ) ;
    public final void rule__ReportCard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3060:1: ( ( '{' ) )
            // InternalDsl.g:3061:1: ( '{' )
            {
            // InternalDsl.g:3061:1: ( '{' )
            // InternalDsl.g:3062:2: '{'
            {
             before(grammarAccess.getReportCardAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getReportCardAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group__2__Impl"


    // $ANTLR start "rule__ReportCard__Group__3"
    // InternalDsl.g:3071:1: rule__ReportCard__Group__3 : rule__ReportCard__Group__3__Impl rule__ReportCard__Group__4 ;
    public final void rule__ReportCard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3075:1: ( rule__ReportCard__Group__3__Impl rule__ReportCard__Group__4 )
            // InternalDsl.g:3076:2: rule__ReportCard__Group__3__Impl rule__ReportCard__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__ReportCard__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReportCard__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group__3"


    // $ANTLR start "rule__ReportCard__Group__3__Impl"
    // InternalDsl.g:3083:1: rule__ReportCard__Group__3__Impl : ( ( rule__ReportCard__Group_3__0 )? ) ;
    public final void rule__ReportCard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3087:1: ( ( ( rule__ReportCard__Group_3__0 )? ) )
            // InternalDsl.g:3088:1: ( ( rule__ReportCard__Group_3__0 )? )
            {
            // InternalDsl.g:3088:1: ( ( rule__ReportCard__Group_3__0 )? )
            // InternalDsl.g:3089:2: ( rule__ReportCard__Group_3__0 )?
            {
             before(grammarAccess.getReportCardAccess().getGroup_3()); 
            // InternalDsl.g:3090:2: ( rule__ReportCard__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==16) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDsl.g:3090:3: rule__ReportCard__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReportCard__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReportCardAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group__3__Impl"


    // $ANTLR start "rule__ReportCard__Group__4"
    // InternalDsl.g:3098:1: rule__ReportCard__Group__4 : rule__ReportCard__Group__4__Impl rule__ReportCard__Group__5 ;
    public final void rule__ReportCard__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3102:1: ( rule__ReportCard__Group__4__Impl rule__ReportCard__Group__5 )
            // InternalDsl.g:3103:2: rule__ReportCard__Group__4__Impl rule__ReportCard__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__ReportCard__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReportCard__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group__4"


    // $ANTLR start "rule__ReportCard__Group__4__Impl"
    // InternalDsl.g:3110:1: rule__ReportCard__Group__4__Impl : ( ( rule__ReportCard__Group_4__0 )? ) ;
    public final void rule__ReportCard__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3114:1: ( ( ( rule__ReportCard__Group_4__0 )? ) )
            // InternalDsl.g:3115:1: ( ( rule__ReportCard__Group_4__0 )? )
            {
            // InternalDsl.g:3115:1: ( ( rule__ReportCard__Group_4__0 )? )
            // InternalDsl.g:3116:2: ( rule__ReportCard__Group_4__0 )?
            {
             before(grammarAccess.getReportCardAccess().getGroup_4()); 
            // InternalDsl.g:3117:2: ( rule__ReportCard__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDsl.g:3117:3: rule__ReportCard__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReportCard__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReportCardAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group__4__Impl"


    // $ANTLR start "rule__ReportCard__Group__5"
    // InternalDsl.g:3125:1: rule__ReportCard__Group__5 : rule__ReportCard__Group__5__Impl rule__ReportCard__Group__6 ;
    public final void rule__ReportCard__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3129:1: ( rule__ReportCard__Group__5__Impl rule__ReportCard__Group__6 )
            // InternalDsl.g:3130:2: rule__ReportCard__Group__5__Impl rule__ReportCard__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__ReportCard__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReportCard__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group__5"


    // $ANTLR start "rule__ReportCard__Group__5__Impl"
    // InternalDsl.g:3137:1: rule__ReportCard__Group__5__Impl : ( ( rule__ReportCard__Group_5__0 )? ) ;
    public final void rule__ReportCard__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3141:1: ( ( ( rule__ReportCard__Group_5__0 )? ) )
            // InternalDsl.g:3142:1: ( ( rule__ReportCard__Group_5__0 )? )
            {
            // InternalDsl.g:3142:1: ( ( rule__ReportCard__Group_5__0 )? )
            // InternalDsl.g:3143:2: ( rule__ReportCard__Group_5__0 )?
            {
             before(grammarAccess.getReportCardAccess().getGroup_5()); 
            // InternalDsl.g:3144:2: ( rule__ReportCard__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDsl.g:3144:3: rule__ReportCard__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReportCard__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReportCardAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group__5__Impl"


    // $ANTLR start "rule__ReportCard__Group__6"
    // InternalDsl.g:3152:1: rule__ReportCard__Group__6 : rule__ReportCard__Group__6__Impl rule__ReportCard__Group__7 ;
    public final void rule__ReportCard__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3156:1: ( rule__ReportCard__Group__6__Impl rule__ReportCard__Group__7 )
            // InternalDsl.g:3157:2: rule__ReportCard__Group__6__Impl rule__ReportCard__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__ReportCard__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReportCard__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group__6"


    // $ANTLR start "rule__ReportCard__Group__6__Impl"
    // InternalDsl.g:3164:1: rule__ReportCard__Group__6__Impl : ( ( rule__ReportCard__Group_6__0 )? ) ;
    public final void rule__ReportCard__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3168:1: ( ( ( rule__ReportCard__Group_6__0 )? ) )
            // InternalDsl.g:3169:1: ( ( rule__ReportCard__Group_6__0 )? )
            {
            // InternalDsl.g:3169:1: ( ( rule__ReportCard__Group_6__0 )? )
            // InternalDsl.g:3170:2: ( rule__ReportCard__Group_6__0 )?
            {
             before(grammarAccess.getReportCardAccess().getGroup_6()); 
            // InternalDsl.g:3171:2: ( rule__ReportCard__Group_6__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==39) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDsl.g:3171:3: rule__ReportCard__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReportCard__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReportCardAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group__6__Impl"


    // $ANTLR start "rule__ReportCard__Group__7"
    // InternalDsl.g:3179:1: rule__ReportCard__Group__7 : rule__ReportCard__Group__7__Impl rule__ReportCard__Group__8 ;
    public final void rule__ReportCard__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3183:1: ( rule__ReportCard__Group__7__Impl rule__ReportCard__Group__8 )
            // InternalDsl.g:3184:2: rule__ReportCard__Group__7__Impl rule__ReportCard__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__ReportCard__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReportCard__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group__7"


    // $ANTLR start "rule__ReportCard__Group__7__Impl"
    // InternalDsl.g:3191:1: rule__ReportCard__Group__7__Impl : ( ( rule__ReportCard__Group_7__0 )? ) ;
    public final void rule__ReportCard__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3195:1: ( ( ( rule__ReportCard__Group_7__0 )? ) )
            // InternalDsl.g:3196:1: ( ( rule__ReportCard__Group_7__0 )? )
            {
            // InternalDsl.g:3196:1: ( ( rule__ReportCard__Group_7__0 )? )
            // InternalDsl.g:3197:2: ( rule__ReportCard__Group_7__0 )?
            {
             before(grammarAccess.getReportCardAccess().getGroup_7()); 
            // InternalDsl.g:3198:2: ( rule__ReportCard__Group_7__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==40) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDsl.g:3198:3: rule__ReportCard__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReportCard__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReportCardAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group__7__Impl"


    // $ANTLR start "rule__ReportCard__Group__8"
    // InternalDsl.g:3206:1: rule__ReportCard__Group__8 : rule__ReportCard__Group__8__Impl ;
    public final void rule__ReportCard__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3210:1: ( rule__ReportCard__Group__8__Impl )
            // InternalDsl.g:3211:2: rule__ReportCard__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReportCard__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group__8"


    // $ANTLR start "rule__ReportCard__Group__8__Impl"
    // InternalDsl.g:3217:1: rule__ReportCard__Group__8__Impl : ( '}' ) ;
    public final void rule__ReportCard__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3221:1: ( ( '}' ) )
            // InternalDsl.g:3222:1: ( '}' )
            {
            // InternalDsl.g:3222:1: ( '}' )
            // InternalDsl.g:3223:2: '}'
            {
             before(grammarAccess.getReportCardAccess().getRightCurlyBracketKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getReportCardAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group__8__Impl"


    // $ANTLR start "rule__ReportCard__Group_3__0"
    // InternalDsl.g:3233:1: rule__ReportCard__Group_3__0 : rule__ReportCard__Group_3__0__Impl rule__ReportCard__Group_3__1 ;
    public final void rule__ReportCard__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3237:1: ( rule__ReportCard__Group_3__0__Impl rule__ReportCard__Group_3__1 )
            // InternalDsl.g:3238:2: rule__ReportCard__Group_3__0__Impl rule__ReportCard__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__ReportCard__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReportCard__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group_3__0"


    // $ANTLR start "rule__ReportCard__Group_3__0__Impl"
    // InternalDsl.g:3245:1: rule__ReportCard__Group_3__0__Impl : ( 'id' ) ;
    public final void rule__ReportCard__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3249:1: ( ( 'id' ) )
            // InternalDsl.g:3250:1: ( 'id' )
            {
            // InternalDsl.g:3250:1: ( 'id' )
            // InternalDsl.g:3251:2: 'id'
            {
             before(grammarAccess.getReportCardAccess().getIdKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getReportCardAccess().getIdKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group_3__0__Impl"


    // $ANTLR start "rule__ReportCard__Group_3__1"
    // InternalDsl.g:3260:1: rule__ReportCard__Group_3__1 : rule__ReportCard__Group_3__1__Impl ;
    public final void rule__ReportCard__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3264:1: ( rule__ReportCard__Group_3__1__Impl )
            // InternalDsl.g:3265:2: rule__ReportCard__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReportCard__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group_3__1"


    // $ANTLR start "rule__ReportCard__Group_3__1__Impl"
    // InternalDsl.g:3271:1: rule__ReportCard__Group_3__1__Impl : ( ( rule__ReportCard__IdAssignment_3_1 ) ) ;
    public final void rule__ReportCard__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3275:1: ( ( ( rule__ReportCard__IdAssignment_3_1 ) ) )
            // InternalDsl.g:3276:1: ( ( rule__ReportCard__IdAssignment_3_1 ) )
            {
            // InternalDsl.g:3276:1: ( ( rule__ReportCard__IdAssignment_3_1 ) )
            // InternalDsl.g:3277:2: ( rule__ReportCard__IdAssignment_3_1 )
            {
             before(grammarAccess.getReportCardAccess().getIdAssignment_3_1()); 
            // InternalDsl.g:3278:2: ( rule__ReportCard__IdAssignment_3_1 )
            // InternalDsl.g:3278:3: rule__ReportCard__IdAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ReportCard__IdAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getReportCardAccess().getIdAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group_3__1__Impl"


    // $ANTLR start "rule__ReportCard__Group_4__0"
    // InternalDsl.g:3287:1: rule__ReportCard__Group_4__0 : rule__ReportCard__Group_4__0__Impl rule__ReportCard__Group_4__1 ;
    public final void rule__ReportCard__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3291:1: ( rule__ReportCard__Group_4__0__Impl rule__ReportCard__Group_4__1 )
            // InternalDsl.g:3292:2: rule__ReportCard__Group_4__0__Impl rule__ReportCard__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__ReportCard__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReportCard__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group_4__0"


    // $ANTLR start "rule__ReportCard__Group_4__0__Impl"
    // InternalDsl.g:3299:1: rule__ReportCard__Group_4__0__Impl : ( 'stuid' ) ;
    public final void rule__ReportCard__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3303:1: ( ( 'stuid' ) )
            // InternalDsl.g:3304:1: ( 'stuid' )
            {
            // InternalDsl.g:3304:1: ( 'stuid' )
            // InternalDsl.g:3305:2: 'stuid'
            {
             before(grammarAccess.getReportCardAccess().getStuidKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getReportCardAccess().getStuidKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group_4__0__Impl"


    // $ANTLR start "rule__ReportCard__Group_4__1"
    // InternalDsl.g:3314:1: rule__ReportCard__Group_4__1 : rule__ReportCard__Group_4__1__Impl ;
    public final void rule__ReportCard__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3318:1: ( rule__ReportCard__Group_4__1__Impl )
            // InternalDsl.g:3319:2: rule__ReportCard__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReportCard__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group_4__1"


    // $ANTLR start "rule__ReportCard__Group_4__1__Impl"
    // InternalDsl.g:3325:1: rule__ReportCard__Group_4__1__Impl : ( ( rule__ReportCard__StuidAssignment_4_1 ) ) ;
    public final void rule__ReportCard__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3329:1: ( ( ( rule__ReportCard__StuidAssignment_4_1 ) ) )
            // InternalDsl.g:3330:1: ( ( rule__ReportCard__StuidAssignment_4_1 ) )
            {
            // InternalDsl.g:3330:1: ( ( rule__ReportCard__StuidAssignment_4_1 ) )
            // InternalDsl.g:3331:2: ( rule__ReportCard__StuidAssignment_4_1 )
            {
             before(grammarAccess.getReportCardAccess().getStuidAssignment_4_1()); 
            // InternalDsl.g:3332:2: ( rule__ReportCard__StuidAssignment_4_1 )
            // InternalDsl.g:3332:3: rule__ReportCard__StuidAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ReportCard__StuidAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getReportCardAccess().getStuidAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group_4__1__Impl"


    // $ANTLR start "rule__ReportCard__Group_5__0"
    // InternalDsl.g:3341:1: rule__ReportCard__Group_5__0 : rule__ReportCard__Group_5__0__Impl rule__ReportCard__Group_5__1 ;
    public final void rule__ReportCard__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3345:1: ( rule__ReportCard__Group_5__0__Impl rule__ReportCard__Group_5__1 )
            // InternalDsl.g:3346:2: rule__ReportCard__Group_5__0__Impl rule__ReportCard__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__ReportCard__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReportCard__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group_5__0"


    // $ANTLR start "rule__ReportCard__Group_5__0__Impl"
    // InternalDsl.g:3353:1: rule__ReportCard__Group_5__0__Impl : ( 'stuname' ) ;
    public final void rule__ReportCard__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3357:1: ( ( 'stuname' ) )
            // InternalDsl.g:3358:1: ( 'stuname' )
            {
            // InternalDsl.g:3358:1: ( 'stuname' )
            // InternalDsl.g:3359:2: 'stuname'
            {
             before(grammarAccess.getReportCardAccess().getStunameKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getReportCardAccess().getStunameKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group_5__0__Impl"


    // $ANTLR start "rule__ReportCard__Group_5__1"
    // InternalDsl.g:3368:1: rule__ReportCard__Group_5__1 : rule__ReportCard__Group_5__1__Impl ;
    public final void rule__ReportCard__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3372:1: ( rule__ReportCard__Group_5__1__Impl )
            // InternalDsl.g:3373:2: rule__ReportCard__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReportCard__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group_5__1"


    // $ANTLR start "rule__ReportCard__Group_5__1__Impl"
    // InternalDsl.g:3379:1: rule__ReportCard__Group_5__1__Impl : ( ( rule__ReportCard__StunameAssignment_5_1 ) ) ;
    public final void rule__ReportCard__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3383:1: ( ( ( rule__ReportCard__StunameAssignment_5_1 ) ) )
            // InternalDsl.g:3384:1: ( ( rule__ReportCard__StunameAssignment_5_1 ) )
            {
            // InternalDsl.g:3384:1: ( ( rule__ReportCard__StunameAssignment_5_1 ) )
            // InternalDsl.g:3385:2: ( rule__ReportCard__StunameAssignment_5_1 )
            {
             before(grammarAccess.getReportCardAccess().getStunameAssignment_5_1()); 
            // InternalDsl.g:3386:2: ( rule__ReportCard__StunameAssignment_5_1 )
            // InternalDsl.g:3386:3: rule__ReportCard__StunameAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ReportCard__StunameAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getReportCardAccess().getStunameAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group_5__1__Impl"


    // $ANTLR start "rule__ReportCard__Group_6__0"
    // InternalDsl.g:3395:1: rule__ReportCard__Group_6__0 : rule__ReportCard__Group_6__0__Impl rule__ReportCard__Group_6__1 ;
    public final void rule__ReportCard__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3399:1: ( rule__ReportCard__Group_6__0__Impl rule__ReportCard__Group_6__1 )
            // InternalDsl.g:3400:2: rule__ReportCard__Group_6__0__Impl rule__ReportCard__Group_6__1
            {
            pushFollow(FOLLOW_22);
            rule__ReportCard__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReportCard__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group_6__0"


    // $ANTLR start "rule__ReportCard__Group_6__0__Impl"
    // InternalDsl.g:3407:1: rule__ReportCard__Group_6__0__Impl : ( 'totalscore' ) ;
    public final void rule__ReportCard__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3411:1: ( ( 'totalscore' ) )
            // InternalDsl.g:3412:1: ( 'totalscore' )
            {
            // InternalDsl.g:3412:1: ( 'totalscore' )
            // InternalDsl.g:3413:2: 'totalscore'
            {
             before(grammarAccess.getReportCardAccess().getTotalscoreKeyword_6_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getReportCardAccess().getTotalscoreKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group_6__0__Impl"


    // $ANTLR start "rule__ReportCard__Group_6__1"
    // InternalDsl.g:3422:1: rule__ReportCard__Group_6__1 : rule__ReportCard__Group_6__1__Impl ;
    public final void rule__ReportCard__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3426:1: ( rule__ReportCard__Group_6__1__Impl )
            // InternalDsl.g:3427:2: rule__ReportCard__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReportCard__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group_6__1"


    // $ANTLR start "rule__ReportCard__Group_6__1__Impl"
    // InternalDsl.g:3433:1: rule__ReportCard__Group_6__1__Impl : ( ( rule__ReportCard__TotalscoreAssignment_6_1 ) ) ;
    public final void rule__ReportCard__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3437:1: ( ( ( rule__ReportCard__TotalscoreAssignment_6_1 ) ) )
            // InternalDsl.g:3438:1: ( ( rule__ReportCard__TotalscoreAssignment_6_1 ) )
            {
            // InternalDsl.g:3438:1: ( ( rule__ReportCard__TotalscoreAssignment_6_1 ) )
            // InternalDsl.g:3439:2: ( rule__ReportCard__TotalscoreAssignment_6_1 )
            {
             before(grammarAccess.getReportCardAccess().getTotalscoreAssignment_6_1()); 
            // InternalDsl.g:3440:2: ( rule__ReportCard__TotalscoreAssignment_6_1 )
            // InternalDsl.g:3440:3: rule__ReportCard__TotalscoreAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ReportCard__TotalscoreAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getReportCardAccess().getTotalscoreAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group_6__1__Impl"


    // $ANTLR start "rule__ReportCard__Group_7__0"
    // InternalDsl.g:3449:1: rule__ReportCard__Group_7__0 : rule__ReportCard__Group_7__0__Impl rule__ReportCard__Group_7__1 ;
    public final void rule__ReportCard__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3453:1: ( rule__ReportCard__Group_7__0__Impl rule__ReportCard__Group_7__1 )
            // InternalDsl.g:3454:2: rule__ReportCard__Group_7__0__Impl rule__ReportCard__Group_7__1
            {
            pushFollow(FOLLOW_7);
            rule__ReportCard__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReportCard__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group_7__0"


    // $ANTLR start "rule__ReportCard__Group_7__0__Impl"
    // InternalDsl.g:3461:1: rule__ReportCard__Group_7__0__Impl : ( 'rank' ) ;
    public final void rule__ReportCard__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3465:1: ( ( 'rank' ) )
            // InternalDsl.g:3466:1: ( 'rank' )
            {
            // InternalDsl.g:3466:1: ( 'rank' )
            // InternalDsl.g:3467:2: 'rank'
            {
             before(grammarAccess.getReportCardAccess().getRankKeyword_7_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getReportCardAccess().getRankKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group_7__0__Impl"


    // $ANTLR start "rule__ReportCard__Group_7__1"
    // InternalDsl.g:3476:1: rule__ReportCard__Group_7__1 : rule__ReportCard__Group_7__1__Impl ;
    public final void rule__ReportCard__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3480:1: ( rule__ReportCard__Group_7__1__Impl )
            // InternalDsl.g:3481:2: rule__ReportCard__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReportCard__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group_7__1"


    // $ANTLR start "rule__ReportCard__Group_7__1__Impl"
    // InternalDsl.g:3487:1: rule__ReportCard__Group_7__1__Impl : ( ( rule__ReportCard__RankAssignment_7_1 ) ) ;
    public final void rule__ReportCard__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3491:1: ( ( ( rule__ReportCard__RankAssignment_7_1 ) ) )
            // InternalDsl.g:3492:1: ( ( rule__ReportCard__RankAssignment_7_1 ) )
            {
            // InternalDsl.g:3492:1: ( ( rule__ReportCard__RankAssignment_7_1 ) )
            // InternalDsl.g:3493:2: ( rule__ReportCard__RankAssignment_7_1 )
            {
             before(grammarAccess.getReportCardAccess().getRankAssignment_7_1()); 
            // InternalDsl.g:3494:2: ( rule__ReportCard__RankAssignment_7_1 )
            // InternalDsl.g:3494:3: rule__ReportCard__RankAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ReportCard__RankAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getReportCardAccess().getRankAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__Group_7__1__Impl"


    // $ANTLR start "rule__SubmitedPaper__Group__0"
    // InternalDsl.g:3503:1: rule__SubmitedPaper__Group__0 : rule__SubmitedPaper__Group__0__Impl rule__SubmitedPaper__Group__1 ;
    public final void rule__SubmitedPaper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3507:1: ( rule__SubmitedPaper__Group__0__Impl rule__SubmitedPaper__Group__1 )
            // InternalDsl.g:3508:2: rule__SubmitedPaper__Group__0__Impl rule__SubmitedPaper__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__SubmitedPaper__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmitedPaper__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group__0"


    // $ANTLR start "rule__SubmitedPaper__Group__0__Impl"
    // InternalDsl.g:3515:1: rule__SubmitedPaper__Group__0__Impl : ( () ) ;
    public final void rule__SubmitedPaper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3519:1: ( ( () ) )
            // InternalDsl.g:3520:1: ( () )
            {
            // InternalDsl.g:3520:1: ( () )
            // InternalDsl.g:3521:2: ()
            {
             before(grammarAccess.getSubmitedPaperAccess().getSubmitedPaperAction_0()); 
            // InternalDsl.g:3522:2: ()
            // InternalDsl.g:3522:3: 
            {
            }

             after(grammarAccess.getSubmitedPaperAccess().getSubmitedPaperAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group__0__Impl"


    // $ANTLR start "rule__SubmitedPaper__Group__1"
    // InternalDsl.g:3530:1: rule__SubmitedPaper__Group__1 : rule__SubmitedPaper__Group__1__Impl rule__SubmitedPaper__Group__2 ;
    public final void rule__SubmitedPaper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3534:1: ( rule__SubmitedPaper__Group__1__Impl rule__SubmitedPaper__Group__2 )
            // InternalDsl.g:3535:2: rule__SubmitedPaper__Group__1__Impl rule__SubmitedPaper__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__SubmitedPaper__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmitedPaper__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group__1"


    // $ANTLR start "rule__SubmitedPaper__Group__1__Impl"
    // InternalDsl.g:3542:1: rule__SubmitedPaper__Group__1__Impl : ( ( rule__SubmitedPaper__IfcorrectAssignment_1 )? ) ;
    public final void rule__SubmitedPaper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3546:1: ( ( ( rule__SubmitedPaper__IfcorrectAssignment_1 )? ) )
            // InternalDsl.g:3547:1: ( ( rule__SubmitedPaper__IfcorrectAssignment_1 )? )
            {
            // InternalDsl.g:3547:1: ( ( rule__SubmitedPaper__IfcorrectAssignment_1 )? )
            // InternalDsl.g:3548:2: ( rule__SubmitedPaper__IfcorrectAssignment_1 )?
            {
             before(grammarAccess.getSubmitedPaperAccess().getIfcorrectAssignment_1()); 
            // InternalDsl.g:3549:2: ( rule__SubmitedPaper__IfcorrectAssignment_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==48) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDsl.g:3549:3: rule__SubmitedPaper__IfcorrectAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubmitedPaper__IfcorrectAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubmitedPaperAccess().getIfcorrectAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group__1__Impl"


    // $ANTLR start "rule__SubmitedPaper__Group__2"
    // InternalDsl.g:3557:1: rule__SubmitedPaper__Group__2 : rule__SubmitedPaper__Group__2__Impl rule__SubmitedPaper__Group__3 ;
    public final void rule__SubmitedPaper__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3561:1: ( rule__SubmitedPaper__Group__2__Impl rule__SubmitedPaper__Group__3 )
            // InternalDsl.g:3562:2: rule__SubmitedPaper__Group__2__Impl rule__SubmitedPaper__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__SubmitedPaper__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmitedPaper__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group__2"


    // $ANTLR start "rule__SubmitedPaper__Group__2__Impl"
    // InternalDsl.g:3569:1: rule__SubmitedPaper__Group__2__Impl : ( ( rule__SubmitedPaper__IfanswerAssignment_2 )? ) ;
    public final void rule__SubmitedPaper__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3573:1: ( ( ( rule__SubmitedPaper__IfanswerAssignment_2 )? ) )
            // InternalDsl.g:3574:1: ( ( rule__SubmitedPaper__IfanswerAssignment_2 )? )
            {
            // InternalDsl.g:3574:1: ( ( rule__SubmitedPaper__IfanswerAssignment_2 )? )
            // InternalDsl.g:3575:2: ( rule__SubmitedPaper__IfanswerAssignment_2 )?
            {
             before(grammarAccess.getSubmitedPaperAccess().getIfanswerAssignment_2()); 
            // InternalDsl.g:3576:2: ( rule__SubmitedPaper__IfanswerAssignment_2 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==49) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDsl.g:3576:3: rule__SubmitedPaper__IfanswerAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubmitedPaper__IfanswerAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubmitedPaperAccess().getIfanswerAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group__2__Impl"


    // $ANTLR start "rule__SubmitedPaper__Group__3"
    // InternalDsl.g:3584:1: rule__SubmitedPaper__Group__3 : rule__SubmitedPaper__Group__3__Impl rule__SubmitedPaper__Group__4 ;
    public final void rule__SubmitedPaper__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3588:1: ( rule__SubmitedPaper__Group__3__Impl rule__SubmitedPaper__Group__4 )
            // InternalDsl.g:3589:2: rule__SubmitedPaper__Group__3__Impl rule__SubmitedPaper__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__SubmitedPaper__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmitedPaper__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group__3"


    // $ANTLR start "rule__SubmitedPaper__Group__3__Impl"
    // InternalDsl.g:3596:1: rule__SubmitedPaper__Group__3__Impl : ( 'SubmitedPaper' ) ;
    public final void rule__SubmitedPaper__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3600:1: ( ( 'SubmitedPaper' ) )
            // InternalDsl.g:3601:1: ( 'SubmitedPaper' )
            {
            // InternalDsl.g:3601:1: ( 'SubmitedPaper' )
            // InternalDsl.g:3602:2: 'SubmitedPaper'
            {
             before(grammarAccess.getSubmitedPaperAccess().getSubmitedPaperKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSubmitedPaperAccess().getSubmitedPaperKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group__3__Impl"


    // $ANTLR start "rule__SubmitedPaper__Group__4"
    // InternalDsl.g:3611:1: rule__SubmitedPaper__Group__4 : rule__SubmitedPaper__Group__4__Impl rule__SubmitedPaper__Group__5 ;
    public final void rule__SubmitedPaper__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3615:1: ( rule__SubmitedPaper__Group__4__Impl rule__SubmitedPaper__Group__5 )
            // InternalDsl.g:3616:2: rule__SubmitedPaper__Group__4__Impl rule__SubmitedPaper__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__SubmitedPaper__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmitedPaper__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group__4"


    // $ANTLR start "rule__SubmitedPaper__Group__4__Impl"
    // InternalDsl.g:3623:1: rule__SubmitedPaper__Group__4__Impl : ( '{' ) ;
    public final void rule__SubmitedPaper__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3627:1: ( ( '{' ) )
            // InternalDsl.g:3628:1: ( '{' )
            {
            // InternalDsl.g:3628:1: ( '{' )
            // InternalDsl.g:3629:2: '{'
            {
             before(grammarAccess.getSubmitedPaperAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSubmitedPaperAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group__4__Impl"


    // $ANTLR start "rule__SubmitedPaper__Group__5"
    // InternalDsl.g:3638:1: rule__SubmitedPaper__Group__5 : rule__SubmitedPaper__Group__5__Impl rule__SubmitedPaper__Group__6 ;
    public final void rule__SubmitedPaper__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3642:1: ( rule__SubmitedPaper__Group__5__Impl rule__SubmitedPaper__Group__6 )
            // InternalDsl.g:3643:2: rule__SubmitedPaper__Group__5__Impl rule__SubmitedPaper__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__SubmitedPaper__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmitedPaper__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group__5"


    // $ANTLR start "rule__SubmitedPaper__Group__5__Impl"
    // InternalDsl.g:3650:1: rule__SubmitedPaper__Group__5__Impl : ( ( rule__SubmitedPaper__Group_5__0 )? ) ;
    public final void rule__SubmitedPaper__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3654:1: ( ( ( rule__SubmitedPaper__Group_5__0 )? ) )
            // InternalDsl.g:3655:1: ( ( rule__SubmitedPaper__Group_5__0 )? )
            {
            // InternalDsl.g:3655:1: ( ( rule__SubmitedPaper__Group_5__0 )? )
            // InternalDsl.g:3656:2: ( rule__SubmitedPaper__Group_5__0 )?
            {
             before(grammarAccess.getSubmitedPaperAccess().getGroup_5()); 
            // InternalDsl.g:3657:2: ( rule__SubmitedPaper__Group_5__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==16) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDsl.g:3657:3: rule__SubmitedPaper__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubmitedPaper__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubmitedPaperAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group__5__Impl"


    // $ANTLR start "rule__SubmitedPaper__Group__6"
    // InternalDsl.g:3665:1: rule__SubmitedPaper__Group__6 : rule__SubmitedPaper__Group__6__Impl rule__SubmitedPaper__Group__7 ;
    public final void rule__SubmitedPaper__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3669:1: ( rule__SubmitedPaper__Group__6__Impl rule__SubmitedPaper__Group__7 )
            // InternalDsl.g:3670:2: rule__SubmitedPaper__Group__6__Impl rule__SubmitedPaper__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__SubmitedPaper__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmitedPaper__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group__6"


    // $ANTLR start "rule__SubmitedPaper__Group__6__Impl"
    // InternalDsl.g:3677:1: rule__SubmitedPaper__Group__6__Impl : ( ( rule__SubmitedPaper__Group_6__0 )? ) ;
    public final void rule__SubmitedPaper__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3681:1: ( ( ( rule__SubmitedPaper__Group_6__0 )? ) )
            // InternalDsl.g:3682:1: ( ( rule__SubmitedPaper__Group_6__0 )? )
            {
            // InternalDsl.g:3682:1: ( ( rule__SubmitedPaper__Group_6__0 )? )
            // InternalDsl.g:3683:2: ( rule__SubmitedPaper__Group_6__0 )?
            {
             before(grammarAccess.getSubmitedPaperAccess().getGroup_6()); 
            // InternalDsl.g:3684:2: ( rule__SubmitedPaper__Group_6__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDsl.g:3684:3: rule__SubmitedPaper__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubmitedPaper__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubmitedPaperAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group__6__Impl"


    // $ANTLR start "rule__SubmitedPaper__Group__7"
    // InternalDsl.g:3692:1: rule__SubmitedPaper__Group__7 : rule__SubmitedPaper__Group__7__Impl rule__SubmitedPaper__Group__8 ;
    public final void rule__SubmitedPaper__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3696:1: ( rule__SubmitedPaper__Group__7__Impl rule__SubmitedPaper__Group__8 )
            // InternalDsl.g:3697:2: rule__SubmitedPaper__Group__7__Impl rule__SubmitedPaper__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__SubmitedPaper__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmitedPaper__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group__7"


    // $ANTLR start "rule__SubmitedPaper__Group__7__Impl"
    // InternalDsl.g:3704:1: rule__SubmitedPaper__Group__7__Impl : ( ( rule__SubmitedPaper__Group_7__0 )? ) ;
    public final void rule__SubmitedPaper__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3708:1: ( ( ( rule__SubmitedPaper__Group_7__0 )? ) )
            // InternalDsl.g:3709:1: ( ( rule__SubmitedPaper__Group_7__0 )? )
            {
            // InternalDsl.g:3709:1: ( ( rule__SubmitedPaper__Group_7__0 )? )
            // InternalDsl.g:3710:2: ( rule__SubmitedPaper__Group_7__0 )?
            {
             before(grammarAccess.getSubmitedPaperAccess().getGroup_7()); 
            // InternalDsl.g:3711:2: ( rule__SubmitedPaper__Group_7__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==42) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDsl.g:3711:3: rule__SubmitedPaper__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubmitedPaper__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubmitedPaperAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group__7__Impl"


    // $ANTLR start "rule__SubmitedPaper__Group__8"
    // InternalDsl.g:3719:1: rule__SubmitedPaper__Group__8 : rule__SubmitedPaper__Group__8__Impl rule__SubmitedPaper__Group__9 ;
    public final void rule__SubmitedPaper__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3723:1: ( rule__SubmitedPaper__Group__8__Impl rule__SubmitedPaper__Group__9 )
            // InternalDsl.g:3724:2: rule__SubmitedPaper__Group__8__Impl rule__SubmitedPaper__Group__9
            {
            pushFollow(FOLLOW_25);
            rule__SubmitedPaper__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmitedPaper__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group__8"


    // $ANTLR start "rule__SubmitedPaper__Group__8__Impl"
    // InternalDsl.g:3731:1: rule__SubmitedPaper__Group__8__Impl : ( ( rule__SubmitedPaper__Group_8__0 )? ) ;
    public final void rule__SubmitedPaper__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3735:1: ( ( ( rule__SubmitedPaper__Group_8__0 )? ) )
            // InternalDsl.g:3736:1: ( ( rule__SubmitedPaper__Group_8__0 )? )
            {
            // InternalDsl.g:3736:1: ( ( rule__SubmitedPaper__Group_8__0 )? )
            // InternalDsl.g:3737:2: ( rule__SubmitedPaper__Group_8__0 )?
            {
             before(grammarAccess.getSubmitedPaperAccess().getGroup_8()); 
            // InternalDsl.g:3738:2: ( rule__SubmitedPaper__Group_8__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==43) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDsl.g:3738:3: rule__SubmitedPaper__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubmitedPaper__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubmitedPaperAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group__8__Impl"


    // $ANTLR start "rule__SubmitedPaper__Group__9"
    // InternalDsl.g:3746:1: rule__SubmitedPaper__Group__9 : rule__SubmitedPaper__Group__9__Impl ;
    public final void rule__SubmitedPaper__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3750:1: ( rule__SubmitedPaper__Group__9__Impl )
            // InternalDsl.g:3751:2: rule__SubmitedPaper__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubmitedPaper__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group__9"


    // $ANTLR start "rule__SubmitedPaper__Group__9__Impl"
    // InternalDsl.g:3757:1: rule__SubmitedPaper__Group__9__Impl : ( '}' ) ;
    public final void rule__SubmitedPaper__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3761:1: ( ( '}' ) )
            // InternalDsl.g:3762:1: ( '}' )
            {
            // InternalDsl.g:3762:1: ( '}' )
            // InternalDsl.g:3763:2: '}'
            {
             before(grammarAccess.getSubmitedPaperAccess().getRightCurlyBracketKeyword_9()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSubmitedPaperAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group__9__Impl"


    // $ANTLR start "rule__SubmitedPaper__Group_5__0"
    // InternalDsl.g:3773:1: rule__SubmitedPaper__Group_5__0 : rule__SubmitedPaper__Group_5__0__Impl rule__SubmitedPaper__Group_5__1 ;
    public final void rule__SubmitedPaper__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3777:1: ( rule__SubmitedPaper__Group_5__0__Impl rule__SubmitedPaper__Group_5__1 )
            // InternalDsl.g:3778:2: rule__SubmitedPaper__Group_5__0__Impl rule__SubmitedPaper__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__SubmitedPaper__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmitedPaper__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group_5__0"


    // $ANTLR start "rule__SubmitedPaper__Group_5__0__Impl"
    // InternalDsl.g:3785:1: rule__SubmitedPaper__Group_5__0__Impl : ( 'id' ) ;
    public final void rule__SubmitedPaper__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3789:1: ( ( 'id' ) )
            // InternalDsl.g:3790:1: ( 'id' )
            {
            // InternalDsl.g:3790:1: ( 'id' )
            // InternalDsl.g:3791:2: 'id'
            {
             before(grammarAccess.getSubmitedPaperAccess().getIdKeyword_5_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSubmitedPaperAccess().getIdKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group_5__0__Impl"


    // $ANTLR start "rule__SubmitedPaper__Group_5__1"
    // InternalDsl.g:3800:1: rule__SubmitedPaper__Group_5__1 : rule__SubmitedPaper__Group_5__1__Impl ;
    public final void rule__SubmitedPaper__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3804:1: ( rule__SubmitedPaper__Group_5__1__Impl )
            // InternalDsl.g:3805:2: rule__SubmitedPaper__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubmitedPaper__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group_5__1"


    // $ANTLR start "rule__SubmitedPaper__Group_5__1__Impl"
    // InternalDsl.g:3811:1: rule__SubmitedPaper__Group_5__1__Impl : ( ( rule__SubmitedPaper__IdAssignment_5_1 ) ) ;
    public final void rule__SubmitedPaper__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3815:1: ( ( ( rule__SubmitedPaper__IdAssignment_5_1 ) ) )
            // InternalDsl.g:3816:1: ( ( rule__SubmitedPaper__IdAssignment_5_1 ) )
            {
            // InternalDsl.g:3816:1: ( ( rule__SubmitedPaper__IdAssignment_5_1 ) )
            // InternalDsl.g:3817:2: ( rule__SubmitedPaper__IdAssignment_5_1 )
            {
             before(grammarAccess.getSubmitedPaperAccess().getIdAssignment_5_1()); 
            // InternalDsl.g:3818:2: ( rule__SubmitedPaper__IdAssignment_5_1 )
            // InternalDsl.g:3818:3: rule__SubmitedPaper__IdAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__SubmitedPaper__IdAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSubmitedPaperAccess().getIdAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group_5__1__Impl"


    // $ANTLR start "rule__SubmitedPaper__Group_6__0"
    // InternalDsl.g:3827:1: rule__SubmitedPaper__Group_6__0 : rule__SubmitedPaper__Group_6__0__Impl rule__SubmitedPaper__Group_6__1 ;
    public final void rule__SubmitedPaper__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3831:1: ( rule__SubmitedPaper__Group_6__0__Impl rule__SubmitedPaper__Group_6__1 )
            // InternalDsl.g:3832:2: rule__SubmitedPaper__Group_6__0__Impl rule__SubmitedPaper__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__SubmitedPaper__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmitedPaper__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group_6__0"


    // $ANTLR start "rule__SubmitedPaper__Group_6__0__Impl"
    // InternalDsl.g:3839:1: rule__SubmitedPaper__Group_6__0__Impl : ( 'stuid' ) ;
    public final void rule__SubmitedPaper__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3843:1: ( ( 'stuid' ) )
            // InternalDsl.g:3844:1: ( 'stuid' )
            {
            // InternalDsl.g:3844:1: ( 'stuid' )
            // InternalDsl.g:3845:2: 'stuid'
            {
             before(grammarAccess.getSubmitedPaperAccess().getStuidKeyword_6_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSubmitedPaperAccess().getStuidKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group_6__0__Impl"


    // $ANTLR start "rule__SubmitedPaper__Group_6__1"
    // InternalDsl.g:3854:1: rule__SubmitedPaper__Group_6__1 : rule__SubmitedPaper__Group_6__1__Impl ;
    public final void rule__SubmitedPaper__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3858:1: ( rule__SubmitedPaper__Group_6__1__Impl )
            // InternalDsl.g:3859:2: rule__SubmitedPaper__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubmitedPaper__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group_6__1"


    // $ANTLR start "rule__SubmitedPaper__Group_6__1__Impl"
    // InternalDsl.g:3865:1: rule__SubmitedPaper__Group_6__1__Impl : ( ( rule__SubmitedPaper__StuidAssignment_6_1 ) ) ;
    public final void rule__SubmitedPaper__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3869:1: ( ( ( rule__SubmitedPaper__StuidAssignment_6_1 ) ) )
            // InternalDsl.g:3870:1: ( ( rule__SubmitedPaper__StuidAssignment_6_1 ) )
            {
            // InternalDsl.g:3870:1: ( ( rule__SubmitedPaper__StuidAssignment_6_1 ) )
            // InternalDsl.g:3871:2: ( rule__SubmitedPaper__StuidAssignment_6_1 )
            {
             before(grammarAccess.getSubmitedPaperAccess().getStuidAssignment_6_1()); 
            // InternalDsl.g:3872:2: ( rule__SubmitedPaper__StuidAssignment_6_1 )
            // InternalDsl.g:3872:3: rule__SubmitedPaper__StuidAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__SubmitedPaper__StuidAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSubmitedPaperAccess().getStuidAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group_6__1__Impl"


    // $ANTLR start "rule__SubmitedPaper__Group_7__0"
    // InternalDsl.g:3881:1: rule__SubmitedPaper__Group_7__0 : rule__SubmitedPaper__Group_7__0__Impl rule__SubmitedPaper__Group_7__1 ;
    public final void rule__SubmitedPaper__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3885:1: ( rule__SubmitedPaper__Group_7__0__Impl rule__SubmitedPaper__Group_7__1 )
            // InternalDsl.g:3886:2: rule__SubmitedPaper__Group_7__0__Impl rule__SubmitedPaper__Group_7__1
            {
            pushFollow(FOLLOW_6);
            rule__SubmitedPaper__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmitedPaper__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group_7__0"


    // $ANTLR start "rule__SubmitedPaper__Group_7__0__Impl"
    // InternalDsl.g:3893:1: rule__SubmitedPaper__Group_7__0__Impl : ( 'teaid' ) ;
    public final void rule__SubmitedPaper__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3897:1: ( ( 'teaid' ) )
            // InternalDsl.g:3898:1: ( 'teaid' )
            {
            // InternalDsl.g:3898:1: ( 'teaid' )
            // InternalDsl.g:3899:2: 'teaid'
            {
             before(grammarAccess.getSubmitedPaperAccess().getTeaidKeyword_7_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSubmitedPaperAccess().getTeaidKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group_7__0__Impl"


    // $ANTLR start "rule__SubmitedPaper__Group_7__1"
    // InternalDsl.g:3908:1: rule__SubmitedPaper__Group_7__1 : rule__SubmitedPaper__Group_7__1__Impl ;
    public final void rule__SubmitedPaper__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3912:1: ( rule__SubmitedPaper__Group_7__1__Impl )
            // InternalDsl.g:3913:2: rule__SubmitedPaper__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubmitedPaper__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group_7__1"


    // $ANTLR start "rule__SubmitedPaper__Group_7__1__Impl"
    // InternalDsl.g:3919:1: rule__SubmitedPaper__Group_7__1__Impl : ( ( rule__SubmitedPaper__TeaidAssignment_7_1 ) ) ;
    public final void rule__SubmitedPaper__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3923:1: ( ( ( rule__SubmitedPaper__TeaidAssignment_7_1 ) ) )
            // InternalDsl.g:3924:1: ( ( rule__SubmitedPaper__TeaidAssignment_7_1 ) )
            {
            // InternalDsl.g:3924:1: ( ( rule__SubmitedPaper__TeaidAssignment_7_1 ) )
            // InternalDsl.g:3925:2: ( rule__SubmitedPaper__TeaidAssignment_7_1 )
            {
             before(grammarAccess.getSubmitedPaperAccess().getTeaidAssignment_7_1()); 
            // InternalDsl.g:3926:2: ( rule__SubmitedPaper__TeaidAssignment_7_1 )
            // InternalDsl.g:3926:3: rule__SubmitedPaper__TeaidAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__SubmitedPaper__TeaidAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getSubmitedPaperAccess().getTeaidAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group_7__1__Impl"


    // $ANTLR start "rule__SubmitedPaper__Group_8__0"
    // InternalDsl.g:3935:1: rule__SubmitedPaper__Group_8__0 : rule__SubmitedPaper__Group_8__0__Impl rule__SubmitedPaper__Group_8__1 ;
    public final void rule__SubmitedPaper__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3939:1: ( rule__SubmitedPaper__Group_8__0__Impl rule__SubmitedPaper__Group_8__1 )
            // InternalDsl.g:3940:2: rule__SubmitedPaper__Group_8__0__Impl rule__SubmitedPaper__Group_8__1
            {
            pushFollow(FOLLOW_6);
            rule__SubmitedPaper__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmitedPaper__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group_8__0"


    // $ANTLR start "rule__SubmitedPaper__Group_8__0__Impl"
    // InternalDsl.g:3947:1: rule__SubmitedPaper__Group_8__0__Impl : ( 'courseid' ) ;
    public final void rule__SubmitedPaper__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3951:1: ( ( 'courseid' ) )
            // InternalDsl.g:3952:1: ( 'courseid' )
            {
            // InternalDsl.g:3952:1: ( 'courseid' )
            // InternalDsl.g:3953:2: 'courseid'
            {
             before(grammarAccess.getSubmitedPaperAccess().getCourseidKeyword_8_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSubmitedPaperAccess().getCourseidKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group_8__0__Impl"


    // $ANTLR start "rule__SubmitedPaper__Group_8__1"
    // InternalDsl.g:3962:1: rule__SubmitedPaper__Group_8__1 : rule__SubmitedPaper__Group_8__1__Impl ;
    public final void rule__SubmitedPaper__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3966:1: ( rule__SubmitedPaper__Group_8__1__Impl )
            // InternalDsl.g:3967:2: rule__SubmitedPaper__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubmitedPaper__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group_8__1"


    // $ANTLR start "rule__SubmitedPaper__Group_8__1__Impl"
    // InternalDsl.g:3973:1: rule__SubmitedPaper__Group_8__1__Impl : ( ( rule__SubmitedPaper__CourseidAssignment_8_1 ) ) ;
    public final void rule__SubmitedPaper__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3977:1: ( ( ( rule__SubmitedPaper__CourseidAssignment_8_1 ) ) )
            // InternalDsl.g:3978:1: ( ( rule__SubmitedPaper__CourseidAssignment_8_1 ) )
            {
            // InternalDsl.g:3978:1: ( ( rule__SubmitedPaper__CourseidAssignment_8_1 ) )
            // InternalDsl.g:3979:2: ( rule__SubmitedPaper__CourseidAssignment_8_1 )
            {
             before(grammarAccess.getSubmitedPaperAccess().getCourseidAssignment_8_1()); 
            // InternalDsl.g:3980:2: ( rule__SubmitedPaper__CourseidAssignment_8_1 )
            // InternalDsl.g:3980:3: rule__SubmitedPaper__CourseidAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__SubmitedPaper__CourseidAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getSubmitedPaperAccess().getCourseidAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__Group_8__1__Impl"


    // $ANTLR start "rule__EFloat__Group__0"
    // InternalDsl.g:3989:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3993:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalDsl.g:3994:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0"


    // $ANTLR start "rule__EFloat__Group__0__Impl"
    // InternalDsl.g:4001:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4005:1: ( ( ( '-' )? ) )
            // InternalDsl.g:4006:1: ( ( '-' )? )
            {
            // InternalDsl.g:4006:1: ( ( '-' )? )
            // InternalDsl.g:4007:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalDsl.g:4008:2: ( '-' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==22) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDsl.g:4008:3: '-'
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0__Impl"


    // $ANTLR start "rule__EFloat__Group__1"
    // InternalDsl.g:4016:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4020:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalDsl.g:4021:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1"


    // $ANTLR start "rule__EFloat__Group__1__Impl"
    // InternalDsl.g:4028:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4032:1: ( ( ( RULE_INT )? ) )
            // InternalDsl.g:4033:1: ( ( RULE_INT )? )
            {
            // InternalDsl.g:4033:1: ( ( RULE_INT )? )
            // InternalDsl.g:4034:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalDsl.g:4035:2: ( RULE_INT )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_INT) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDsl.g:4035:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__2"
    // InternalDsl.g:4043:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4047:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalDsl.g:4048:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2"


    // $ANTLR start "rule__EFloat__Group__2__Impl"
    // InternalDsl.g:4055:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4059:1: ( ( '.' ) )
            // InternalDsl.g:4060:1: ( '.' )
            {
            // InternalDsl.g:4060:1: ( '.' )
            // InternalDsl.g:4061:2: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2__Impl"


    // $ANTLR start "rule__EFloat__Group__3"
    // InternalDsl.g:4070:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4074:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalDsl.g:4075:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3"


    // $ANTLR start "rule__EFloat__Group__3__Impl"
    // InternalDsl.g:4082:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4086:1: ( ( RULE_INT ) )
            // InternalDsl.g:4087:1: ( RULE_INT )
            {
            // InternalDsl.g:4087:1: ( RULE_INT )
            // InternalDsl.g:4088:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3__Impl"


    // $ANTLR start "rule__EFloat__Group__4"
    // InternalDsl.g:4097:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4101:1: ( rule__EFloat__Group__4__Impl )
            // InternalDsl.g:4102:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4"


    // $ANTLR start "rule__EFloat__Group__4__Impl"
    // InternalDsl.g:4108:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4112:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalDsl.g:4113:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalDsl.g:4113:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalDsl.g:4114:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalDsl.g:4115:2: ( rule__EFloat__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=11 && LA38_0<=12)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDsl.g:4115:3: rule__EFloat__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EFloat__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4__Impl"


    // $ANTLR start "rule__EFloat__Group_4__0"
    // InternalDsl.g:4124:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4128:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalDsl.g:4129:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0"


    // $ANTLR start "rule__EFloat__Group_4__0__Impl"
    // InternalDsl.g:4136:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4140:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalDsl.g:4141:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalDsl.g:4141:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalDsl.g:4142:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalDsl.g:4143:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalDsl.g:4143:3: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0__Impl"


    // $ANTLR start "rule__EFloat__Group_4__1"
    // InternalDsl.g:4151:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4155:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalDsl.g:4156:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1"


    // $ANTLR start "rule__EFloat__Group_4__1__Impl"
    // InternalDsl.g:4163:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4167:1: ( ( ( '-' )? ) )
            // InternalDsl.g:4168:1: ( ( '-' )? )
            {
            // InternalDsl.g:4168:1: ( ( '-' )? )
            // InternalDsl.g:4169:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalDsl.g:4170:2: ( '-' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==22) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDsl.g:4170:3: '-'
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1__Impl"


    // $ANTLR start "rule__EFloat__Group_4__2"
    // InternalDsl.g:4178:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4182:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalDsl.g:4183:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2"


    // $ANTLR start "rule__EFloat__Group_4__2__Impl"
    // InternalDsl.g:4189:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4193:1: ( ( RULE_INT ) )
            // InternalDsl.g:4194:1: ( RULE_INT )
            {
            // InternalDsl.g:4194:1: ( RULE_INT )
            // InternalDsl.g:4195:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2__Impl"


    // $ANTLR start "rule__ExamPaper__Group__0"
    // InternalDsl.g:4205:1: rule__ExamPaper__Group__0 : rule__ExamPaper__Group__0__Impl rule__ExamPaper__Group__1 ;
    public final void rule__ExamPaper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4209:1: ( rule__ExamPaper__Group__0__Impl rule__ExamPaper__Group__1 )
            // InternalDsl.g:4210:2: rule__ExamPaper__Group__0__Impl rule__ExamPaper__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__ExamPaper__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExamPaper__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group__0"


    // $ANTLR start "rule__ExamPaper__Group__0__Impl"
    // InternalDsl.g:4217:1: rule__ExamPaper__Group__0__Impl : ( () ) ;
    public final void rule__ExamPaper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4221:1: ( ( () ) )
            // InternalDsl.g:4222:1: ( () )
            {
            // InternalDsl.g:4222:1: ( () )
            // InternalDsl.g:4223:2: ()
            {
             before(grammarAccess.getExamPaperAccess().getExamPaperAction_0()); 
            // InternalDsl.g:4224:2: ()
            // InternalDsl.g:4224:3: 
            {
            }

             after(grammarAccess.getExamPaperAccess().getExamPaperAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group__0__Impl"


    // $ANTLR start "rule__ExamPaper__Group__1"
    // InternalDsl.g:4232:1: rule__ExamPaper__Group__1 : rule__ExamPaper__Group__1__Impl rule__ExamPaper__Group__2 ;
    public final void rule__ExamPaper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4236:1: ( rule__ExamPaper__Group__1__Impl rule__ExamPaper__Group__2 )
            // InternalDsl.g:4237:2: rule__ExamPaper__Group__1__Impl rule__ExamPaper__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__ExamPaper__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExamPaper__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group__1"


    // $ANTLR start "rule__ExamPaper__Group__1__Impl"
    // InternalDsl.g:4244:1: rule__ExamPaper__Group__1__Impl : ( ( rule__ExamPaper__IfanswerAssignment_1 )? ) ;
    public final void rule__ExamPaper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4248:1: ( ( ( rule__ExamPaper__IfanswerAssignment_1 )? ) )
            // InternalDsl.g:4249:1: ( ( rule__ExamPaper__IfanswerAssignment_1 )? )
            {
            // InternalDsl.g:4249:1: ( ( rule__ExamPaper__IfanswerAssignment_1 )? )
            // InternalDsl.g:4250:2: ( rule__ExamPaper__IfanswerAssignment_1 )?
            {
             before(grammarAccess.getExamPaperAccess().getIfanswerAssignment_1()); 
            // InternalDsl.g:4251:2: ( rule__ExamPaper__IfanswerAssignment_1 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==49) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDsl.g:4251:3: rule__ExamPaper__IfanswerAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExamPaper__IfanswerAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExamPaperAccess().getIfanswerAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group__1__Impl"


    // $ANTLR start "rule__ExamPaper__Group__2"
    // InternalDsl.g:4259:1: rule__ExamPaper__Group__2 : rule__ExamPaper__Group__2__Impl rule__ExamPaper__Group__3 ;
    public final void rule__ExamPaper__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4263:1: ( rule__ExamPaper__Group__2__Impl rule__ExamPaper__Group__3 )
            // InternalDsl.g:4264:2: rule__ExamPaper__Group__2__Impl rule__ExamPaper__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__ExamPaper__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExamPaper__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group__2"


    // $ANTLR start "rule__ExamPaper__Group__2__Impl"
    // InternalDsl.g:4271:1: rule__ExamPaper__Group__2__Impl : ( ( rule__ExamPaper__IfcorrectAssignment_2 )? ) ;
    public final void rule__ExamPaper__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4275:1: ( ( ( rule__ExamPaper__IfcorrectAssignment_2 )? ) )
            // InternalDsl.g:4276:1: ( ( rule__ExamPaper__IfcorrectAssignment_2 )? )
            {
            // InternalDsl.g:4276:1: ( ( rule__ExamPaper__IfcorrectAssignment_2 )? )
            // InternalDsl.g:4277:2: ( rule__ExamPaper__IfcorrectAssignment_2 )?
            {
             before(grammarAccess.getExamPaperAccess().getIfcorrectAssignment_2()); 
            // InternalDsl.g:4278:2: ( rule__ExamPaper__IfcorrectAssignment_2 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==48) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDsl.g:4278:3: rule__ExamPaper__IfcorrectAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExamPaper__IfcorrectAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExamPaperAccess().getIfcorrectAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group__2__Impl"


    // $ANTLR start "rule__ExamPaper__Group__3"
    // InternalDsl.g:4286:1: rule__ExamPaper__Group__3 : rule__ExamPaper__Group__3__Impl rule__ExamPaper__Group__4 ;
    public final void rule__ExamPaper__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4290:1: ( rule__ExamPaper__Group__3__Impl rule__ExamPaper__Group__4 )
            // InternalDsl.g:4291:2: rule__ExamPaper__Group__3__Impl rule__ExamPaper__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__ExamPaper__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExamPaper__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group__3"


    // $ANTLR start "rule__ExamPaper__Group__3__Impl"
    // InternalDsl.g:4298:1: rule__ExamPaper__Group__3__Impl : ( 'ExamPaper' ) ;
    public final void rule__ExamPaper__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4302:1: ( ( 'ExamPaper' ) )
            // InternalDsl.g:4303:1: ( 'ExamPaper' )
            {
            // InternalDsl.g:4303:1: ( 'ExamPaper' )
            // InternalDsl.g:4304:2: 'ExamPaper'
            {
             before(grammarAccess.getExamPaperAccess().getExamPaperKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getExamPaperAccess().getExamPaperKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group__3__Impl"


    // $ANTLR start "rule__ExamPaper__Group__4"
    // InternalDsl.g:4313:1: rule__ExamPaper__Group__4 : rule__ExamPaper__Group__4__Impl rule__ExamPaper__Group__5 ;
    public final void rule__ExamPaper__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4317:1: ( rule__ExamPaper__Group__4__Impl rule__ExamPaper__Group__5 )
            // InternalDsl.g:4318:2: rule__ExamPaper__Group__4__Impl rule__ExamPaper__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__ExamPaper__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExamPaper__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group__4"


    // $ANTLR start "rule__ExamPaper__Group__4__Impl"
    // InternalDsl.g:4325:1: rule__ExamPaper__Group__4__Impl : ( '{' ) ;
    public final void rule__ExamPaper__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4329:1: ( ( '{' ) )
            // InternalDsl.g:4330:1: ( '{' )
            {
            // InternalDsl.g:4330:1: ( '{' )
            // InternalDsl.g:4331:2: '{'
            {
             before(grammarAccess.getExamPaperAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExamPaperAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group__4__Impl"


    // $ANTLR start "rule__ExamPaper__Group__5"
    // InternalDsl.g:4340:1: rule__ExamPaper__Group__5 : rule__ExamPaper__Group__5__Impl rule__ExamPaper__Group__6 ;
    public final void rule__ExamPaper__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4344:1: ( rule__ExamPaper__Group__5__Impl rule__ExamPaper__Group__6 )
            // InternalDsl.g:4345:2: rule__ExamPaper__Group__5__Impl rule__ExamPaper__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__ExamPaper__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExamPaper__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group__5"


    // $ANTLR start "rule__ExamPaper__Group__5__Impl"
    // InternalDsl.g:4352:1: rule__ExamPaper__Group__5__Impl : ( ( rule__ExamPaper__Group_5__0 )? ) ;
    public final void rule__ExamPaper__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4356:1: ( ( ( rule__ExamPaper__Group_5__0 )? ) )
            // InternalDsl.g:4357:1: ( ( rule__ExamPaper__Group_5__0 )? )
            {
            // InternalDsl.g:4357:1: ( ( rule__ExamPaper__Group_5__0 )? )
            // InternalDsl.g:4358:2: ( rule__ExamPaper__Group_5__0 )?
            {
             before(grammarAccess.getExamPaperAccess().getGroup_5()); 
            // InternalDsl.g:4359:2: ( rule__ExamPaper__Group_5__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==16) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDsl.g:4359:3: rule__ExamPaper__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExamPaper__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExamPaperAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group__5__Impl"


    // $ANTLR start "rule__ExamPaper__Group__6"
    // InternalDsl.g:4367:1: rule__ExamPaper__Group__6 : rule__ExamPaper__Group__6__Impl rule__ExamPaper__Group__7 ;
    public final void rule__ExamPaper__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4371:1: ( rule__ExamPaper__Group__6__Impl rule__ExamPaper__Group__7 )
            // InternalDsl.g:4372:2: rule__ExamPaper__Group__6__Impl rule__ExamPaper__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__ExamPaper__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExamPaper__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group__6"


    // $ANTLR start "rule__ExamPaper__Group__6__Impl"
    // InternalDsl.g:4379:1: rule__ExamPaper__Group__6__Impl : ( ( rule__ExamPaper__Group_6__0 )? ) ;
    public final void rule__ExamPaper__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4383:1: ( ( ( rule__ExamPaper__Group_6__0 )? ) )
            // InternalDsl.g:4384:1: ( ( rule__ExamPaper__Group_6__0 )? )
            {
            // InternalDsl.g:4384:1: ( ( rule__ExamPaper__Group_6__0 )? )
            // InternalDsl.g:4385:2: ( rule__ExamPaper__Group_6__0 )?
            {
             before(grammarAccess.getExamPaperAccess().getGroup_6()); 
            // InternalDsl.g:4386:2: ( rule__ExamPaper__Group_6__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==43) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDsl.g:4386:3: rule__ExamPaper__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExamPaper__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExamPaperAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group__6__Impl"


    // $ANTLR start "rule__ExamPaper__Group__7"
    // InternalDsl.g:4394:1: rule__ExamPaper__Group__7 : rule__ExamPaper__Group__7__Impl rule__ExamPaper__Group__8 ;
    public final void rule__ExamPaper__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4398:1: ( rule__ExamPaper__Group__7__Impl rule__ExamPaper__Group__8 )
            // InternalDsl.g:4399:2: rule__ExamPaper__Group__7__Impl rule__ExamPaper__Group__8
            {
            pushFollow(FOLLOW_28);
            rule__ExamPaper__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExamPaper__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group__7"


    // $ANTLR start "rule__ExamPaper__Group__7__Impl"
    // InternalDsl.g:4406:1: rule__ExamPaper__Group__7__Impl : ( ( rule__ExamPaper__Group_7__0 )? ) ;
    public final void rule__ExamPaper__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4410:1: ( ( ( rule__ExamPaper__Group_7__0 )? ) )
            // InternalDsl.g:4411:1: ( ( rule__ExamPaper__Group_7__0 )? )
            {
            // InternalDsl.g:4411:1: ( ( rule__ExamPaper__Group_7__0 )? )
            // InternalDsl.g:4412:2: ( rule__ExamPaper__Group_7__0 )?
            {
             before(grammarAccess.getExamPaperAccess().getGroup_7()); 
            // InternalDsl.g:4413:2: ( rule__ExamPaper__Group_7__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==42) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDsl.g:4413:3: rule__ExamPaper__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExamPaper__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExamPaperAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group__7__Impl"


    // $ANTLR start "rule__ExamPaper__Group__8"
    // InternalDsl.g:4421:1: rule__ExamPaper__Group__8 : rule__ExamPaper__Group__8__Impl rule__ExamPaper__Group__9 ;
    public final void rule__ExamPaper__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4425:1: ( rule__ExamPaper__Group__8__Impl rule__ExamPaper__Group__9 )
            // InternalDsl.g:4426:2: rule__ExamPaper__Group__8__Impl rule__ExamPaper__Group__9
            {
            pushFollow(FOLLOW_28);
            rule__ExamPaper__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExamPaper__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group__8"


    // $ANTLR start "rule__ExamPaper__Group__8__Impl"
    // InternalDsl.g:4433:1: rule__ExamPaper__Group__8__Impl : ( ( rule__ExamPaper__Group_8__0 )? ) ;
    public final void rule__ExamPaper__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4437:1: ( ( ( rule__ExamPaper__Group_8__0 )? ) )
            // InternalDsl.g:4438:1: ( ( rule__ExamPaper__Group_8__0 )? )
            {
            // InternalDsl.g:4438:1: ( ( rule__ExamPaper__Group_8__0 )? )
            // InternalDsl.g:4439:2: ( rule__ExamPaper__Group_8__0 )?
            {
             before(grammarAccess.getExamPaperAccess().getGroup_8()); 
            // InternalDsl.g:4440:2: ( rule__ExamPaper__Group_8__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==37) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDsl.g:4440:3: rule__ExamPaper__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExamPaper__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExamPaperAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group__8__Impl"


    // $ANTLR start "rule__ExamPaper__Group__9"
    // InternalDsl.g:4448:1: rule__ExamPaper__Group__9 : rule__ExamPaper__Group__9__Impl rule__ExamPaper__Group__10 ;
    public final void rule__ExamPaper__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4452:1: ( rule__ExamPaper__Group__9__Impl rule__ExamPaper__Group__10 )
            // InternalDsl.g:4453:2: rule__ExamPaper__Group__9__Impl rule__ExamPaper__Group__10
            {
            pushFollow(FOLLOW_28);
            rule__ExamPaper__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExamPaper__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group__9"


    // $ANTLR start "rule__ExamPaper__Group__9__Impl"
    // InternalDsl.g:4460:1: rule__ExamPaper__Group__9__Impl : ( ( rule__ExamPaper__Group_9__0 )? ) ;
    public final void rule__ExamPaper__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4464:1: ( ( ( rule__ExamPaper__Group_9__0 )? ) )
            // InternalDsl.g:4465:1: ( ( rule__ExamPaper__Group_9__0 )? )
            {
            // InternalDsl.g:4465:1: ( ( rule__ExamPaper__Group_9__0 )? )
            // InternalDsl.g:4466:2: ( rule__ExamPaper__Group_9__0 )?
            {
             before(grammarAccess.getExamPaperAccess().getGroup_9()); 
            // InternalDsl.g:4467:2: ( rule__ExamPaper__Group_9__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==46) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDsl.g:4467:3: rule__ExamPaper__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExamPaper__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExamPaperAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group__9__Impl"


    // $ANTLR start "rule__ExamPaper__Group__10"
    // InternalDsl.g:4475:1: rule__ExamPaper__Group__10 : rule__ExamPaper__Group__10__Impl rule__ExamPaper__Group__11 ;
    public final void rule__ExamPaper__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4479:1: ( rule__ExamPaper__Group__10__Impl rule__ExamPaper__Group__11 )
            // InternalDsl.g:4480:2: rule__ExamPaper__Group__10__Impl rule__ExamPaper__Group__11
            {
            pushFollow(FOLLOW_28);
            rule__ExamPaper__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExamPaper__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group__10"


    // $ANTLR start "rule__ExamPaper__Group__10__Impl"
    // InternalDsl.g:4487:1: rule__ExamPaper__Group__10__Impl : ( ( rule__ExamPaper__Group_10__0 )? ) ;
    public final void rule__ExamPaper__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4491:1: ( ( ( rule__ExamPaper__Group_10__0 )? ) )
            // InternalDsl.g:4492:1: ( ( rule__ExamPaper__Group_10__0 )? )
            {
            // InternalDsl.g:4492:1: ( ( rule__ExamPaper__Group_10__0 )? )
            // InternalDsl.g:4493:2: ( rule__ExamPaper__Group_10__0 )?
            {
             before(grammarAccess.getExamPaperAccess().getGroup_10()); 
            // InternalDsl.g:4494:2: ( rule__ExamPaper__Group_10__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==47) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDsl.g:4494:3: rule__ExamPaper__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExamPaper__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExamPaperAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group__10__Impl"


    // $ANTLR start "rule__ExamPaper__Group__11"
    // InternalDsl.g:4502:1: rule__ExamPaper__Group__11 : rule__ExamPaper__Group__11__Impl ;
    public final void rule__ExamPaper__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4506:1: ( rule__ExamPaper__Group__11__Impl )
            // InternalDsl.g:4507:2: rule__ExamPaper__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExamPaper__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group__11"


    // $ANTLR start "rule__ExamPaper__Group__11__Impl"
    // InternalDsl.g:4513:1: rule__ExamPaper__Group__11__Impl : ( '}' ) ;
    public final void rule__ExamPaper__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4517:1: ( ( '}' ) )
            // InternalDsl.g:4518:1: ( '}' )
            {
            // InternalDsl.g:4518:1: ( '}' )
            // InternalDsl.g:4519:2: '}'
            {
             before(grammarAccess.getExamPaperAccess().getRightCurlyBracketKeyword_11()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getExamPaperAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group__11__Impl"


    // $ANTLR start "rule__ExamPaper__Group_5__0"
    // InternalDsl.g:4529:1: rule__ExamPaper__Group_5__0 : rule__ExamPaper__Group_5__0__Impl rule__ExamPaper__Group_5__1 ;
    public final void rule__ExamPaper__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4533:1: ( rule__ExamPaper__Group_5__0__Impl rule__ExamPaper__Group_5__1 )
            // InternalDsl.g:4534:2: rule__ExamPaper__Group_5__0__Impl rule__ExamPaper__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__ExamPaper__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExamPaper__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_5__0"


    // $ANTLR start "rule__ExamPaper__Group_5__0__Impl"
    // InternalDsl.g:4541:1: rule__ExamPaper__Group_5__0__Impl : ( 'id' ) ;
    public final void rule__ExamPaper__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4545:1: ( ( 'id' ) )
            // InternalDsl.g:4546:1: ( 'id' )
            {
            // InternalDsl.g:4546:1: ( 'id' )
            // InternalDsl.g:4547:2: 'id'
            {
             before(grammarAccess.getExamPaperAccess().getIdKeyword_5_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExamPaperAccess().getIdKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_5__0__Impl"


    // $ANTLR start "rule__ExamPaper__Group_5__1"
    // InternalDsl.g:4556:1: rule__ExamPaper__Group_5__1 : rule__ExamPaper__Group_5__1__Impl ;
    public final void rule__ExamPaper__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4560:1: ( rule__ExamPaper__Group_5__1__Impl )
            // InternalDsl.g:4561:2: rule__ExamPaper__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExamPaper__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_5__1"


    // $ANTLR start "rule__ExamPaper__Group_5__1__Impl"
    // InternalDsl.g:4567:1: rule__ExamPaper__Group_5__1__Impl : ( ( rule__ExamPaper__IdAssignment_5_1 ) ) ;
    public final void rule__ExamPaper__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4571:1: ( ( ( rule__ExamPaper__IdAssignment_5_1 ) ) )
            // InternalDsl.g:4572:1: ( ( rule__ExamPaper__IdAssignment_5_1 ) )
            {
            // InternalDsl.g:4572:1: ( ( rule__ExamPaper__IdAssignment_5_1 ) )
            // InternalDsl.g:4573:2: ( rule__ExamPaper__IdAssignment_5_1 )
            {
             before(grammarAccess.getExamPaperAccess().getIdAssignment_5_1()); 
            // InternalDsl.g:4574:2: ( rule__ExamPaper__IdAssignment_5_1 )
            // InternalDsl.g:4574:3: rule__ExamPaper__IdAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ExamPaper__IdAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getExamPaperAccess().getIdAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_5__1__Impl"


    // $ANTLR start "rule__ExamPaper__Group_6__0"
    // InternalDsl.g:4583:1: rule__ExamPaper__Group_6__0 : rule__ExamPaper__Group_6__0__Impl rule__ExamPaper__Group_6__1 ;
    public final void rule__ExamPaper__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4587:1: ( rule__ExamPaper__Group_6__0__Impl rule__ExamPaper__Group_6__1 )
            // InternalDsl.g:4588:2: rule__ExamPaper__Group_6__0__Impl rule__ExamPaper__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__ExamPaper__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExamPaper__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_6__0"


    // $ANTLR start "rule__ExamPaper__Group_6__0__Impl"
    // InternalDsl.g:4595:1: rule__ExamPaper__Group_6__0__Impl : ( 'courseid' ) ;
    public final void rule__ExamPaper__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4599:1: ( ( 'courseid' ) )
            // InternalDsl.g:4600:1: ( 'courseid' )
            {
            // InternalDsl.g:4600:1: ( 'courseid' )
            // InternalDsl.g:4601:2: 'courseid'
            {
             before(grammarAccess.getExamPaperAccess().getCourseidKeyword_6_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getExamPaperAccess().getCourseidKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_6__0__Impl"


    // $ANTLR start "rule__ExamPaper__Group_6__1"
    // InternalDsl.g:4610:1: rule__ExamPaper__Group_6__1 : rule__ExamPaper__Group_6__1__Impl ;
    public final void rule__ExamPaper__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4614:1: ( rule__ExamPaper__Group_6__1__Impl )
            // InternalDsl.g:4615:2: rule__ExamPaper__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExamPaper__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_6__1"


    // $ANTLR start "rule__ExamPaper__Group_6__1__Impl"
    // InternalDsl.g:4621:1: rule__ExamPaper__Group_6__1__Impl : ( ( rule__ExamPaper__CourseidAssignment_6_1 ) ) ;
    public final void rule__ExamPaper__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4625:1: ( ( ( rule__ExamPaper__CourseidAssignment_6_1 ) ) )
            // InternalDsl.g:4626:1: ( ( rule__ExamPaper__CourseidAssignment_6_1 ) )
            {
            // InternalDsl.g:4626:1: ( ( rule__ExamPaper__CourseidAssignment_6_1 ) )
            // InternalDsl.g:4627:2: ( rule__ExamPaper__CourseidAssignment_6_1 )
            {
             before(grammarAccess.getExamPaperAccess().getCourseidAssignment_6_1()); 
            // InternalDsl.g:4628:2: ( rule__ExamPaper__CourseidAssignment_6_1 )
            // InternalDsl.g:4628:3: rule__ExamPaper__CourseidAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ExamPaper__CourseidAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getExamPaperAccess().getCourseidAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_6__1__Impl"


    // $ANTLR start "rule__ExamPaper__Group_7__0"
    // InternalDsl.g:4637:1: rule__ExamPaper__Group_7__0 : rule__ExamPaper__Group_7__0__Impl rule__ExamPaper__Group_7__1 ;
    public final void rule__ExamPaper__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4641:1: ( rule__ExamPaper__Group_7__0__Impl rule__ExamPaper__Group_7__1 )
            // InternalDsl.g:4642:2: rule__ExamPaper__Group_7__0__Impl rule__ExamPaper__Group_7__1
            {
            pushFollow(FOLLOW_6);
            rule__ExamPaper__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExamPaper__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_7__0"


    // $ANTLR start "rule__ExamPaper__Group_7__0__Impl"
    // InternalDsl.g:4649:1: rule__ExamPaper__Group_7__0__Impl : ( 'teaid' ) ;
    public final void rule__ExamPaper__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4653:1: ( ( 'teaid' ) )
            // InternalDsl.g:4654:1: ( 'teaid' )
            {
            // InternalDsl.g:4654:1: ( 'teaid' )
            // InternalDsl.g:4655:2: 'teaid'
            {
             before(grammarAccess.getExamPaperAccess().getTeaidKeyword_7_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getExamPaperAccess().getTeaidKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_7__0__Impl"


    // $ANTLR start "rule__ExamPaper__Group_7__1"
    // InternalDsl.g:4664:1: rule__ExamPaper__Group_7__1 : rule__ExamPaper__Group_7__1__Impl ;
    public final void rule__ExamPaper__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4668:1: ( rule__ExamPaper__Group_7__1__Impl )
            // InternalDsl.g:4669:2: rule__ExamPaper__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExamPaper__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_7__1"


    // $ANTLR start "rule__ExamPaper__Group_7__1__Impl"
    // InternalDsl.g:4675:1: rule__ExamPaper__Group_7__1__Impl : ( ( rule__ExamPaper__TeaidAssignment_7_1 ) ) ;
    public final void rule__ExamPaper__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4679:1: ( ( ( rule__ExamPaper__TeaidAssignment_7_1 ) ) )
            // InternalDsl.g:4680:1: ( ( rule__ExamPaper__TeaidAssignment_7_1 ) )
            {
            // InternalDsl.g:4680:1: ( ( rule__ExamPaper__TeaidAssignment_7_1 ) )
            // InternalDsl.g:4681:2: ( rule__ExamPaper__TeaidAssignment_7_1 )
            {
             before(grammarAccess.getExamPaperAccess().getTeaidAssignment_7_1()); 
            // InternalDsl.g:4682:2: ( rule__ExamPaper__TeaidAssignment_7_1 )
            // InternalDsl.g:4682:3: rule__ExamPaper__TeaidAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ExamPaper__TeaidAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getExamPaperAccess().getTeaidAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_7__1__Impl"


    // $ANTLR start "rule__ExamPaper__Group_8__0"
    // InternalDsl.g:4691:1: rule__ExamPaper__Group_8__0 : rule__ExamPaper__Group_8__0__Impl rule__ExamPaper__Group_8__1 ;
    public final void rule__ExamPaper__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4695:1: ( rule__ExamPaper__Group_8__0__Impl rule__ExamPaper__Group_8__1 )
            // InternalDsl.g:4696:2: rule__ExamPaper__Group_8__0__Impl rule__ExamPaper__Group_8__1
            {
            pushFollow(FOLLOW_6);
            rule__ExamPaper__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExamPaper__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_8__0"


    // $ANTLR start "rule__ExamPaper__Group_8__0__Impl"
    // InternalDsl.g:4703:1: rule__ExamPaper__Group_8__0__Impl : ( 'stuid' ) ;
    public final void rule__ExamPaper__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4707:1: ( ( 'stuid' ) )
            // InternalDsl.g:4708:1: ( 'stuid' )
            {
            // InternalDsl.g:4708:1: ( 'stuid' )
            // InternalDsl.g:4709:2: 'stuid'
            {
             before(grammarAccess.getExamPaperAccess().getStuidKeyword_8_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getExamPaperAccess().getStuidKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_8__0__Impl"


    // $ANTLR start "rule__ExamPaper__Group_8__1"
    // InternalDsl.g:4718:1: rule__ExamPaper__Group_8__1 : rule__ExamPaper__Group_8__1__Impl ;
    public final void rule__ExamPaper__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4722:1: ( rule__ExamPaper__Group_8__1__Impl )
            // InternalDsl.g:4723:2: rule__ExamPaper__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExamPaper__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_8__1"


    // $ANTLR start "rule__ExamPaper__Group_8__1__Impl"
    // InternalDsl.g:4729:1: rule__ExamPaper__Group_8__1__Impl : ( ( rule__ExamPaper__StuidAssignment_8_1 ) ) ;
    public final void rule__ExamPaper__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4733:1: ( ( ( rule__ExamPaper__StuidAssignment_8_1 ) ) )
            // InternalDsl.g:4734:1: ( ( rule__ExamPaper__StuidAssignment_8_1 ) )
            {
            // InternalDsl.g:4734:1: ( ( rule__ExamPaper__StuidAssignment_8_1 ) )
            // InternalDsl.g:4735:2: ( rule__ExamPaper__StuidAssignment_8_1 )
            {
             before(grammarAccess.getExamPaperAccess().getStuidAssignment_8_1()); 
            // InternalDsl.g:4736:2: ( rule__ExamPaper__StuidAssignment_8_1 )
            // InternalDsl.g:4736:3: rule__ExamPaper__StuidAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__ExamPaper__StuidAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getExamPaperAccess().getStuidAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_8__1__Impl"


    // $ANTLR start "rule__ExamPaper__Group_9__0"
    // InternalDsl.g:4745:1: rule__ExamPaper__Group_9__0 : rule__ExamPaper__Group_9__0__Impl rule__ExamPaper__Group_9__1 ;
    public final void rule__ExamPaper__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4749:1: ( rule__ExamPaper__Group_9__0__Impl rule__ExamPaper__Group_9__1 )
            // InternalDsl.g:4750:2: rule__ExamPaper__Group_9__0__Impl rule__ExamPaper__Group_9__1
            {
            pushFollow(FOLLOW_22);
            rule__ExamPaper__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExamPaper__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_9__0"


    // $ANTLR start "rule__ExamPaper__Group_9__0__Impl"
    // InternalDsl.g:4757:1: rule__ExamPaper__Group_9__0__Impl : ( 'score' ) ;
    public final void rule__ExamPaper__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4761:1: ( ( 'score' ) )
            // InternalDsl.g:4762:1: ( 'score' )
            {
            // InternalDsl.g:4762:1: ( 'score' )
            // InternalDsl.g:4763:2: 'score'
            {
             before(grammarAccess.getExamPaperAccess().getScoreKeyword_9_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getExamPaperAccess().getScoreKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_9__0__Impl"


    // $ANTLR start "rule__ExamPaper__Group_9__1"
    // InternalDsl.g:4772:1: rule__ExamPaper__Group_9__1 : rule__ExamPaper__Group_9__1__Impl ;
    public final void rule__ExamPaper__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4776:1: ( rule__ExamPaper__Group_9__1__Impl )
            // InternalDsl.g:4777:2: rule__ExamPaper__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExamPaper__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_9__1"


    // $ANTLR start "rule__ExamPaper__Group_9__1__Impl"
    // InternalDsl.g:4783:1: rule__ExamPaper__Group_9__1__Impl : ( ( rule__ExamPaper__ScoreAssignment_9_1 ) ) ;
    public final void rule__ExamPaper__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4787:1: ( ( ( rule__ExamPaper__ScoreAssignment_9_1 ) ) )
            // InternalDsl.g:4788:1: ( ( rule__ExamPaper__ScoreAssignment_9_1 ) )
            {
            // InternalDsl.g:4788:1: ( ( rule__ExamPaper__ScoreAssignment_9_1 ) )
            // InternalDsl.g:4789:2: ( rule__ExamPaper__ScoreAssignment_9_1 )
            {
             before(grammarAccess.getExamPaperAccess().getScoreAssignment_9_1()); 
            // InternalDsl.g:4790:2: ( rule__ExamPaper__ScoreAssignment_9_1 )
            // InternalDsl.g:4790:3: rule__ExamPaper__ScoreAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__ExamPaper__ScoreAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getExamPaperAccess().getScoreAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_9__1__Impl"


    // $ANTLR start "rule__ExamPaper__Group_10__0"
    // InternalDsl.g:4799:1: rule__ExamPaper__Group_10__0 : rule__ExamPaper__Group_10__0__Impl rule__ExamPaper__Group_10__1 ;
    public final void rule__ExamPaper__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4803:1: ( rule__ExamPaper__Group_10__0__Impl rule__ExamPaper__Group_10__1 )
            // InternalDsl.g:4804:2: rule__ExamPaper__Group_10__0__Impl rule__ExamPaper__Group_10__1
            {
            pushFollow(FOLLOW_4);
            rule__ExamPaper__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExamPaper__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_10__0"


    // $ANTLR start "rule__ExamPaper__Group_10__0__Impl"
    // InternalDsl.g:4811:1: rule__ExamPaper__Group_10__0__Impl : ( 'submit' ) ;
    public final void rule__ExamPaper__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4815:1: ( ( 'submit' ) )
            // InternalDsl.g:4816:1: ( 'submit' )
            {
            // InternalDsl.g:4816:1: ( 'submit' )
            // InternalDsl.g:4817:2: 'submit'
            {
             before(grammarAccess.getExamPaperAccess().getSubmitKeyword_10_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getExamPaperAccess().getSubmitKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_10__0__Impl"


    // $ANTLR start "rule__ExamPaper__Group_10__1"
    // InternalDsl.g:4826:1: rule__ExamPaper__Group_10__1 : rule__ExamPaper__Group_10__1__Impl rule__ExamPaper__Group_10__2 ;
    public final void rule__ExamPaper__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4830:1: ( rule__ExamPaper__Group_10__1__Impl rule__ExamPaper__Group_10__2 )
            // InternalDsl.g:4831:2: rule__ExamPaper__Group_10__1__Impl rule__ExamPaper__Group_10__2
            {
            pushFollow(FOLLOW_24);
            rule__ExamPaper__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExamPaper__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_10__1"


    // $ANTLR start "rule__ExamPaper__Group_10__1__Impl"
    // InternalDsl.g:4838:1: rule__ExamPaper__Group_10__1__Impl : ( '{' ) ;
    public final void rule__ExamPaper__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4842:1: ( ( '{' ) )
            // InternalDsl.g:4843:1: ( '{' )
            {
            // InternalDsl.g:4843:1: ( '{' )
            // InternalDsl.g:4844:2: '{'
            {
             before(grammarAccess.getExamPaperAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExamPaperAccess().getLeftCurlyBracketKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_10__1__Impl"


    // $ANTLR start "rule__ExamPaper__Group_10__2"
    // InternalDsl.g:4853:1: rule__ExamPaper__Group_10__2 : rule__ExamPaper__Group_10__2__Impl rule__ExamPaper__Group_10__3 ;
    public final void rule__ExamPaper__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4857:1: ( rule__ExamPaper__Group_10__2__Impl rule__ExamPaper__Group_10__3 )
            // InternalDsl.g:4858:2: rule__ExamPaper__Group_10__2__Impl rule__ExamPaper__Group_10__3
            {
            pushFollow(FOLLOW_9);
            rule__ExamPaper__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExamPaper__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_10__2"


    // $ANTLR start "rule__ExamPaper__Group_10__2__Impl"
    // InternalDsl.g:4865:1: rule__ExamPaper__Group_10__2__Impl : ( ( rule__ExamPaper__SubmitAssignment_10_2 ) ) ;
    public final void rule__ExamPaper__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4869:1: ( ( ( rule__ExamPaper__SubmitAssignment_10_2 ) ) )
            // InternalDsl.g:4870:1: ( ( rule__ExamPaper__SubmitAssignment_10_2 ) )
            {
            // InternalDsl.g:4870:1: ( ( rule__ExamPaper__SubmitAssignment_10_2 ) )
            // InternalDsl.g:4871:2: ( rule__ExamPaper__SubmitAssignment_10_2 )
            {
             before(grammarAccess.getExamPaperAccess().getSubmitAssignment_10_2()); 
            // InternalDsl.g:4872:2: ( rule__ExamPaper__SubmitAssignment_10_2 )
            // InternalDsl.g:4872:3: rule__ExamPaper__SubmitAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__ExamPaper__SubmitAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getExamPaperAccess().getSubmitAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_10__2__Impl"


    // $ANTLR start "rule__ExamPaper__Group_10__3"
    // InternalDsl.g:4880:1: rule__ExamPaper__Group_10__3 : rule__ExamPaper__Group_10__3__Impl rule__ExamPaper__Group_10__4 ;
    public final void rule__ExamPaper__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4884:1: ( rule__ExamPaper__Group_10__3__Impl rule__ExamPaper__Group_10__4 )
            // InternalDsl.g:4885:2: rule__ExamPaper__Group_10__3__Impl rule__ExamPaper__Group_10__4
            {
            pushFollow(FOLLOW_9);
            rule__ExamPaper__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExamPaper__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_10__3"


    // $ANTLR start "rule__ExamPaper__Group_10__3__Impl"
    // InternalDsl.g:4892:1: rule__ExamPaper__Group_10__3__Impl : ( ( rule__ExamPaper__Group_10_3__0 )* ) ;
    public final void rule__ExamPaper__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4896:1: ( ( ( rule__ExamPaper__Group_10_3__0 )* ) )
            // InternalDsl.g:4897:1: ( ( rule__ExamPaper__Group_10_3__0 )* )
            {
            // InternalDsl.g:4897:1: ( ( rule__ExamPaper__Group_10_3__0 )* )
            // InternalDsl.g:4898:2: ( rule__ExamPaper__Group_10_3__0 )*
            {
             before(grammarAccess.getExamPaperAccess().getGroup_10_3()); 
            // InternalDsl.g:4899:2: ( rule__ExamPaper__Group_10_3__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==20) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalDsl.g:4899:3: rule__ExamPaper__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ExamPaper__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getExamPaperAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_10__3__Impl"


    // $ANTLR start "rule__ExamPaper__Group_10__4"
    // InternalDsl.g:4907:1: rule__ExamPaper__Group_10__4 : rule__ExamPaper__Group_10__4__Impl ;
    public final void rule__ExamPaper__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4911:1: ( rule__ExamPaper__Group_10__4__Impl )
            // InternalDsl.g:4912:2: rule__ExamPaper__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExamPaper__Group_10__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_10__4"


    // $ANTLR start "rule__ExamPaper__Group_10__4__Impl"
    // InternalDsl.g:4918:1: rule__ExamPaper__Group_10__4__Impl : ( '}' ) ;
    public final void rule__ExamPaper__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4922:1: ( ( '}' ) )
            // InternalDsl.g:4923:1: ( '}' )
            {
            // InternalDsl.g:4923:1: ( '}' )
            // InternalDsl.g:4924:2: '}'
            {
             before(grammarAccess.getExamPaperAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getExamPaperAccess().getRightCurlyBracketKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_10__4__Impl"


    // $ANTLR start "rule__ExamPaper__Group_10_3__0"
    // InternalDsl.g:4934:1: rule__ExamPaper__Group_10_3__0 : rule__ExamPaper__Group_10_3__0__Impl rule__ExamPaper__Group_10_3__1 ;
    public final void rule__ExamPaper__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4938:1: ( rule__ExamPaper__Group_10_3__0__Impl rule__ExamPaper__Group_10_3__1 )
            // InternalDsl.g:4939:2: rule__ExamPaper__Group_10_3__0__Impl rule__ExamPaper__Group_10_3__1
            {
            pushFollow(FOLLOW_24);
            rule__ExamPaper__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExamPaper__Group_10_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_10_3__0"


    // $ANTLR start "rule__ExamPaper__Group_10_3__0__Impl"
    // InternalDsl.g:4946:1: rule__ExamPaper__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__ExamPaper__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4950:1: ( ( ',' ) )
            // InternalDsl.g:4951:1: ( ',' )
            {
            // InternalDsl.g:4951:1: ( ',' )
            // InternalDsl.g:4952:2: ','
            {
             before(grammarAccess.getExamPaperAccess().getCommaKeyword_10_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getExamPaperAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_10_3__0__Impl"


    // $ANTLR start "rule__ExamPaper__Group_10_3__1"
    // InternalDsl.g:4961:1: rule__ExamPaper__Group_10_3__1 : rule__ExamPaper__Group_10_3__1__Impl ;
    public final void rule__ExamPaper__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4965:1: ( rule__ExamPaper__Group_10_3__1__Impl )
            // InternalDsl.g:4966:2: rule__ExamPaper__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExamPaper__Group_10_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_10_3__1"


    // $ANTLR start "rule__ExamPaper__Group_10_3__1__Impl"
    // InternalDsl.g:4972:1: rule__ExamPaper__Group_10_3__1__Impl : ( ( rule__ExamPaper__SubmitAssignment_10_3_1 ) ) ;
    public final void rule__ExamPaper__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4976:1: ( ( ( rule__ExamPaper__SubmitAssignment_10_3_1 ) ) )
            // InternalDsl.g:4977:1: ( ( rule__ExamPaper__SubmitAssignment_10_3_1 ) )
            {
            // InternalDsl.g:4977:1: ( ( rule__ExamPaper__SubmitAssignment_10_3_1 ) )
            // InternalDsl.g:4978:2: ( rule__ExamPaper__SubmitAssignment_10_3_1 )
            {
             before(grammarAccess.getExamPaperAccess().getSubmitAssignment_10_3_1()); 
            // InternalDsl.g:4979:2: ( rule__ExamPaper__SubmitAssignment_10_3_1 )
            // InternalDsl.g:4979:3: rule__ExamPaper__SubmitAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ExamPaper__SubmitAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExamPaperAccess().getSubmitAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__Group_10_3__1__Impl"


    // $ANTLR start "rule__Class__IdAssignment_3_1"
    // InternalDsl.g:4988:1: rule__Class__IdAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Class__IdAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4992:1: ( ( ruleEString ) )
            // InternalDsl.g:4993:2: ( ruleEString )
            {
            // InternalDsl.g:4993:2: ( ruleEString )
            // InternalDsl.g:4994:3: ruleEString
            {
             before(grammarAccess.getClassAccess().getIdEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClassAccess().getIdEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__IdAssignment_3_1"


    // $ANTLR start "rule__Class__StudentnumAssignment_4_1"
    // InternalDsl.g:5003:1: rule__Class__StudentnumAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Class__StudentnumAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5007:1: ( ( ruleEInt ) )
            // InternalDsl.g:5008:2: ( ruleEInt )
            {
            // InternalDsl.g:5008:2: ( ruleEInt )
            // InternalDsl.g:5009:3: ruleEInt
            {
             before(grammarAccess.getClassAccess().getStudentnumEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getClassAccess().getStudentnumEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__StudentnumAssignment_4_1"


    // $ANTLR start "rule__Class__GradeAssignment_5_1"
    // InternalDsl.g:5018:1: rule__Class__GradeAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Class__GradeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5022:1: ( ( ruleEString ) )
            // InternalDsl.g:5023:2: ( ruleEString )
            {
            // InternalDsl.g:5023:2: ( ruleEString )
            // InternalDsl.g:5024:3: ruleEString
            {
             before(grammarAccess.getClassAccess().getGradeEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClassAccess().getGradeEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__GradeAssignment_5_1"


    // $ANTLR start "rule__Class__TeacherAssignment_6_2"
    // InternalDsl.g:5033:1: rule__Class__TeacherAssignment_6_2 : ( ruleTeacher ) ;
    public final void rule__Class__TeacherAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5037:1: ( ( ruleTeacher ) )
            // InternalDsl.g:5038:2: ( ruleTeacher )
            {
            // InternalDsl.g:5038:2: ( ruleTeacher )
            // InternalDsl.g:5039:3: ruleTeacher
            {
             before(grammarAccess.getClassAccess().getTeacherTeacherParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTeacher();

            state._fsp--;

             after(grammarAccess.getClassAccess().getTeacherTeacherParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__TeacherAssignment_6_2"


    // $ANTLR start "rule__Class__TeacherAssignment_6_3_1"
    // InternalDsl.g:5048:1: rule__Class__TeacherAssignment_6_3_1 : ( ruleTeacher ) ;
    public final void rule__Class__TeacherAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5052:1: ( ( ruleTeacher ) )
            // InternalDsl.g:5053:2: ( ruleTeacher )
            {
            // InternalDsl.g:5053:2: ( ruleTeacher )
            // InternalDsl.g:5054:3: ruleTeacher
            {
             before(grammarAccess.getClassAccess().getTeacherTeacherParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTeacher();

            state._fsp--;

             after(grammarAccess.getClassAccess().getTeacherTeacherParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__TeacherAssignment_6_3_1"


    // $ANTLR start "rule__Class__StudentAssignment_7_2"
    // InternalDsl.g:5063:1: rule__Class__StudentAssignment_7_2 : ( ruleStudent ) ;
    public final void rule__Class__StudentAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5067:1: ( ( ruleStudent ) )
            // InternalDsl.g:5068:2: ( ruleStudent )
            {
            // InternalDsl.g:5068:2: ( ruleStudent )
            // InternalDsl.g:5069:3: ruleStudent
            {
             before(grammarAccess.getClassAccess().getStudentStudentParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStudent();

            state._fsp--;

             after(grammarAccess.getClassAccess().getStudentStudentParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__StudentAssignment_7_2"


    // $ANTLR start "rule__Class__StudentAssignment_7_3_1"
    // InternalDsl.g:5078:1: rule__Class__StudentAssignment_7_3_1 : ( ruleStudent ) ;
    public final void rule__Class__StudentAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5082:1: ( ( ruleStudent ) )
            // InternalDsl.g:5083:2: ( ruleStudent )
            {
            // InternalDsl.g:5083:2: ( ruleStudent )
            // InternalDsl.g:5084:3: ruleStudent
            {
             before(grammarAccess.getClassAccess().getStudentStudentParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStudent();

            state._fsp--;

             after(grammarAccess.getClassAccess().getStudentStudentParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__StudentAssignment_7_3_1"


    // $ANTLR start "rule__Teacher__NameAssignment_1"
    // InternalDsl.g:5093:1: rule__Teacher__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Teacher__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5097:1: ( ( ruleEString ) )
            // InternalDsl.g:5098:2: ( ruleEString )
            {
            // InternalDsl.g:5098:2: ( ruleEString )
            // InternalDsl.g:5099:3: ruleEString
            {
             before(grammarAccess.getTeacherAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTeacherAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__NameAssignment_1"


    // $ANTLR start "rule__Teacher__IdAssignment_3_1"
    // InternalDsl.g:5108:1: rule__Teacher__IdAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Teacher__IdAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5112:1: ( ( ruleEString ) )
            // InternalDsl.g:5113:2: ( ruleEString )
            {
            // InternalDsl.g:5113:2: ( ruleEString )
            // InternalDsl.g:5114:3: ruleEString
            {
             before(grammarAccess.getTeacherAccess().getIdEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTeacherAccess().getIdEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__IdAssignment_3_1"


    // $ANTLR start "rule__Teacher__ClassidAssignment_4_1"
    // InternalDsl.g:5123:1: rule__Teacher__ClassidAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Teacher__ClassidAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5127:1: ( ( ruleEString ) )
            // InternalDsl.g:5128:2: ( ruleEString )
            {
            // InternalDsl.g:5128:2: ( ruleEString )
            // InternalDsl.g:5129:3: ruleEString
            {
             before(grammarAccess.getTeacherAccess().getClassidEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTeacherAccess().getClassidEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__ClassidAssignment_4_1"


    // $ANTLR start "rule__Teacher__CorrectAssignment_7"
    // InternalDsl.g:5138:1: rule__Teacher__CorrectAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__Teacher__CorrectAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5142:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:5143:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:5143:2: ( ( ruleEString ) )
            // InternalDsl.g:5144:3: ( ruleEString )
            {
             before(grammarAccess.getTeacherAccess().getCorrectSubmitedPaperCrossReference_7_0()); 
            // InternalDsl.g:5145:3: ( ruleEString )
            // InternalDsl.g:5146:4: ruleEString
            {
             before(grammarAccess.getTeacherAccess().getCorrectSubmitedPaperEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTeacherAccess().getCorrectSubmitedPaperEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getTeacherAccess().getCorrectSubmitedPaperCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__CorrectAssignment_7"


    // $ANTLR start "rule__Teacher__CorrectAssignment_8_1"
    // InternalDsl.g:5157:1: rule__Teacher__CorrectAssignment_8_1 : ( ( ruleEString ) ) ;
    public final void rule__Teacher__CorrectAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5161:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:5162:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:5162:2: ( ( ruleEString ) )
            // InternalDsl.g:5163:3: ( ruleEString )
            {
             before(grammarAccess.getTeacherAccess().getCorrectSubmitedPaperCrossReference_8_1_0()); 
            // InternalDsl.g:5164:3: ( ruleEString )
            // InternalDsl.g:5165:4: ruleEString
            {
             before(grammarAccess.getTeacherAccess().getCorrectSubmitedPaperEStringParserRuleCall_8_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTeacherAccess().getCorrectSubmitedPaperEStringParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getTeacherAccess().getCorrectSubmitedPaperCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__CorrectAssignment_8_1"


    // $ANTLR start "rule__Teacher__TeachingAssignment_10_2"
    // InternalDsl.g:5176:1: rule__Teacher__TeachingAssignment_10_2 : ( ruleCourse ) ;
    public final void rule__Teacher__TeachingAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5180:1: ( ( ruleCourse ) )
            // InternalDsl.g:5181:2: ( ruleCourse )
            {
            // InternalDsl.g:5181:2: ( ruleCourse )
            // InternalDsl.g:5182:3: ruleCourse
            {
             before(grammarAccess.getTeacherAccess().getTeachingCourseParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCourse();

            state._fsp--;

             after(grammarAccess.getTeacherAccess().getTeachingCourseParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__TeachingAssignment_10_2"


    // $ANTLR start "rule__Teacher__TeachingAssignment_10_3_1"
    // InternalDsl.g:5191:1: rule__Teacher__TeachingAssignment_10_3_1 : ( ruleCourse ) ;
    public final void rule__Teacher__TeachingAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5195:1: ( ( ruleCourse ) )
            // InternalDsl.g:5196:2: ( ruleCourse )
            {
            // InternalDsl.g:5196:2: ( ruleCourse )
            // InternalDsl.g:5197:3: ruleCourse
            {
             before(grammarAccess.getTeacherAccess().getTeachingCourseParserRuleCall_10_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCourse();

            state._fsp--;

             after(grammarAccess.getTeacherAccess().getTeachingCourseParserRuleCall_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__TeachingAssignment_10_3_1"


    // $ANTLR start "rule__Teacher__InputAssignment_11_2"
    // InternalDsl.g:5206:1: rule__Teacher__InputAssignment_11_2 : ( ruleReportCard ) ;
    public final void rule__Teacher__InputAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5210:1: ( ( ruleReportCard ) )
            // InternalDsl.g:5211:2: ( ruleReportCard )
            {
            // InternalDsl.g:5211:2: ( ruleReportCard )
            // InternalDsl.g:5212:3: ruleReportCard
            {
             before(grammarAccess.getTeacherAccess().getInputReportCardParserRuleCall_11_2_0()); 
            pushFollow(FOLLOW_2);
            ruleReportCard();

            state._fsp--;

             after(grammarAccess.getTeacherAccess().getInputReportCardParserRuleCall_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__InputAssignment_11_2"


    // $ANTLR start "rule__Teacher__InputAssignment_11_3_1"
    // InternalDsl.g:5221:1: rule__Teacher__InputAssignment_11_3_1 : ( ruleReportCard ) ;
    public final void rule__Teacher__InputAssignment_11_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5225:1: ( ( ruleReportCard ) )
            // InternalDsl.g:5226:2: ( ruleReportCard )
            {
            // InternalDsl.g:5226:2: ( ruleReportCard )
            // InternalDsl.g:5227:3: ruleReportCard
            {
             before(grammarAccess.getTeacherAccess().getInputReportCardParserRuleCall_11_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReportCard();

            state._fsp--;

             after(grammarAccess.getTeacherAccess().getInputReportCardParserRuleCall_11_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__InputAssignment_11_3_1"


    // $ANTLR start "rule__Student__NameAssignment_1"
    // InternalDsl.g:5236:1: rule__Student__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Student__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5240:1: ( ( ruleEString ) )
            // InternalDsl.g:5241:2: ( ruleEString )
            {
            // InternalDsl.g:5241:2: ( ruleEString )
            // InternalDsl.g:5242:3: ruleEString
            {
             before(grammarAccess.getStudentAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStudentAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__NameAssignment_1"


    // $ANTLR start "rule__Student__IdAssignment_3_1"
    // InternalDsl.g:5251:1: rule__Student__IdAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Student__IdAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5255:1: ( ( ruleEString ) )
            // InternalDsl.g:5256:2: ( ruleEString )
            {
            // InternalDsl.g:5256:2: ( ruleEString )
            // InternalDsl.g:5257:3: ruleEString
            {
             before(grammarAccess.getStudentAccess().getIdEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStudentAccess().getIdEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__IdAssignment_3_1"


    // $ANTLR start "rule__Student__ClassidAssignment_4_1"
    // InternalDsl.g:5266:1: rule__Student__ClassidAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Student__ClassidAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5270:1: ( ( ruleEString ) )
            // InternalDsl.g:5271:2: ( ruleEString )
            {
            // InternalDsl.g:5271:2: ( ruleEString )
            // InternalDsl.g:5272:3: ruleEString
            {
             before(grammarAccess.getStudentAccess().getClassidEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStudentAccess().getClassidEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__ClassidAssignment_4_1"


    // $ANTLR start "rule__Student__HaveAssignment_6"
    // InternalDsl.g:5281:1: rule__Student__HaveAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Student__HaveAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5285:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:5286:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:5286:2: ( ( ruleEString ) )
            // InternalDsl.g:5287:3: ( ruleEString )
            {
             before(grammarAccess.getStudentAccess().getHaveReportCardCrossReference_6_0()); 
            // InternalDsl.g:5288:3: ( ruleEString )
            // InternalDsl.g:5289:4: ruleEString
            {
             before(grammarAccess.getStudentAccess().getHaveReportCardEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStudentAccess().getHaveReportCardEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getStudentAccess().getHaveReportCardCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__HaveAssignment_6"


    // $ANTLR start "rule__Student__AnswerAssignment_7_2"
    // InternalDsl.g:5300:1: rule__Student__AnswerAssignment_7_2 : ( ruleExamPaper ) ;
    public final void rule__Student__AnswerAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5304:1: ( ( ruleExamPaper ) )
            // InternalDsl.g:5305:2: ( ruleExamPaper )
            {
            // InternalDsl.g:5305:2: ( ruleExamPaper )
            // InternalDsl.g:5306:3: ruleExamPaper
            {
             before(grammarAccess.getStudentAccess().getAnswerExamPaperParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExamPaper();

            state._fsp--;

             after(grammarAccess.getStudentAccess().getAnswerExamPaperParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__AnswerAssignment_7_2"


    // $ANTLR start "rule__Student__AnswerAssignment_7_3_1"
    // InternalDsl.g:5315:1: rule__Student__AnswerAssignment_7_3_1 : ( ruleExamPaper ) ;
    public final void rule__Student__AnswerAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5319:1: ( ( ruleExamPaper ) )
            // InternalDsl.g:5320:2: ( ruleExamPaper )
            {
            // InternalDsl.g:5320:2: ( ruleExamPaper )
            // InternalDsl.g:5321:3: ruleExamPaper
            {
             before(grammarAccess.getStudentAccess().getAnswerExamPaperParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExamPaper();

            state._fsp--;

             after(grammarAccess.getStudentAccess().getAnswerExamPaperParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__AnswerAssignment_7_3_1"


    // $ANTLR start "rule__Course__NameAssignment_2"
    // InternalDsl.g:5330:1: rule__Course__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Course__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5334:1: ( ( ruleEString ) )
            // InternalDsl.g:5335:2: ( ruleEString )
            {
            // InternalDsl.g:5335:2: ( ruleEString )
            // InternalDsl.g:5336:3: ruleEString
            {
             before(grammarAccess.getCourseAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__NameAssignment_2"


    // $ANTLR start "rule__Course__IdAssignment_4_1"
    // InternalDsl.g:5345:1: rule__Course__IdAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Course__IdAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5349:1: ( ( ruleEString ) )
            // InternalDsl.g:5350:2: ( ruleEString )
            {
            // InternalDsl.g:5350:2: ( ruleEString )
            // InternalDsl.g:5351:3: ruleEString
            {
             before(grammarAccess.getCourseAccess().getIdEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getIdEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__IdAssignment_4_1"


    // $ANTLR start "rule__Course__StunumAssignment_5_1"
    // InternalDsl.g:5360:1: rule__Course__StunumAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Course__StunumAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5364:1: ( ( ruleEInt ) )
            // InternalDsl.g:5365:2: ( ruleEInt )
            {
            // InternalDsl.g:5365:2: ( ruleEInt )
            // InternalDsl.g:5366:3: ruleEInt
            {
             before(grammarAccess.getCourseAccess().getStunumEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getStunumEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__StunumAssignment_5_1"


    // $ANTLR start "rule__Course__MeanAssignment_6_1"
    // InternalDsl.g:5375:1: rule__Course__MeanAssignment_6_1 : ( ruleEFloat ) ;
    public final void rule__Course__MeanAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5379:1: ( ( ruleEFloat ) )
            // InternalDsl.g:5380:2: ( ruleEFloat )
            {
            // InternalDsl.g:5380:2: ( ruleEFloat )
            // InternalDsl.g:5381:3: ruleEFloat
            {
             before(grammarAccess.getCourseAccess().getMeanEFloatParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getMeanEFloatParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__MeanAssignment_6_1"


    // $ANTLR start "rule__ReportCard__IdAssignment_3_1"
    // InternalDsl.g:5390:1: rule__ReportCard__IdAssignment_3_1 : ( ruleEString ) ;
    public final void rule__ReportCard__IdAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5394:1: ( ( ruleEString ) )
            // InternalDsl.g:5395:2: ( ruleEString )
            {
            // InternalDsl.g:5395:2: ( ruleEString )
            // InternalDsl.g:5396:3: ruleEString
            {
             before(grammarAccess.getReportCardAccess().getIdEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReportCardAccess().getIdEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__IdAssignment_3_1"


    // $ANTLR start "rule__ReportCard__StuidAssignment_4_1"
    // InternalDsl.g:5405:1: rule__ReportCard__StuidAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ReportCard__StuidAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5409:1: ( ( ruleEString ) )
            // InternalDsl.g:5410:2: ( ruleEString )
            {
            // InternalDsl.g:5410:2: ( ruleEString )
            // InternalDsl.g:5411:3: ruleEString
            {
             before(grammarAccess.getReportCardAccess().getStuidEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReportCardAccess().getStuidEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__StuidAssignment_4_1"


    // $ANTLR start "rule__ReportCard__StunameAssignment_5_1"
    // InternalDsl.g:5420:1: rule__ReportCard__StunameAssignment_5_1 : ( ruleEString ) ;
    public final void rule__ReportCard__StunameAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5424:1: ( ( ruleEString ) )
            // InternalDsl.g:5425:2: ( ruleEString )
            {
            // InternalDsl.g:5425:2: ( ruleEString )
            // InternalDsl.g:5426:3: ruleEString
            {
             before(grammarAccess.getReportCardAccess().getStunameEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReportCardAccess().getStunameEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__StunameAssignment_5_1"


    // $ANTLR start "rule__ReportCard__TotalscoreAssignment_6_1"
    // InternalDsl.g:5435:1: rule__ReportCard__TotalscoreAssignment_6_1 : ( ruleEFloat ) ;
    public final void rule__ReportCard__TotalscoreAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5439:1: ( ( ruleEFloat ) )
            // InternalDsl.g:5440:2: ( ruleEFloat )
            {
            // InternalDsl.g:5440:2: ( ruleEFloat )
            // InternalDsl.g:5441:3: ruleEFloat
            {
             before(grammarAccess.getReportCardAccess().getTotalscoreEFloatParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getReportCardAccess().getTotalscoreEFloatParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__TotalscoreAssignment_6_1"


    // $ANTLR start "rule__ReportCard__RankAssignment_7_1"
    // InternalDsl.g:5450:1: rule__ReportCard__RankAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__ReportCard__RankAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5454:1: ( ( ruleEInt ) )
            // InternalDsl.g:5455:2: ( ruleEInt )
            {
            // InternalDsl.g:5455:2: ( ruleEInt )
            // InternalDsl.g:5456:3: ruleEInt
            {
             before(grammarAccess.getReportCardAccess().getRankEIntParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getReportCardAccess().getRankEIntParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportCard__RankAssignment_7_1"


    // $ANTLR start "rule__SubmitedPaper__IfcorrectAssignment_1"
    // InternalDsl.g:5465:1: rule__SubmitedPaper__IfcorrectAssignment_1 : ( ( 'ifcorrect' ) ) ;
    public final void rule__SubmitedPaper__IfcorrectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5469:1: ( ( ( 'ifcorrect' ) ) )
            // InternalDsl.g:5470:2: ( ( 'ifcorrect' ) )
            {
            // InternalDsl.g:5470:2: ( ( 'ifcorrect' ) )
            // InternalDsl.g:5471:3: ( 'ifcorrect' )
            {
             before(grammarAccess.getSubmitedPaperAccess().getIfcorrectIfcorrectKeyword_1_0()); 
            // InternalDsl.g:5472:3: ( 'ifcorrect' )
            // InternalDsl.g:5473:4: 'ifcorrect'
            {
             before(grammarAccess.getSubmitedPaperAccess().getIfcorrectIfcorrectKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getSubmitedPaperAccess().getIfcorrectIfcorrectKeyword_1_0()); 

            }

             after(grammarAccess.getSubmitedPaperAccess().getIfcorrectIfcorrectKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__IfcorrectAssignment_1"


    // $ANTLR start "rule__SubmitedPaper__IfanswerAssignment_2"
    // InternalDsl.g:5484:1: rule__SubmitedPaper__IfanswerAssignment_2 : ( ( 'ifanswer' ) ) ;
    public final void rule__SubmitedPaper__IfanswerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5488:1: ( ( ( 'ifanswer' ) ) )
            // InternalDsl.g:5489:2: ( ( 'ifanswer' ) )
            {
            // InternalDsl.g:5489:2: ( ( 'ifanswer' ) )
            // InternalDsl.g:5490:3: ( 'ifanswer' )
            {
             before(grammarAccess.getSubmitedPaperAccess().getIfanswerIfanswerKeyword_2_0()); 
            // InternalDsl.g:5491:3: ( 'ifanswer' )
            // InternalDsl.g:5492:4: 'ifanswer'
            {
             before(grammarAccess.getSubmitedPaperAccess().getIfanswerIfanswerKeyword_2_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getSubmitedPaperAccess().getIfanswerIfanswerKeyword_2_0()); 

            }

             after(grammarAccess.getSubmitedPaperAccess().getIfanswerIfanswerKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__IfanswerAssignment_2"


    // $ANTLR start "rule__SubmitedPaper__IdAssignment_5_1"
    // InternalDsl.g:5503:1: rule__SubmitedPaper__IdAssignment_5_1 : ( ruleEString ) ;
    public final void rule__SubmitedPaper__IdAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5507:1: ( ( ruleEString ) )
            // InternalDsl.g:5508:2: ( ruleEString )
            {
            // InternalDsl.g:5508:2: ( ruleEString )
            // InternalDsl.g:5509:3: ruleEString
            {
             before(grammarAccess.getSubmitedPaperAccess().getIdEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubmitedPaperAccess().getIdEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__IdAssignment_5_1"


    // $ANTLR start "rule__SubmitedPaper__StuidAssignment_6_1"
    // InternalDsl.g:5518:1: rule__SubmitedPaper__StuidAssignment_6_1 : ( ruleEString ) ;
    public final void rule__SubmitedPaper__StuidAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5522:1: ( ( ruleEString ) )
            // InternalDsl.g:5523:2: ( ruleEString )
            {
            // InternalDsl.g:5523:2: ( ruleEString )
            // InternalDsl.g:5524:3: ruleEString
            {
             before(grammarAccess.getSubmitedPaperAccess().getStuidEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubmitedPaperAccess().getStuidEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__StuidAssignment_6_1"


    // $ANTLR start "rule__SubmitedPaper__TeaidAssignment_7_1"
    // InternalDsl.g:5533:1: rule__SubmitedPaper__TeaidAssignment_7_1 : ( ruleEString ) ;
    public final void rule__SubmitedPaper__TeaidAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5537:1: ( ( ruleEString ) )
            // InternalDsl.g:5538:2: ( ruleEString )
            {
            // InternalDsl.g:5538:2: ( ruleEString )
            // InternalDsl.g:5539:3: ruleEString
            {
             before(grammarAccess.getSubmitedPaperAccess().getTeaidEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubmitedPaperAccess().getTeaidEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__TeaidAssignment_7_1"


    // $ANTLR start "rule__SubmitedPaper__CourseidAssignment_8_1"
    // InternalDsl.g:5548:1: rule__SubmitedPaper__CourseidAssignment_8_1 : ( ruleEString ) ;
    public final void rule__SubmitedPaper__CourseidAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5552:1: ( ( ruleEString ) )
            // InternalDsl.g:5553:2: ( ruleEString )
            {
            // InternalDsl.g:5553:2: ( ruleEString )
            // InternalDsl.g:5554:3: ruleEString
            {
             before(grammarAccess.getSubmitedPaperAccess().getCourseidEStringParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubmitedPaperAccess().getCourseidEStringParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmitedPaper__CourseidAssignment_8_1"


    // $ANTLR start "rule__ExamPaper__IfanswerAssignment_1"
    // InternalDsl.g:5563:1: rule__ExamPaper__IfanswerAssignment_1 : ( ( 'ifanswer' ) ) ;
    public final void rule__ExamPaper__IfanswerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5567:1: ( ( ( 'ifanswer' ) ) )
            // InternalDsl.g:5568:2: ( ( 'ifanswer' ) )
            {
            // InternalDsl.g:5568:2: ( ( 'ifanswer' ) )
            // InternalDsl.g:5569:3: ( 'ifanswer' )
            {
             before(grammarAccess.getExamPaperAccess().getIfanswerIfanswerKeyword_1_0()); 
            // InternalDsl.g:5570:3: ( 'ifanswer' )
            // InternalDsl.g:5571:4: 'ifanswer'
            {
             before(grammarAccess.getExamPaperAccess().getIfanswerIfanswerKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getExamPaperAccess().getIfanswerIfanswerKeyword_1_0()); 

            }

             after(grammarAccess.getExamPaperAccess().getIfanswerIfanswerKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__IfanswerAssignment_1"


    // $ANTLR start "rule__ExamPaper__IfcorrectAssignment_2"
    // InternalDsl.g:5582:1: rule__ExamPaper__IfcorrectAssignment_2 : ( ( 'ifcorrect' ) ) ;
    public final void rule__ExamPaper__IfcorrectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5586:1: ( ( ( 'ifcorrect' ) ) )
            // InternalDsl.g:5587:2: ( ( 'ifcorrect' ) )
            {
            // InternalDsl.g:5587:2: ( ( 'ifcorrect' ) )
            // InternalDsl.g:5588:3: ( 'ifcorrect' )
            {
             before(grammarAccess.getExamPaperAccess().getIfcorrectIfcorrectKeyword_2_0()); 
            // InternalDsl.g:5589:3: ( 'ifcorrect' )
            // InternalDsl.g:5590:4: 'ifcorrect'
            {
             before(grammarAccess.getExamPaperAccess().getIfcorrectIfcorrectKeyword_2_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getExamPaperAccess().getIfcorrectIfcorrectKeyword_2_0()); 

            }

             after(grammarAccess.getExamPaperAccess().getIfcorrectIfcorrectKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__IfcorrectAssignment_2"


    // $ANTLR start "rule__ExamPaper__IdAssignment_5_1"
    // InternalDsl.g:5601:1: rule__ExamPaper__IdAssignment_5_1 : ( ruleEString ) ;
    public final void rule__ExamPaper__IdAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5605:1: ( ( ruleEString ) )
            // InternalDsl.g:5606:2: ( ruleEString )
            {
            // InternalDsl.g:5606:2: ( ruleEString )
            // InternalDsl.g:5607:3: ruleEString
            {
             before(grammarAccess.getExamPaperAccess().getIdEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExamPaperAccess().getIdEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__IdAssignment_5_1"


    // $ANTLR start "rule__ExamPaper__CourseidAssignment_6_1"
    // InternalDsl.g:5616:1: rule__ExamPaper__CourseidAssignment_6_1 : ( ruleEString ) ;
    public final void rule__ExamPaper__CourseidAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5620:1: ( ( ruleEString ) )
            // InternalDsl.g:5621:2: ( ruleEString )
            {
            // InternalDsl.g:5621:2: ( ruleEString )
            // InternalDsl.g:5622:3: ruleEString
            {
             before(grammarAccess.getExamPaperAccess().getCourseidEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExamPaperAccess().getCourseidEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__CourseidAssignment_6_1"


    // $ANTLR start "rule__ExamPaper__TeaidAssignment_7_1"
    // InternalDsl.g:5631:1: rule__ExamPaper__TeaidAssignment_7_1 : ( ruleEString ) ;
    public final void rule__ExamPaper__TeaidAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5635:1: ( ( ruleEString ) )
            // InternalDsl.g:5636:2: ( ruleEString )
            {
            // InternalDsl.g:5636:2: ( ruleEString )
            // InternalDsl.g:5637:3: ruleEString
            {
             before(grammarAccess.getExamPaperAccess().getTeaidEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExamPaperAccess().getTeaidEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__TeaidAssignment_7_1"


    // $ANTLR start "rule__ExamPaper__StuidAssignment_8_1"
    // InternalDsl.g:5646:1: rule__ExamPaper__StuidAssignment_8_1 : ( ruleEString ) ;
    public final void rule__ExamPaper__StuidAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5650:1: ( ( ruleEString ) )
            // InternalDsl.g:5651:2: ( ruleEString )
            {
            // InternalDsl.g:5651:2: ( ruleEString )
            // InternalDsl.g:5652:3: ruleEString
            {
             before(grammarAccess.getExamPaperAccess().getStuidEStringParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExamPaperAccess().getStuidEStringParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__StuidAssignment_8_1"


    // $ANTLR start "rule__ExamPaper__ScoreAssignment_9_1"
    // InternalDsl.g:5661:1: rule__ExamPaper__ScoreAssignment_9_1 : ( ruleEFloat ) ;
    public final void rule__ExamPaper__ScoreAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5665:1: ( ( ruleEFloat ) )
            // InternalDsl.g:5666:2: ( ruleEFloat )
            {
            // InternalDsl.g:5666:2: ( ruleEFloat )
            // InternalDsl.g:5667:3: ruleEFloat
            {
             before(grammarAccess.getExamPaperAccess().getScoreEFloatParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getExamPaperAccess().getScoreEFloatParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__ScoreAssignment_9_1"


    // $ANTLR start "rule__ExamPaper__SubmitAssignment_10_2"
    // InternalDsl.g:5676:1: rule__ExamPaper__SubmitAssignment_10_2 : ( ruleSubmitedPaper ) ;
    public final void rule__ExamPaper__SubmitAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5680:1: ( ( ruleSubmitedPaper ) )
            // InternalDsl.g:5681:2: ( ruleSubmitedPaper )
            {
            // InternalDsl.g:5681:2: ( ruleSubmitedPaper )
            // InternalDsl.g:5682:3: ruleSubmitedPaper
            {
             before(grammarAccess.getExamPaperAccess().getSubmitSubmitedPaperParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSubmitedPaper();

            state._fsp--;

             after(grammarAccess.getExamPaperAccess().getSubmitSubmitedPaperParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__SubmitAssignment_10_2"


    // $ANTLR start "rule__ExamPaper__SubmitAssignment_10_3_1"
    // InternalDsl.g:5691:1: rule__ExamPaper__SubmitAssignment_10_3_1 : ( ruleSubmitedPaper ) ;
    public final void rule__ExamPaper__SubmitAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5695:1: ( ( ruleSubmitedPaper ) )
            // InternalDsl.g:5696:2: ( ruleSubmitedPaper )
            {
            // InternalDsl.g:5696:2: ( ruleSubmitedPaper )
            // InternalDsl.g:5697:3: ruleSubmitedPaper
            {
             before(grammarAccess.getExamPaperAccess().getSubmitSubmitedPaperParserRuleCall_10_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSubmitedPaper();

            state._fsp--;

             after(grammarAccess.getExamPaperAccess().getSubmitSubmitedPaperParserRuleCall_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamPaper__SubmitAssignment_10_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000002F8000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000009010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000030008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000088010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0003200000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000C00018000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000100000400040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000001E000018000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0003020000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000C2000018000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000CC2000018000L});

}