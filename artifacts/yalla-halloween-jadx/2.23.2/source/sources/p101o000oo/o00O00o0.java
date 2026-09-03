package p101o000oo;

import androidx.paging.OooOOO;
import androidx.paging.o000000O;
import androidx.paging.o0Oo0oo;
import androidx.paging.o0ooOOo;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__IndentKt;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPagingDataDiffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagingDataDiffer.kt\nandroidx/paging/PagingDataDiffer$presentNewList$transformedLastAccessedIndex$1\n+ 2 Logger.kt\nandroidx/paging/LoggerKt\n+ 3 LogUtil.kt\nandroidx/paging/internal/LogUtilKt\n*L\n1#1,548:1\n41#2,8:549\n50#2:562\n27#3,5:557\n*S KotlinDebug\n*F\n+ 1 PagingDataDiffer.kt\nandroidx/paging/PagingDataDiffer$presentNewList$transformedLastAccessedIndex$1\n*L\n468#1:549,8\n468#1:562\n469#1:557,5\n*E\n"})
public final class o00O00o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ List<o000000O<Object>> f35527OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo<Object> f35528OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f35529OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0ooOOo<Object> f35530OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o0000 f35531OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ OooOOO f35532OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ int f35533OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ int f35534OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ OooOOO f35535OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00o0(o0Oo0oo<Object> o0oo0oo2, o0ooOOo<Object> o0ooooo, Ref.BooleanRef booleanRef, o0000 o0000Var, OooOOO oooOOO, List<o000000O<Object>> list, int i, int i2, OooOOO oooOOO2) {
        super(0);
        this.f35528OooO0Oo = o0oo0oo2;
        this.f35530OooO0o0 = o0ooooo;
        this.f35529OooO0o = booleanRef;
        this.f35531OooO0oO = o0000Var;
        this.f35532OooO0oo = oooOOO;
        this.f35527OooO = list;
        this.f35533OooOO0 = i;
        this.f35534OooOO0O = i2;
        this.f35535OooOO0o = oooOOO2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<T> list;
        List<T> list2;
        o0Oo0oo<Object> o0oo0oo2 = this.f35528OooO0Oo;
        o0oo0oo2.f10470OooO0o0 = this.f35530OooO0o0;
        this.f35529OooO0o.element = true;
        o0000 o0000Var = this.f35531OooO0oO;
        o0oo0oo2.f10467OooO0OO = o0000Var;
        o0000O0 o0000o1 = o0000O0O.f35428OooO00o;
        if (o0000o1 != null && o0000o1.OooO0O0(3)) {
            StringBuilder sb = new StringBuilder("Presenting data:\n                            |   first item: ");
            List<o000000O<Object>> list3 = this.f35527OooO;
            o000000O o000000o2 = (o000000O) CollectionsKt.firstOrNull((List) list3);
            Object objLastOrNull = null;
            sb.append((o000000o2 == null || (list2 = o000000o2.f10378OooO0O0) == 0) ? null : CollectionsKt.firstOrNull((List) list2));
            sb.append("\n                            |   last item: ");
            o000000O o000000o3 = (o000000O) CollectionsKt.lastOrNull((List) list3);
            if (o000000o3 != null && (list = o000000o3.f10378OooO0O0) != 0) {
                objLastOrNull = CollectionsKt.lastOrNull((List<? extends Object>) list);
            }
            sb.append(objLastOrNull);
            sb.append("\n                            |   placeholdersBefore: ");
            sb.append(this.f35533OooOO0);
            sb.append("\n                            |   placeholdersAfter: ");
            sb.append(this.f35534OooOO0O);
            sb.append("\n                            |   hintReceiver: ");
            sb.append(o0000Var);
            sb.append("\n                            |   sourceLoadStates: ");
            sb.append(this.f35535OooOO0o);
            sb.append("\n                        ");
            String string = sb.toString();
            OooOOO oooOOO = this.f35532OooO0oo;
            if (oooOOO != null) {
                string = string + "|   mediatorLoadStates: " + oooOOO + '\n';
            }
            o0000o1.OooO00o(3, StringsKt__IndentKt.trimMargin$default(string + "|)", null, 1, null));
        }
        return Unit.INSTANCE;
    }
}
