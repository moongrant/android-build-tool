package com.google.firebase.messaging.ktx;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.OooO0O0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import p314o0O0oOo0.o000O0Oo;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/firebase/messaging/ktx/FirebaseMessagingKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "com.google.firebase-firebase-messaging-ktx"}, k = 1, mv = {1, 7, 1})
public final class FirebaseMessagingKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public final List<OooO0O0<?>> getComponents() {
        return CollectionsKt.listOf(o000O0Oo.OooO00o("fire-fcm-ktx", "23.1.2"));
    }
}
