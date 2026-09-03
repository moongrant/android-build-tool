package com.yallatech.support.platform.callback;

import android.content.Intent;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class YCSDKCallbackManagerImpl implements YCSDKCallbackManager {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO0O0 f26324OooO0O0 = new OooO0O0();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Map<Integer, OooO00o> f26325OooO0OO = new HashMap();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Map<Integer, OooO00o> f26326OooO00o = new HashMap();

    public interface OooO00o {
        void OooO00o(int i, @Nullable Intent intent);
    }

    public static final class OooO0O0 {
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yallatech/support/platform/callback/YCSDKCallbackManagerImpl$RequestCodeOffset;", "", "", "offset", "I", "Login", "Share", "GroupCreate", "GroupJoin", "Conversation", "lib_release"}, k = 1, mv = {1, 5, 1})
    public enum RequestCodeOffset {
        Login(0),
        Share(1),
        GroupCreate(2),
        GroupJoin(3),
        Conversation(4);

        private final int offset;

        RequestCodeOffset(int i) {
            this.offset = i;
        }

        public final int OooO00o() {
            return this.offset + 26214;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.yallatech.support.platform.callback.YCSDKCallbackManagerImpl$OooO00o>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.yallatech.support.platform.callback.YCSDKCallbackManagerImpl$OooO00o>] */
    @Override // com.yallatech.support.platform.callback.YCSDKCallbackManager
    public final boolean onActivityResult(int i, int i2, @Nullable Intent intent) {
        OooO00o oooO00o;
        OooO00o oooO00o2 = (OooO00o) this.f26326OooO00o.get(Integer.valueOf(i));
        if (oooO00o2 != null) {
            oooO00o2.OooO00o(i2, intent);
            return true;
        }
        synchronized (f26324OooO0O0) {
            oooO00o = (OooO00o) f26325OooO0OO.get(Integer.valueOf(i));
        }
        if (oooO00o == null) {
            return false;
        }
        oooO00o.OooO00o(i2, intent);
        return true;
    }
}
