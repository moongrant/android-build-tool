package com.yalla.yalla.data.manager;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.data.db.model.MusicTable;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p110o000ooo0.o000O000;
import p407o0Oo0Oo.oo00oO;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class MusicState {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<MusicTable> f22362OooO00o = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<State> f22363OooO0O0 = new MutableLiveData<>(State.Stop);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Lazy f22364OooO0OO = LazyKt.lazy(OooO00o.f22366OooO0Oo);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<LoopMode> f22365OooO0Oo = new MutableLiveData<>(LoopMode.LoopAll);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v2 com.yalla.yalla.data.manager.MusicState$LoopMode[], still in use, count: 1, list:
      (r3v2 com.yalla.yalla.data.manager.MusicState$LoopMode[]) from 0x001d: INVOKE (r3v2 com.yalla.yalla.data.manager.MusicState$LoopMode[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:30)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/data/manager/MusicState$LoopMode;", "", "LoopSingle", "LoopAll", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
    public static final class LoopMode {
        LoopSingle,
        LoopAll;

        private static final /* synthetic */ EnumEntries $ENTRIES;

        static {
            $ENTRIES = EnumEntriesKt.enumEntries(loopModeArr);
        }

        public LoopMode() {
            super(str, i);
        }

        public static LoopMode valueOf(String str) {
            return (LoopMode) Enum.valueOf(LoopMode.class, str);
        }

        public static LoopMode[] values() {
            return (LoopMode[]) $VALUES.clone();
        }
    }

    public static final class OooO00o extends Lambda implements Function0<LiveData<List<MusicTable>>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f22366OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LiveData<List<MusicTable>> invoke() {
            oo00oO oo00ooOooOoO0 = o00Oo0.OooO00o().OooOoO0();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            o000O000 o000o000OooO00o = oo00ooOooOoO0.OooO00o(String.valueOf(o0O00oO0.OooOOo0().getValue()));
            Intrinsics.checkNotNullExpressionValue(o000o000OooO00o, "loadAll(...)");
            return o000o000OooO00o;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 com.yalla.yalla.data.manager.MusicState$State[], still in use, count: 1, list:
      (r5v2 com.yalla.yalla.data.manager.MusicState$State[]) from 0x0029: INVOKE (r5v2 com.yalla.yalla.data.manager.MusicState$State[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:42)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/data/manager/MusicState$State;", "", "Playing", "Stop", "Pause", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
    public static final class State {
        Playing,
        Stop,
        Pause;

        private static final /* synthetic */ EnumEntries $ENTRIES;

        static {
            $ENTRIES = EnumEntriesKt.enumEntries(stateArr);
        }

        public State() {
            super(str, i);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    @NotNull
    public static LiveData OooO00o() {
        return (LiveData) f22364OooO0OO.getValue();
    }
}
