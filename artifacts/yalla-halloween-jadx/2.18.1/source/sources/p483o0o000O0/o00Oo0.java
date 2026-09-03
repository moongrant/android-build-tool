package p483o0o000O0;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import java.io.File;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p168o00Ooo0.OooOOOO;
import p252o00ooO0.o000000O;
import p267o00ooo0o.o00OO000;
import p267o00ooo0o.o00OO00O;
import p269o00oooOO.z;
import p271o00oooo.o0O0oo0o;
import p272o00oooo0.o0O0o000;
import p272o00oooo0.o0O0o00O;
import p487o0o000oO.o0OOO0o;
import p487o0o000oO.o0Oo0oo;
import p494o0o00OO0.OooO0o;
import p515o0o0O00.o00O00;
import p516o0o0O000.o0OoOo0;
import p640o0ooO0oO.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00Oo0 extends o000000O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Context f40877OooO0OO;

    public static final class OooO00o implements o0O0o00O {
        @Override // p272o00oooo0.o0O0o00O
        public final void OooO00o(int i, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, o000O0O0.OooO00o(-5986356272656L));
            Intrinsics.checkNotNullParameter(str2, o000O0O0.OooO00o(-6003536141840L));
            if (i == 3) {
                o00O00.OooO0OO(str, str2);
            } else if (i == 4) {
                o00O00.OooO0oo(str, str2);
            } else {
                if (i != 6) {
                    return;
                }
                o00O00.OooO0o0(str, str2);
            }
        }
    }

    static {
        o000O0O0.OooO00o(-8138134887952L);
        o000O0O0.OooO00o(-8520386977296L);
        o000O0O0.OooO00o(-8765200113168L);
        o000O0O0.OooO00o(-9010013249040L);
        o000O0O0.OooO00o(-9254826384912L);
        o000O0O0.OooO00o(-9499639520784L);
        o000O0O0.OooO00o(-9744452656656L);
    }

    public o00Oo0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, o000O0O0.OooO00o(-6037895880208L));
        this.f40877OooO0OO = context;
    }

    @Override // p252o00ooO0.o000000O
    @Nullable
    public final List<Class<? extends o000000O>> OooO00o() {
        return CollectionsKt.listOf(OooOO0.class);
    }

    @Override // p252o00ooO0.o000000O
    public final void OooO0OO() {
        try {
            Result.Companion companion = Result.INSTANCE;
            String key = OooOOOO.OooO0O0(o0OoOo0.OooO0O0(), o000O0O0.OooO00o(-6308478819856L)) + o000O0O0.OooO00o(-6690730909200L);
            Intrinsics.checkNotNullParameter(key, "key");
            o0O0oo0o o0o0oo0o = o0O0oo0o.f34965OooO00o;
            Intrinsics.checkNotNullParameter(key, "<set-?>");
            o0O0oo0o.f34966OooO0O0 = key;
            Context context = this.f40877OooO0OO;
            String strOooO00o = o000O0O0.OooO00o(-6072255618576L);
            String strOooO00o2 = o000O0O0.OooO00o(-6098025422352L);
            StringBuilder sb = new StringBuilder();
            o0OOO0o o0ooo0o2 = o0OOO0o.f40936OooO00o;
            sb.append(o0OOO0o.OooO00o());
            sb.append(o000O0O0.OooO00o(-6123795226128L));
            String string = sb.toString();
            o0Oo0oo o0oo0oo2 = o0Oo0oo.f40947OooO00o;
            String strOooO00o3 = o0Oo0oo.OooO00o();
            OooO0o oooO0o = OooO0o.f41155OooO00o;
            String path = ((File) OooO0o.f41161OooO0oO.getValue()).getPath();
            Intrinsics.checkNotNullExpressionValue(path, o000O0O0.OooO00o(-6128090193424L));
            o00OO000 configSailfish = new o00OO000(context, strOooO00o, strOooO00o2, string, strOooO00o3, path, o000O0O0.OooO00o(-6239759343120L), !o0OOO0o.OooO0Oo());
            Intrinsics.checkNotNullParameter("7c4fe34774f7db2209aa0df40339c446cc071ec8f9df36eb3691c254d58e359fb12c16571b97f355f786f4a234f3e683180421953aebb9f50147cbf928da7254", "<set-?>");
            configSailfish.f34918OooOO0O = "7c4fe34774f7db2209aa0df40339c446cc071ec8f9df36eb3691c254d58e359fb12c16571b97f355f786f4a234f3e683180421953aebb9f50147cbf928da7254";
            Intrinsics.checkNotNullParameter(configSailfish, "configSailfish");
            o00OO00O.f34920OooO0O0 = new z(configSailfish);
            Result.m502constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m502constructorimpl(ResultKt.createFailure(th));
        }
        if (o0OOO0o.OooO0OO()) {
            return;
        }
        o0O0o000.f34971OooO0Oo = true;
        String tag = o000O0O0.OooO00o(-6265529146896L);
        OooO00o logger = new OooO00o();
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(logger, "logger");
        o0O0o000.f34970OooO0OO = tag;
        o0O0o000.f34969OooO0O0 = logger;
    }
}
