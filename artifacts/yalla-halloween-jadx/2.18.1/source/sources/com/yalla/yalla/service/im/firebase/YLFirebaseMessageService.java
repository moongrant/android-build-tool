package com.yalla.yalla.service.im.firebase;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import p529o0o0OO0o.o000OOo0;
import p529o0o0OO0o.o00O0000;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/service/im/firebase/YLFirebaseMessageService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public class YLFirebaseMessageService extends FirebaseMessagingService {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final String f21667Oooo0o = "extra";

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onDeletedMessages() {
        super.onDeletedMessages();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(@NotNull RemoteMessage message) {
        String str;
        Intrinsics.checkNotNullParameter(message, "message");
        super.onMessageReceived(message);
        Map<String, String> data = message.getData();
        if ((data == null || data.isEmpty()) || (str = message.getData().get(this.f21667Oooo0o)) == null) {
            return;
        }
        o000OOo0.OooO00o(str, false);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        super.onNewToken(token);
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00O0000(token, null), 3, null);
    }
}
