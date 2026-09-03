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
import org.jetbrains.annotations.NotNull;
import p491o0o00O00.OooO0OO;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class MusicState {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final MusicState f21402OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<MusicTable> f21403OooO0O0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<State> f21404OooO0OO = new MutableLiveData<>(State.Stop);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final Lazy f21405OooO0Oo = LazyKt.lazy(OooO00o.f21407Oooo0o);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<LoopMode> f21406OooO0o0 = new MutableLiveData<>(LoopMode.LoopAll);

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/data/manager/MusicState$LoopMode;", "", "LoopSingle", "LoopAll", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
    public enum LoopMode {
        LoopSingle,
        LoopAll
    }

    public static final class OooO00o extends Lambda implements Function0<LiveData<List<MusicTable>>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f21407Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LiveData<List<MusicTable>> invoke() {
            LiveData<List<MusicTable>> liveDataOooO00o = OooO0OO.OooO00o().OooOoO().OooO00o(String.valueOf(OooOOO.f41216OooO00o.OooOo().getValue()));
            Intrinsics.checkNotNullExpressionValue(liveDataOooO00o, "DB.musicTableDao().loadA….userId.value.toString())");
            return liveDataOooO00o;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/data/manager/MusicState$State;", "", "Playing", "Stop", "Pause", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
    public enum State {
        Playing,
        Stop,
        Pause
    }

    @NotNull
    public static final LiveData OooO00o() {
        return (LiveData) f21405OooO0Oo.getValue();
    }
}
