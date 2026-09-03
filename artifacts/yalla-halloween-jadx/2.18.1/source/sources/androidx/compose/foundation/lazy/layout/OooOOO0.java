package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p043OooooO0.o000OOo0;
import p043OooooO0.o00O0000;
import p045OooooOo.o00O0O00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00O0O00 f5801OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Function0<OooOOO> f5802OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Map<Object, OooO00o> f5803OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public o0000O0O.OooO f5804OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f5805OooO0o0;

    public final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Object f5806OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final Object f5807OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final ParcelableSnapshotMutableState f5808OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public Function2<? super oOO00O, ? super Integer, Unit> f5809OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ OooOOO0 f5810OooO0o0;

        public OooO00o(OooOOO0 oooOOO0, @NotNull int i, @Nullable Object key, Object obj) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f5810OooO0o0 = oooOOO0;
            this.f5806OooO00o = key;
            this.f5807OooO0O0 = obj;
            this.f5808OooO0OO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Integer.valueOf(i));
        }

        @NotNull
        public final Function2<oOO00O, Integer, Unit> OooO00o() {
            Function2 function2 = this.f5809OooO0Oo;
            if (function2 != null) {
                return function2;
            }
            o000OOo0 o000ooo0OooO0O0 = o00O0000.OooO0O0(1403994769, true, new OooOO0O(this.f5810OooO0o0, this));
            this.f5809OooO0Oo = o000ooo0OooO0O0;
            return o000ooo0OooO0O0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OooOOO0(@NotNull o00O0O00 saveableStateHolder, @NotNull Function0<? extends OooOOO> itemProvider) {
        Intrinsics.checkNotNullParameter(saveableStateHolder, "saveableStateHolder");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        this.f5801OooO00o = saveableStateHolder;
        this.f5802OooO0O0 = itemProvider;
        this.f5803OooO0OO = new LinkedHashMap();
        this.f5804OooO0Oo = new o0000O0O.OooOO0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f5805OooO0o0 = o0000O0O.OooO0OO.OooO0O0(0, 0, 15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Object, androidx.compose.foundation.lazy.layout.OooOOO0$OooO00o>] */
    @NotNull
    public final Function2<oOO00O, Integer, Unit> OooO00o(int i, @NotNull Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        OooO00o oooO00o = (OooO00o) this.f5803OooO0OO.get(key);
        Object objOooO0O0 = this.f5802OooO0O0.invoke().OooO0O0(i);
        if (oooO00o != null && ((Number) oooO00o.f5808OooO0OO.getValue()).intValue() == i && Intrinsics.areEqual(oooO00o.f5807OooO0O0, objOooO0O0)) {
            return oooO00o.OooO00o();
        }
        OooO00o oooO00o2 = new OooO00o(this, i, key, objOooO0O0);
        this.f5803OooO0OO.put(key, oooO00o2);
        return oooO00o2.OooO00o();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Object, androidx.compose.foundation.lazy.layout.OooOOO0$OooO00o>] */
    @Nullable
    public final Object OooO0O0(@Nullable Object obj) {
        OooO00o oooO00o = (OooO00o) this.f5803OooO0OO.get(obj);
        if (oooO00o != null) {
            return oooO00o.f5807OooO0O0;
        }
        OooOOO oooOOOInvoke = this.f5802OooO0O0.invoke();
        Integer num = oooOOOInvoke.OooO0o().get(obj);
        if (num != null) {
            return oooOOOInvoke.OooO0O0(num.intValue());
        }
        return null;
    }
}
