package p409o0Oo0o0o;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.google.firebase.messaging.o0OO00O;
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
import p464o0Oooo.o000000O;
import p480o0o000Oo.o00oO0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0O0O00 extends o00oO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f45219OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final Long f45220OooO0OO;

    @SourceDebugExtension({"SMAP\nGuideSpTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuideSpTable.kt\ncom/yalla/yalla/data/sp/table/GuideSpTable$isPayEmojiHasReadLiveData$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,245:1\n7#2,8:246\n*S KotlinDebug\n*F\n+ 1 GuideSpTable.kt\ncom/yalla/yalla/data/sp/table/GuideSpTable$isPayEmojiHasReadLiveData$2\n*L\n200#1:246,8\n*E\n"})
    public static final class OooO00o extends Lambda implements Function0<MutableLiveData<Boolean>> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            o0O0O00 o0o0o00 = o0O0O00.this;
            o0o0o00.getClass();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.valueOf(o0o0o00.OooO0O0("isPayEmojiHasRead" + o000000O.OooOOo0().getValue(), false)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new OooO0O0(new o0OO00O(o0o0o00)));
            } else {
                new Handler(Looper.getMainLooper()).post(new oo0o0Oo(mutableLiveData, o0o0o00));
            }
            return mutableLiveData;
        }
    }

    public static final class OooO0O0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f45222OooO0Oo;

        public OooO0O0(o0OO00O function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f45222OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f45222OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f45222OooO0Oo;
        }

        public final int hashCode() {
            return this.f45222OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f45222OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o0O0O00() {
        super("guide_table");
        this.f45219OooO0O0 = LazyKt.lazy(new OooO00o());
        o000000O o000000o2 = o000000O.f46674OooO00o;
        this.f45220OooO0OO = (Long) o000000O.OooOOo0().getValue();
    }

    public final boolean OooOO0O() {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        return OooO0O0("hideEventManager" + o000000O.OooOOo0().getValue(), false);
    }

    public final boolean OooOO0o() {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        return OooO0O0("roomSettingActionRecord" + o000000O.OooOOo0().getValue(), true);
    }

    public final void OooOOO(boolean z) {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o0OO00O.OooO00o("related", o000000O.OooOOo0().getValue(), this, z);
    }

    public final void OooOOO0() {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o0OO00O.OooO00o("hideEventManager", o000000O.OooOOo0().getValue(), this, true);
    }

    public final void OooOOOO() {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o0OO00O.OooO00o("showRoomApplyMicGuideForManager", o000000O.OooOOo0().getValue(), this, false);
    }

    public final void OooOOOo() {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o0OO00O.OooO00o("showRoomApplyMicGuideForMember", o000000O.OooOOo0().getValue(), this, false);
    }

    public final void OooOOo0() {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o0OO00O.OooO00o("showRoomSettingChangeGuide", o000000O.OooOOo0().getValue(), this, false);
    }
}
