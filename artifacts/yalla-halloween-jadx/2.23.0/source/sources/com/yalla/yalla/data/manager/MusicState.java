package com.yalla.yalla.data.manager;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.data.db.model.MusicTable;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000O0O0.o0O0O00;
import org.jetbrains.annotations.NotNull;
import p403o0Oo0OOo.oO0000O;
import p464o0Oooo.o000000O;
import p581o0oOoo00.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class MusicState {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<MusicTable> f22835OooO00o = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<State> f22836OooO0O0 = new MutableLiveData<>(State.Stop);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Lazy f22837OooO0OO = LazyKt.lazy(OooO00o.f22839OooO0Oo);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<LoopMode> f22838OooO0Oo = new MutableLiveData<>(LoopMode.LoopAll);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/data/manager/MusicState$LoopMode;", "", "LoopSingle", "LoopAll", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
    public enum LoopMode {
        LoopSingle,
        LoopAll
    }

    public static final class OooO00o extends Lambda implements Function0<LiveData<List<MusicTable>>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f22839OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LiveData<List<MusicTable>> invoke() {
            oO0000O oo0000oOooOo = o000OOo.OooO00o().OooOo();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            o0O0O00 o0o0o00OooO00o = oo0000oOooOo.OooO00o(String.valueOf(o000000O.OooOOo0().getValue()));
            Intrinsics.checkNotNullExpressionValue(o0o0o00OooO00o, "DB.musicTableDao().loadA…(userId.value.toString())");
            return o0o0o00OooO00o;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/data/manager/MusicState$State;", "", "Playing", "Stop", "Pause", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
    public enum State {
        Playing,
        Stop,
        Pause
    }

    @NotNull
    public static LiveData OooO00o() {
        return (LiveData) f22837OooO0OO.getValue();
    }
}
