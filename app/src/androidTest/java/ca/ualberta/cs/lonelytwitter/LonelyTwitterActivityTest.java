package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
import android.widget.ListView;

import com.robotium.solo.Solo;

import junit.framework.TestCase;

/**
 * Created by wz on 14/09/15.
 */
public class LonelyTwitterActivityTest extends ActivityInstrumentationTestCase2 {

    public LonelyTwitterActivityTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testStart() throws Exception {
        Activity activity = getActivity();

    }

    private Solo solo;

    @Override
    public void setUp(){
        solo = new Solo(getInstrumentation(),getActivity());
    }
    @Override
    public void tearDown(){
        solo.finishOpenedActivities();
    }

    public void testTweet(){
        solo.assertCurrentActivity("wrong activity", "LonelyTwitterActivity");
    }

    public void testEqual(){
        assertEquals("not equal","6","6");
    }

    public void testAddTweet(){
        solo.enterText((EditText) solo.getView(R.id.body),"new thing");
        solo.clickOnButton("Save");
        solo.clearEditText(((EditText) solo.getView(R.id.body)));
        assertTrue(solo.waitForText(("new thing")));
    }

    public void testClickTweetList(){
        LonelyTwitterActivity activity = (LonelyTwitterActivity) solo.getCurrentActivity();

        solo.assertCurrentActivity("wrong activity", LonelyTwitterActivity.class);

        final ListView oldTweetsList = activity.getOldTweetsList();
        Tweet tweet = (Tweet) oldTweetsList.getItemAtPosition(0);

        solo.clickInList(0);
        solo.assertCurrentActivity("wrong activity", EditTweetActivity.class);
        assertTrue(solo.waitForText("new thing"));

        solo.goBack();
        solo.assertCurrentActivity("wrong activity", LonelyTwitterActivity.class);
    }
}