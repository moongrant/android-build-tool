package p414o0Oo0oO;

import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.o0000O0O;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO0OOo0o extends p477o0o00.OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f46399OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final Long f46400OooO0OO;

    @SourceDebugExtension({"SMAP\nGuideSpTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuideSpTable.kt\ncom/yalla/yalla/data/sp/table/GuideSpTable$isPayEmojiHasReadLiveData$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,245:1\n7#2,8:246\n*S KotlinDebug\n*F\n+ 1 GuideSpTable.kt\ncom/yalla/yalla/data/sp/table/GuideSpTable$isPayEmojiHasReadLiveData$2\n*L\n200#1:246,8\n*E\n"})
    public static final class OooO00o extends Lambda implements Function0<MutableLiveData<Boolean>> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            oO0OOo0o oo0ooo0o = oO0OOo0o.this;
            oo0ooo0o.getClass();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.valueOf(oo0ooo0o.OooO0O0("isPayEmojiHasRead" + o0O00oO0.OooOOo0().getValue(), false)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new OooO0O0(new oO000OOo(oo0ooo0o)));
            } else {
                new Handler(Looper.getMainLooper()).post(new ooOOOOoo(mutableLiveData, oo0ooo0o));
            }
            return mutableLiveData;
        }
    }

    public static final class OooO0O0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f46402OooO0Oo;

        public OooO0O0(oO000OOo function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f46402OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f46402OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f46402OooO0Oo;
        }

        public final int hashCode() {
            return this.f46402OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f46402OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oO0OOo0o() {
        super("guide_table");
        this.f46399OooO0O0 = LazyKt.lazy(new OooO00o());
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        this.f46400OooO0OO = (Long) o0O00oO0.OooOOo0().getValue();
    }

    public final boolean OooOO0O() {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        return OooO0O0("hideEventManager" + o0O00oO0.OooOOo0().getValue(), false);
    }

    public final boolean OooOO0o() {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        return OooO0O0("roomSettingActionRecord" + o0O00oO0.OooOOo0().getValue(), true);
    }

    public final void OooOOO(boolean z) {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o0000O0O.OooO0O0("related", o0O00oO0.OooOOo0().getValue(), this, z);
    }

    public final void OooOOO0() {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o0000O0O.OooO0O0("hideEventManager", o0O00oO0.OooOOo0().getValue(), this, true);
    }

    public final void OooOOOO() {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o0000O0O.OooO0O0("showRoomApplyMicGuideForManager", o0O00oO0.OooOOo0().getValue(), this, false);
    }

    public final void OooOOOo() {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o0000O0O.OooO0O0("showRoomApplyMicGuideForMember", o0O00oO0.OooOOo0().getValue(), this, false);
    }

    public final void OooOOo0() {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o0000O0O.OooO0O0("showRoomSettingChangeGuide", o0O00oO0.OooOOo0().getValue(), this, false);
    }
}
