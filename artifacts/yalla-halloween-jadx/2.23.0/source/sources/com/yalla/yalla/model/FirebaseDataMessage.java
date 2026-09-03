package com.yalla.yalla.model;

import androidx.compose.compiler.plugins.kotlin.lower.OooO0OO;
import androidx.compose.material.OooO00o;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p069o0000ooO.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/model/FirebaseDataMessage;", "", "type", "", "source", "", "message_id", "info", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getInfo", "()Ljava/lang/String;", "getMessage_id", "getSource", "getType", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FirebaseDataMessage {
    public static final int $stable = 0;

    @NotNull
    private final String info;

    @NotNull
    private final String message_id;

    @NotNull
    private final String source;
    private final int type;

    public FirebaseDataMessage(int i, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        OooO0OO.OooO00o(str, "source", str2, "message_id", str3, "info");
        this.type = i;
        this.source = str;
        this.message_id = str2;
        this.info = str3;
    }

    public static /* synthetic */ FirebaseDataMessage copy$default(FirebaseDataMessage firebaseDataMessage, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = firebaseDataMessage.type;
        }
        if ((i2 & 2) != 0) {
            str = firebaseDataMessage.source;
        }
        if ((i2 & 4) != 0) {
            str2 = firebaseDataMessage.message_id;
        }
        if ((i2 & 8) != 0) {
            str3 = firebaseDataMessage.info;
        }
        return firebaseDataMessage.copy(i, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage_id() {
        return this.message_id;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    @NotNull
    public final FirebaseDataMessage copy(int type, @NotNull String source, @NotNull String message_id, @NotNull String info) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(message_id, "message_id");
        Intrinsics.checkNotNullParameter(info, "info");
        return new FirebaseDataMessage(type, source, message_id, info);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FirebaseDataMessage)) {
            return false;
        }
        FirebaseDataMessage firebaseDataMessage = (FirebaseDataMessage) other;
        return this.type == firebaseDataMessage.type && Intrinsics.areEqual(this.source, firebaseDataMessage.source) && Intrinsics.areEqual(this.message_id, firebaseDataMessage.message_id) && Intrinsics.areEqual(this.info, firebaseDataMessage.info);
    }

    @NotNull
    public final String getInfo() {
        return this.info;
    }

    @NotNull
    public final String getMessage_id() {
        return this.message_id;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return this.info.hashCode() + o0OO00O.OooO00o(this.message_id, o0OO00O.OooO00o(this.source, this.type * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        int i = this.type;
        String str = this.source;
        String str2 = this.message_id;
        String str3 = this.info;
        StringBuilder sb = new StringBuilder("FirebaseDataMessage(type=");
        sb.append(i);
        sb.append(", source=");
        sb.append(str);
        sb.append(", message_id=");
        return OooO00o.OooO0O0(sb, str2, ", info=", str3, ")");
    }
}
