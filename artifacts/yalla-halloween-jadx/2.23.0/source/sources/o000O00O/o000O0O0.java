package o000O00O;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__IndentKt;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPagingDataDiffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagingDataDiffer.kt\nandroidx/paging/PagingDataDiffer$presentNewList$transformedLastAccessedIndex$1\n+ 2 Logger.kt\nandroidx/paging/LoggerKt\n+ 3 LogUtil.kt\nandroidx/paging/internal/LogUtilKt\n*L\n1#1,548:1\n41#2,8:549\n50#2:562\n27#3,5:557\n*S KotlinDebug\n*F\n+ 1 PagingDataDiffer.kt\nandroidx/paging/PagingDataDiffer$presentNewList$transformedLastAccessedIndex$1\n*L\n468#1:549,8\n468#1:562\n469#1:557,5\n*E\n"})
public final class o000O0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ List<androidx.paging.o000000O<Object>> f34523OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.o0Oo0oo<Object> f34524OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f34525OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.o0ooOOo<Object> f34526OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o0ooOOo f34527OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.OooOOO f34528OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ int f34529OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ int f34530OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.OooOOO f34531OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0O0(androidx.paging.o0Oo0oo<Object> o0oo0oo2, androidx.paging.o0ooOOo<Object> o0ooooo, Ref.BooleanRef booleanRef, o0ooOOo o0ooooo2, androidx.paging.OooOOO oooOOO, List<androidx.paging.o000000O<Object>> list, int i, int i2, androidx.paging.OooOOO oooOOO2) {
        super(0);
        this.f34524OooO0Oo = o0oo0oo2;
        this.f34526OooO0o0 = o0ooooo;
        this.f34525OooO0o = booleanRef;
        this.f34527OooO0oO = o0ooooo2;
        this.f34528OooO0oo = oooOOO;
        this.f34523OooO = list;
        this.f34529OooOO0 = i;
        this.f34530OooOO0O = i2;
        this.f34531OooOO0o = oooOOO2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<T> list;
        List<T> list2;
        androidx.paging.o0Oo0oo<Object> o0oo0oo2 = this.f34524OooO0Oo;
        o0oo0oo2.f7376OooO0o0 = this.f34526OooO0o0;
        this.f34525OooO0o.element = true;
        o0ooOOo o0ooooo = this.f34527OooO0oO;
        o0oo0oo2.f7373OooO0OO = o0ooooo;
        o0OO00O o0oo00o2 = oo0o0Oo.f34666OooO00o;
        if (o0oo00o2 != null && o0oo00o2.OooO0O0(3)) {
            StringBuilder sb = new StringBuilder("Presenting data:\n                            |   first item: ");
            List<androidx.paging.o000000O<Object>> list3 = this.f34523OooO;
            androidx.paging.o000000O o000000o2 = (androidx.paging.o000000O) CollectionsKt.firstOrNull((List) list3);
            Object objLastOrNull = null;
            sb.append((o000000o2 == null || (list2 = o000000o2.f7284OooO0O0) == 0) ? null : CollectionsKt.firstOrNull((List) list2));
            sb.append("\n                            |   last item: ");
            androidx.paging.o000000O o000000o3 = (androidx.paging.o000000O) CollectionsKt.lastOrNull((List) list3);
            if (o000000o3 != null && (list = o000000o3.f7284OooO0O0) != 0) {
                objLastOrNull = CollectionsKt.lastOrNull((List<? extends Object>) list);
            }
            sb.append(objLastOrNull);
            sb.append("\n                            |   placeholdersBefore: ");
            sb.append(this.f34529OooOO0);
            sb.append("\n                            |   placeholdersAfter: ");
            sb.append(this.f34530OooOO0O);
            sb.append("\n                            |   hintReceiver: ");
            sb.append(o0ooooo);
            sb.append("\n                            |   sourceLoadStates: ");
            sb.append(this.f34531OooOO0o);
            sb.append("\n                        ");
            String string = sb.toString();
            androidx.paging.OooOOO oooOOO = this.f34528OooO0oo;
            if (oooOOO != null) {
                string = string + "|   mediatorLoadStates: " + oooOOO + '\n';
            }
            o0oo00o2.OooO00o(3, StringsKt__IndentKt.trimMargin$default(string + "|)", null, 1, null));
        }
        return Unit.INSTANCE;
    }
}
