package p605o0oo00oo;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.app.base.model.RoomIndexFollowingModel;
import com.yalla.yalla.common.model.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p153o00Oo0oO.o0ooOOo;
import p160o00OoOO0.o00OO0O0;
import p495o0o00OOO.Oooo0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class oO000Oo0 extends ViewModel {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f48289OooO00o = 15;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f48290OooO0O0 = LazyKt.lazy(OooO0O0.f48293Oooo0o);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f48291OooO0OO;

    public static final class OooO00o extends o00OO0O0.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Oooo0<List<RoomIndexFollowingModel>> f48292OooO00o;

        public OooO00o(Oooo0<List<RoomIndexFollowingModel>> oooo0) {
            this.f48292OooO00o = oooo0;
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(@NotNull String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f48292OooO00o.postValue((List<RoomIndexFollowingModel>) new Response(true, null, false, null, 14, null));
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Oooo0<String>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f48293Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Oooo0<String> invoke() {
            return new Oooo0<>();
        }
    }

    @NotNull
    public final Oooo0<List<RoomIndexFollowingModel>> OooO0O0(@NotNull ArrayList<String> baridList) {
        Intrinsics.checkNotNullParameter(baridList, "baridList");
        Oooo0<List<RoomIndexFollowingModel>> oooo0 = new Oooo0<>();
        StringBuilder sb = new StringBuilder();
        for (String str : baridList) {
            sb.append(",");
            sb.append(str);
        }
        if (sb.length() > 1) {
            String strSubstring = sb.substring(1, sb.length());
            OooO00o oooO00o = new OooO00o(oooo0);
            Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
            mapOooO0O0.put("barids", strSubstring);
            o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
            o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32248Oooo, mapOooO0O0, oooO00o);
        }
        return oooo0;
    }
}
