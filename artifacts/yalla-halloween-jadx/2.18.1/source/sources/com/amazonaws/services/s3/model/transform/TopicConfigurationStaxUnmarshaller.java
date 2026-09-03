package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.model.NotificationConfiguration;
import com.amazonaws.services.s3.model.TopicConfiguration;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers$StringStaxUnmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class TopicConfigurationStaxUnmarshaller extends NotificationConfigurationStaxUnmarshaller<TopicConfiguration> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static TopicConfigurationStaxUnmarshaller f11020OooO00o = new TopicConfigurationStaxUnmarshaller();

    private TopicConfigurationStaxUnmarshaller() {
    }

    @Override // com.amazonaws.services.s3.model.transform.NotificationConfigurationStaxUnmarshaller
    public final NotificationConfiguration OooO0O0() {
        return new TopicConfiguration();
    }

    @Override // com.amazonaws.services.s3.model.transform.NotificationConfigurationStaxUnmarshaller
    public final boolean OooO0OO(NotificationConfiguration notificationConfiguration, StaxUnmarshallerContext staxUnmarshallerContext, int i) throws Exception {
        TopicConfiguration topicConfiguration = (TopicConfiguration) notificationConfiguration;
        if (!staxUnmarshallerContext.OooO0o0("Topic", i)) {
            return false;
        }
        Objects.requireNonNull(SimpleTypeStaxUnmarshallers$StringStaxUnmarshaller.OooO0O0());
        topicConfiguration.f10942Oooo0oo = staxUnmarshallerContext.OooO0Oo();
        return true;
    }
}
