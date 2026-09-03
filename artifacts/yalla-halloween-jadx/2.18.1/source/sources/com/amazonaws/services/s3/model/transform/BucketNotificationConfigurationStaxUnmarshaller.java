package com.amazonaws.services.s3.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.model.BucketNotificationConfiguration;
import com.amazonaws.services.s3.model.NotificationConfiguration;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import java.io.InputStream;
import java.util.AbstractMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes.dex */
public class BucketNotificationConfigurationStaxUnmarshaller implements Unmarshaller<BucketNotificationConfiguration, InputStream> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static BucketNotificationConfigurationStaxUnmarshaller f11013OooO00o = new BucketNotificationConfigurationStaxUnmarshaller();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final XmlPullParserFactory f11014OooO0O0;

    static {
        try {
            f11014OooO0O0 = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new AmazonClientException("Couldn't initialize XmlPullParserFactory", e);
        }
    }

    private BucketNotificationConfigurationStaxUnmarshaller() {
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public final BucketNotificationConfiguration OooO00o(InputStream inputStream) throws Exception {
        XmlPullParser xmlPullParserNewPullParser = f11014OooO0O0.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, null);
        StaxUnmarshallerContext staxUnmarshallerContext = new StaxUnmarshallerContext(xmlPullParserNewPullParser);
        int iOooO00o = staxUnmarshallerContext.OooO00o();
        int i = iOooO00o + 1;
        if (staxUnmarshallerContext.OooO0O0()) {
            i++;
        }
        BucketNotificationConfiguration bucketNotificationConfiguration = new BucketNotificationConfiguration();
        while (true) {
            int iOooO0OO = staxUnmarshallerContext.OooO0OO();
            if (iOooO0OO == 1) {
                break;
            }
            if (iOooO0OO != 2) {
                if (iOooO0OO == 3 && staxUnmarshallerContext.OooO00o() < iOooO00o) {
                    break;
                }
            } else if (staxUnmarshallerContext.OooO0o0("TopicConfiguration", i)) {
                AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) TopicConfigurationStaxUnmarshaller.f11020OooO00o.OooO00o(staxUnmarshallerContext);
                bucketNotificationConfiguration.OooO00o((String) simpleEntry.getKey(), (NotificationConfiguration) simpleEntry.getValue());
            } else if (staxUnmarshallerContext.OooO0o0("QueueConfiguration", i)) {
                AbstractMap.SimpleEntry simpleEntry2 = (AbstractMap.SimpleEntry) QueueConfigurationStaxUnmarshaller.f11018OooO00o.OooO00o(staxUnmarshallerContext);
                bucketNotificationConfiguration.OooO00o((String) simpleEntry2.getKey(), (NotificationConfiguration) simpleEntry2.getValue());
            } else if (staxUnmarshallerContext.OooO0o0("CloudFunctionConfiguration", i)) {
                AbstractMap.SimpleEntry simpleEntry3 = (AbstractMap.SimpleEntry) LambdaConfigurationStaxUnmarshaller.f11017OooO00o.OooO00o(staxUnmarshallerContext);
                bucketNotificationConfiguration.OooO00o((String) simpleEntry3.getKey(), (NotificationConfiguration) simpleEntry3.getValue());
            }
        }
        return bucketNotificationConfiguration;
    }
}
