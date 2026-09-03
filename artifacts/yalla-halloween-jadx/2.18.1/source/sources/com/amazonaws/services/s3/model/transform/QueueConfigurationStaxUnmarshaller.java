package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.model.NotificationConfiguration;
import com.amazonaws.services.s3.model.QueueConfiguration;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers$StringStaxUnmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class QueueConfigurationStaxUnmarshaller extends NotificationConfigurationStaxUnmarshaller<QueueConfiguration> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static QueueConfigurationStaxUnmarshaller f11018OooO00o = new QueueConfigurationStaxUnmarshaller();

    private QueueConfigurationStaxUnmarshaller() {
    }

    @Override // com.amazonaws.services.s3.model.transform.NotificationConfigurationStaxUnmarshaller
    public final NotificationConfiguration OooO0O0() {
        return new QueueConfiguration();
    }

    @Override // com.amazonaws.services.s3.model.transform.NotificationConfigurationStaxUnmarshaller
    public final boolean OooO0OO(NotificationConfiguration notificationConfiguration, StaxUnmarshallerContext staxUnmarshallerContext, int i) throws Exception {
        QueueConfiguration queueConfiguration = (QueueConfiguration) notificationConfiguration;
        if (!staxUnmarshallerContext.OooO0o0("Queue", i)) {
            return false;
        }
        Objects.requireNonNull(SimpleTypeStaxUnmarshallers$StringStaxUnmarshaller.OooO0O0());
        queueConfiguration.f10877Oooo0oo = staxUnmarshallerContext.OooO0Oo();
        return true;
    }
}
