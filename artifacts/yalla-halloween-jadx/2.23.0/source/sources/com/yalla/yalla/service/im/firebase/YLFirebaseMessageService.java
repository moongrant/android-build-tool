package com.yalla.yalla.service.im.firebase;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import p188o00o0O.Oooo000;
import p473o0OooooO.o0O0O0Oo;
import p473o0OooooO.o0O0OOO0;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/service/im/firebase/YLFirebaseMessageService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public class YLFirebaseMessageService extends FirebaseMessagingService {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String f24947OooO0Oo = "extra";

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        OooOOO0.OooO0OO("YLFirebaseMessagingService", "onCreate");
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onDeletedMessages() {
        super.onDeletedMessages();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        OooOOO0.OooO0OO("YLFirebaseMessagingService", "onDestroy");
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(@NotNull RemoteMessage message) {
        String str;
        Intrinsics.checkNotNullParameter(message, "message");
        super.onMessageReceived(message);
        Object data = message.getData();
        if ((data == null || ((Oooo000) data).isEmpty()) || (str = (String) ((Oooo000) message.getData()).getOrDefault(this.f24947OooO0Oo, null)) == null) {
            return;
        }
        o0O0O0Oo.OooO00o(str, false);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        super.onNewToken(token);
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0O0OOO0(token, null), 3, null);
    }
}
