package com.yalla.yalla.service.im.firebase;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import p190o00o0O.OooOo;
import p478o0o000.Oooo000;
import p478o0o000.o0OoOo0;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/service/im/firebase/YLFirebaseMessageService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public class YLFirebaseMessageService extends FirebaseMessagingService {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String f24485OooO0Oo = "extra";

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        o0000O00.OooO0OO("YLFirebaseMessagingService", "onCreate");
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onDeletedMessages() {
        super.onDeletedMessages();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        o0000O00.OooO0OO("YLFirebaseMessagingService", "onDestroy");
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(@NotNull RemoteMessage message) {
        String str;
        Intrinsics.checkNotNullParameter(message, "message");
        super.onMessageReceived(message);
        Object data = message.getData();
        if ((data == null || ((OooOo) data).isEmpty()) || (str = (String) ((OooOo) message.getData()).getOrDefault(this.f24485OooO0Oo, null)) == null) {
            return;
        }
        Oooo000.OooO00o(str, false);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        super.onNewToken(token);
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0OoOo0(token, null), 3, null);
    }
}
