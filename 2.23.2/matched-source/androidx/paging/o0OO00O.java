package androidx.paging;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.YieldKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p101o000oo.o000;
import p101o000oo.o0000;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "androidx.paging.PagingDataDiffer$collectFrom$2$1$2", f = "PagingDataDiffer.kt", i = {}, l = {159, 169, 186}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nPagingDataDiffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagingDataDiffer.kt\nandroidx/paging/PagingDataDiffer$collectFrom$2$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,548:1\n1726#2,3:549\n1855#2,2:552\n*S KotlinDebug\n*F\n+ 1 PagingDataDiffer.kt\nandroidx/paging/PagingDataDiffer$collectFrom$2$1$2\n*L\n219#1:549,3\n249#1:552,2\n*E\n"})
public final class o0OO00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f10454OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo<Object> f10455OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Oooo000<Object> f10456OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o<Object> f10457OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00O(Oooo000<Object> oooo000, o0Oo0oo<Object> o0oo0oo2, o0OOO0o<Object> o0ooo0o2, Continuation<? super o0OO00O> continuation) {
        super(2, continuation);
        this.f10456OooO0o0 = oooo000;
        this.f10455OooO0o = o0oo0oo2;
        this.f10457OooO0oO = o0ooo0o2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0OO00O(this.f10456OooO0o0, this.f10455OooO0o, this.f10457OooO0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0OO00O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:101:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:109:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:112:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:120:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:121:0x02db  */
    /* JADX WARN: Code duplicated, block: B:123:0x02e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x02e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:127:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:131:0x0301  */
    /* JADX WARN: Code duplicated, block: B:133:0x0304  */
    /* JADX WARN: Code duplicated, block: B:135:0x030a  */
    /* JADX WARN: Code duplicated, block: B:136:0x0316  */
    /* JADX WARN: Code duplicated, block: B:137:0x031b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0350  */
    /* JADX WARN: Code duplicated, block: B:154:0x02d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x02d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:? A[LOOP:1: B:113:0x02bd->B:156:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0059  */
    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    /* JADX WARN: Code duplicated, block: B:24:0x007c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0 A[LOOP:0: B:36:0x00ca->B:38:0x00d0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:47:0x0129  */
    /* JADX WARN: Code duplicated, block: B:48:0x0132 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0134  */
    /* JADX WARN: Code duplicated, block: B:50:0x0141  */
    /* JADX WARN: Code duplicated, block: B:52:0x016a  */
    /* JADX WARN: Code duplicated, block: B:53:0x016e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0170  */
    /* JADX WARN: Code duplicated, block: B:56:0x019c  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:73:0x020e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0212 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0214  */
    /* JADX WARN: Code duplicated, block: B:77:0x021f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0225  */
    /* JADX WARN: Code duplicated, block: B:81:0x022b  */
    /* JADX WARN: Code duplicated, block: B:83:0x023d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0241  */
    /* JADX WARN: Code duplicated, block: B:86:0x0266  */
    /* JADX WARN: Code duplicated, block: B:90:0x0270  */
    /* JADX WARN: Code duplicated, block: B:93:0x027a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0288  */
    /* JADX WARN: Code duplicated, block: B:96:0x028b  */
    /* JADX WARN: Code duplicated, block: B:98:0x028e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        o0Oo0oo<Object> o0oo0oo2;
        List listListOf;
        OooOOO oooOOO;
        boolean z;
        OooOOO oooOOO2;
        o0000 o0000Var;
        o0ooOOo<Object> o0ooooo;
        Oooo000<Object> pageEvent;
        o0Oo0oo.OooO0O0 callback;
        int size;
        LoadType loadType;
        LoadType loadType2;
        int i;
        int i2;
        int i3;
        int i4;
        int size2;
        int iMin;
        int i5;
        int size3;
        int iMax;
        int i6;
        p101o000oo.oo0o0Oo value;
        OooOOO oooOOO3;
        boolean z2;
        Collection collection;
        Iterator it;
        boolean z3;
        boolean z4;
        o0Oo0oo<Object> o0oo0oo3;
        o0000 o0000Var2;
        int i7;
        o0Oo0oo<Object> o0oo0oo4;
        int i8;
        o0ooOOo<Object> o0ooooo2;
        Oooo000.OooO0O0 oooO0O0;
        Iterator it2;
        int size4;
        int size5;
        int i9;
        List<o000000O<Object>> list;
        Collection<? extends o000000O<Object>> collection2;
        int size6;
        int size7;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f10454OooO0Oo;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Oooo000<Object> oooo000 = this.f10456OooO0o0;
            if (oooo000 instanceof Oooo000.OooO0O0) {
                Oooo000.OooO0O0 oooO0O1 = (Oooo000.OooO0O0) oooo000;
                if (oooO0O1.f10286OooO00o == LoadType.REFRESH) {
                    o0Oo0oo<Object> o0oo0oo5 = this.f10455OooO0o;
                    List<o000000O<T>> list2 = oooO0O1.f10287OooO0O0;
                    int i11 = oooO0O1.f10288OooO0OO;
                    int i12 = oooO0O1.f10289OooO0Oo;
                    OooOOO oooOOO4 = oooO0O1.f10291OooO0o0;
                    OooOOO oooOOO5 = oooO0O1.f10290OooO0o;
                    o0000 o0000Var3 = this.f10457OooO0oO.f10462OooO0OO;
                    this.f10454OooO0Oo = 1;
                    if (o0Oo0oo.OooO00o(o0oo0oo5, list2, i11, i12, true, oooOOO4, oooOOO5, o0000Var3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (oooo000 instanceof Oooo000.OooO0o) {
                    o0oo0oo2 = this.f10455OooO0o;
                    listListOf = CollectionsKt.listOf(new o000000O(0, ((Oooo000.OooO0o) this.f10456OooO0o0).f10294OooO00o));
                    Oooo000.OooO0o oooO0o = (Oooo000.OooO0o) this.f10456OooO0o0;
                    oooOOO = oooO0o.f10295OooO0O0;
                    z = oooOOO == null || oooO0o.f10296OooO0OO != null;
                    oooOOO2 = oooO0o.f10296OooO0OO;
                    o0000Var = this.f10457OooO0oO.f10462OooO0OO;
                    this.f10454OooO0Oo = 2;
                    if (o0Oo0oo.OooO00o(o0oo0oo2, listListOf, 0, 0, z, oooOOO, oooOOO2, o0000Var, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (this.f10455OooO0o.OooO0OO()) {
                        this.f10454OooO0Oo = 3;
                        if (YieldKt.yield(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    o0Oo0oo<Object> o0oo0oo6 = this.f10455OooO0o;
                    o0ooooo = o0oo0oo6.f10470OooO0o0;
                    pageEvent = this.f10456OooO0o0;
                    callback = o0oo0oo6.f10474OooOO0O;
                    o0ooooo.getClass();
                    Intrinsics.checkNotNullParameter(pageEvent, "pageEvent");
                    Intrinsics.checkNotNullParameter(callback, "callback");
                    if (pageEvent instanceof Oooo000.OooO0O0) {
                        oooO0O0 = (Oooo000.OooO0O0) pageEvent;
                        it2 = oooO0O0.f10287OooO0O0.iterator();
                        size4 = 0;
                        while (it2.hasNext()) {
                            size4 += ((o000000O) it2.next()).f10378OooO0O0.size();
                        }
                        size5 = o0ooooo.getSize();
                        i9 = o0ooOOo.OooO00o.$EnumSwitchMapping$0[oooO0O0.f10286OooO00o.ordinal()];
                        if (i9 == 1) {
                            throw new IllegalStateException("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
                        }
                        list = o0ooooo.f10503OooO00o;
                        collection2 = oooO0O0.f10287OooO0O0;
                        if (i9 == 2) {
                            int iMin2 = Math.min(o0ooooo.f10505OooO0OO, size4);
                            int i13 = o0ooooo.f10505OooO0OO - iMin2;
                            int i14 = size4 - iMin2;
                            list.addAll(0, collection2);
                            o0ooooo.f10504OooO0O0 += size4;
                            o0ooooo.f10505OooO0OO = oooO0O0.f10288OooO0OO;
                            callback.f10478OooO00o.f10465OooO00o.OooO0OO(i13, iMin2);
                            callback.OooO00o(0, i14);
                            size6 = (o0ooooo.getSize() - size5) - i14;
                            if (size6 > 0) {
                                callback.OooO00o(0, size6);
                            } else if (size6 < 0) {
                                callback.f10478OooO00o.f10465OooO00o.OooO0O0(0, -size6);
                            }
                        } else if (i9 == 3) {
                            int iMin3 = Math.min(o0ooooo.f10506OooO0Oo, size4);
                            int i15 = o0ooooo.f10505OooO0OO + o0ooooo.f10504OooO0O0;
                            int i16 = size4 - iMin3;
                            list.addAll(list.size(), collection2);
                            o0ooooo.f10504OooO0O0 += size4;
                            o0ooooo.f10506OooO0Oo = oooO0O0.f10289OooO0Oo;
                            callback.f10478OooO00o.f10465OooO00o.OooO0OO(i15, iMin3);
                            callback.OooO00o(i15 + iMin3, i16);
                            size7 = (o0ooooo.getSize() - size5) - i16;
                            if (size7 > 0) {
                                callback.OooO00o(o0ooooo.getSize() - size7, size7);
                            } else if (size7 < 0) {
                                callback.f10478OooO00o.f10465OooO00o.OooO0O0(o0ooooo.getSize(), -size7);
                            }
                        }
                        OooOOO sourceLoadStates = oooO0O0.f10291OooO0o0;
                        OooOOO oooOOO6 = oooO0O0.f10290OooO0o;
                        callback.getClass();
                        Intrinsics.checkNotNullParameter(sourceLoadStates, "source");
                        o0Oo0oo<T> o0oo0oo7 = callback.f10478OooO00o;
                        o0oo0oo7.getClass();
                        Intrinsics.checkNotNullParameter(sourceLoadStates, "source");
                        OooOo00 oooOo00 = o0oo0oo7.f10469OooO0o;
                        oooOo00.getClass();
                        Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
                        oooOo00.OooO0OO(new o000(oooOo00, sourceLoadStates, oooOOO6));
                    } else if (pageEvent instanceof Oooo000.OooO00o) {
                        Oooo000.OooO00o oooO00o = (Oooo000.OooO00o) pageEvent;
                        size = o0ooooo.getSize();
                        loadType = oooO00o.f10281OooO00o;
                        loadType2 = LoadType.PREPEND;
                        i = oooO00o.f10283OooO0OO;
                        i2 = oooO00o.f10282OooO0O0;
                        i3 = oooO00o.f10284OooO0Oo;
                        if (loadType == loadType2) {
                            int i17 = o0ooooo.f10505OooO0OO;
                            o0ooooo.f10504OooO0O0 -= o0ooooo.OooO0o(new IntRange(i2, i));
                            o0ooooo.f10505OooO0OO = i3;
                            size3 = o0ooooo.getSize() - size;
                            if (size3 > 0) {
                                callback.OooO00o(0, size3);
                            } else if (size3 < 0) {
                                callback.f10478OooO00o.f10465OooO00o.OooO0O0(0, -size3);
                            }
                            iMax = Math.max(0, i17 + size3);
                            i6 = i3 - iMax;
                            if (i6 > 0) {
                                callback.f10478OooO00o.f10465OooO00o.OooO0OO(iMax, i6);
                            }
                            callback.OooO0O0(loadType2);
                        } else {
                            i4 = o0ooooo.f10506OooO0Oo;
                            o0ooooo.f10504OooO0O0 -= o0ooooo.OooO0o(new IntRange(i2, i));
                            o0ooooo.f10506OooO0Oo = i3;
                            size2 = o0ooooo.getSize() - size;
                            if (size2 > 0) {
                                callback.OooO00o(size, size2);
                            } else if (size2 < 0) {
                                callback.f10478OooO00o.f10465OooO00o.OooO0O0(size + size2, -size2);
                            }
                            if (size2 < 0) {
                                iMin = Math.min(i4, -size2);
                            } else {
                                iMin = 0;
                            }
                            i5 = i3 - (i4 - iMin);
                            if (i5 > 0) {
                                callback.f10478OooO00o.f10465OooO00o.OooO0OO(o0ooooo.getSize() - i3, i5);
                            }
                            callback.OooO0O0(LoadType.APPEND);
                        }
                    } else if (pageEvent instanceof Oooo000.OooO0OO) {
                        Oooo000.OooO0OO oooO0OO = (Oooo000.OooO0OO) pageEvent;
                        OooOOO sourceLoadStates2 = oooO0OO.f10292OooO00o;
                        OooOOO oooOOO7 = oooO0OO.f10293OooO0O0;
                        callback.getClass();
                        Intrinsics.checkNotNullParameter(sourceLoadStates2, "source");
                        o0Oo0oo<T> o0oo0oo8 = callback.f10478OooO00o;
                        o0oo0oo8.getClass();
                        Intrinsics.checkNotNullParameter(sourceLoadStates2, "source");
                        OooOo00 oooOo01 = o0oo0oo8.f10469OooO0o;
                        oooOo01.getClass();
                        Intrinsics.checkNotNullParameter(sourceLoadStates2, "sourceLoadStates");
                        oooOo01.OooO0OO(new o000(oooOo01, sourceLoadStates2, oooOOO7));
                    } else if (pageEvent instanceof Oooo000.OooO0o) {
                        throw new IllegalStateException("Paging received an event to display a static list, while still actively loading\nfrom an existing generation of PagingData. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
                    }
                    if (this.f10456OooO0o0 instanceof Oooo000.OooO00o) {
                        this.f10455OooO0o.f10464OooO = false;
                    }
                    if (this.f10456OooO0o0 instanceof Oooo000.OooO0O0) {
                        value = this.f10455OooO0o.f10469OooO0o.f10268OooO0OO.getValue();
                        if (value != null) {
                            oooOOO3 = value.f35621OooO0Oo;
                        } else {
                            oooOOO3 = null;
                        }
                        if (oooOOO3 == null) {
                            throw new IllegalStateException("PagingDataDiffer.combinedLoadStatesCollection.stateFlow shouldnot hold null CombinedLoadStates after Insert event.".toString());
                        }
                        boolean z5 = oooOOO3.f10255OooO0O0.f10257OooO00o;
                        boolean z6 = oooOOO3.f10256OooO0OO.f10257OooO00o;
                        Oooo000.OooO0O0 oooO0O2 = (Oooo000.OooO0O0) this.f10456OooO0o0;
                        LoadType loadType3 = oooO0O2.f10286OooO00o;
                        if (loadType3 == LoadType.PREPEND) {
                        }
                        collection = oooO0O2.f10287OooO0O0;
                        if (!(collection instanceof Collection)) {
                            it = collection.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z3 = true;
                                    break;
                                }
                                if (!((o000000O) it.next()).f10378OooO0O0.isEmpty()) {
                                    z3 = false;
                                    break;
                                }
                            }
                        } else {
                            it = collection.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z3 = true;
                                    break;
                                }
                                if (!((o000000O) it.next()).f10378OooO0O0.isEmpty()) {
                                    z3 = false;
                                    break;
                                }
                            }
                        }
                        if (!z2) {
                            this.f10455OooO0o.f10464OooO = false;
                        } else if (this.f10455OooO0o.f10464OooO) {
                            if (z3) {
                                z4 = true;
                            } else {
                                i7 = this.f10455OooO0o.f10473OooOO0;
                                o0oo0oo4 = this.f10455OooO0o;
                                if (i7 >= o0oo0oo4.f10470OooO0o0.f10505OooO0OO) {
                                    i8 = o0oo0oo4.f10473OooOO0;
                                    o0ooooo2 = this.f10455OooO0o.f10470OooO0o0;
                                    if (i8 > o0ooooo2.f10505OooO0OO + o0ooooo2.f10504OooO0O0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                } else {
                                    z4 = true;
                                }
                            }
                            if (z4) {
                                o0oo0oo3 = this.f10455OooO0o;
                                o0000Var2 = o0oo0oo3.f10467OooO0OO;
                                if (o0000Var2 != null) {
                                    o0000Var2.OooO00o(o0oo0oo3.f10470OooO0o0.OooO0o0(o0oo0oo3.f10473OooOO0));
                                }
                            } else {
                                this.f10455OooO0o.f10464OooO = false;
                            }
                        } else {
                            if (z3) {
                                i7 = this.f10455OooO0o.f10473OooOO0;
                                o0oo0oo4 = this.f10455OooO0o;
                                if (i7 >= o0oo0oo4.f10470OooO0o0.f10505OooO0OO) {
                                    i8 = o0oo0oo4.f10473OooOO0;
                                    o0ooooo2 = this.f10455OooO0o.f10470OooO0o0;
                                    if (i8 > o0ooooo2.f10505OooO0OO + o0ooooo2.f10504OooO0O0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                } else {
                                    z4 = true;
                                }
                            } else {
                                z4 = true;
                            }
                            if (z4) {
                                o0oo0oo3 = this.f10455OooO0o;
                                o0000Var2 = o0oo0oo3.f10467OooO0OO;
                                if (o0000Var2 != null) {
                                    o0000Var2.OooO00o(o0oo0oo3.f10470OooO0o0.OooO0o0(o0oo0oo3.f10473OooOO0));
                                }
                            } else {
                                this.f10455OooO0o.f10464OooO = false;
                            }
                        }
                    }
                }
            } else if (oooo000 instanceof Oooo000.OooO0o) {
                o0oo0oo2 = this.f10455OooO0o;
                listListOf = CollectionsKt.listOf(new o000000O(0, ((Oooo000.OooO0o) this.f10456OooO0o0).f10294OooO00o));
                Oooo000.OooO0o oooO0o2 = (Oooo000.OooO0o) this.f10456OooO0o0;
                oooOOO = oooO0o2.f10295OooO0O0;
                if (oooOOO == null) {
                }
                oooOOO2 = oooO0o2.f10296OooO0OO;
                o0000Var = this.f10457OooO0oO.f10462OooO0OO;
                this.f10454OooO0Oo = 2;
                if (o0Oo0oo.OooO00o(o0oo0oo2, listListOf, 0, 0, z, oooOOO, oooOOO2, o0000Var, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (this.f10455OooO0o.OooO0OO()) {
                    this.f10454OooO0Oo = 3;
                    if (YieldKt.yield(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                o0Oo0oo<Object> o0oo0oo9 = this.f10455OooO0o;
                o0ooooo = o0oo0oo9.f10470OooO0o0;
                pageEvent = this.f10456OooO0o0;
                callback = o0oo0oo9.f10474OooOO0O;
                o0ooooo.getClass();
                Intrinsics.checkNotNullParameter(pageEvent, "pageEvent");
                Intrinsics.checkNotNullParameter(callback, "callback");
                if (pageEvent instanceof Oooo000.OooO0O0) {
                    oooO0O0 = (Oooo000.OooO0O0) pageEvent;
                    it2 = oooO0O0.f10287OooO0O0.iterator();
                    size4 = 0;
                    while (it2.hasNext()) {
                        size4 += ((o000000O) it2.next()).f10378OooO0O0.size();
                    }
                    size5 = o0ooooo.getSize();
                    i9 = o0ooOOo.OooO00o.$EnumSwitchMapping$0[oooO0O0.f10286OooO00o.ordinal()];
                    if (i9 == 1) {
                        throw new IllegalStateException("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
                    }
                    list = o0ooooo.f10503OooO00o;
                    collection2 = oooO0O0.f10287OooO0O0;
                    if (i9 == 2) {
                        int iMin4 = Math.min(o0ooooo.f10505OooO0OO, size4);
                        int i18 = o0ooooo.f10505OooO0OO - iMin4;
                        int i19 = size4 - iMin4;
                        list.addAll(0, collection2);
                        o0ooooo.f10504OooO0O0 += size4;
                        o0ooooo.f10505OooO0OO = oooO0O0.f10288OooO0OO;
                        callback.f10478OooO00o.f10465OooO00o.OooO0OO(i18, iMin4);
                        callback.OooO00o(0, i19);
                        size6 = (o0ooooo.getSize() - size5) - i19;
                        if (size6 > 0) {
                            callback.OooO00o(0, size6);
                        } else if (size6 < 0) {
                            callback.f10478OooO00o.f10465OooO00o.OooO0O0(0, -size6);
                        }
                    } else if (i9 == 3) {
                        int iMin5 = Math.min(o0ooooo.f10506OooO0Oo, size4);
                        int i110 = o0ooooo.f10505OooO0OO + o0ooooo.f10504OooO0O0;
                        int i111 = size4 - iMin5;
                        list.addAll(list.size(), collection2);
                        o0ooooo.f10504OooO0O0 += size4;
                        o0ooooo.f10506OooO0Oo = oooO0O0.f10289OooO0Oo;
                        callback.f10478OooO00o.f10465OooO00o.OooO0OO(i110, iMin5);
                        callback.OooO00o(i110 + iMin5, i111);
                        size7 = (o0ooooo.getSize() - size5) - i111;
                        if (size7 > 0) {
                            callback.OooO00o(o0ooooo.getSize() - size7, size7);
                        } else if (size7 < 0) {
                            callback.f10478OooO00o.f10465OooO00o.OooO0O0(o0ooooo.getSize(), -size7);
                        }
                    }
                    OooOOO sourceLoadStates3 = oooO0O0.f10291OooO0o0;
                    OooOOO oooOOO8 = oooO0O0.f10290OooO0o;
                    callback.getClass();
                    Intrinsics.checkNotNullParameter(sourceLoadStates3, "source");
                    o0Oo0oo<T> o0oo0oo10 = callback.f10478OooO00o;
                    o0oo0oo10.getClass();
                    Intrinsics.checkNotNullParameter(sourceLoadStates3, "source");
                    OooOo00 oooOo02 = o0oo0oo10.f10469OooO0o;
                    oooOo02.getClass();
                    Intrinsics.checkNotNullParameter(sourceLoadStates3, "sourceLoadStates");
                    oooOo02.OooO0OO(new o000(oooOo02, sourceLoadStates3, oooOOO8));
                } else if (pageEvent instanceof Oooo000.OooO00o) {
                    Oooo000.OooO00o oooO00o2 = (Oooo000.OooO00o) pageEvent;
                    size = o0ooooo.getSize();
                    loadType = oooO00o2.f10281OooO00o;
                    loadType2 = LoadType.PREPEND;
                    i = oooO00o2.f10283OooO0OO;
                    i2 = oooO00o2.f10282OooO0O0;
                    i3 = oooO00o2.f10284OooO0Oo;
                    if (loadType == loadType2) {
                        int i112 = o0ooooo.f10505OooO0OO;
                        o0ooooo.f10504OooO0O0 -= o0ooooo.OooO0o(new IntRange(i2, i));
                        o0ooooo.f10505OooO0OO = i3;
                        size3 = o0ooooo.getSize() - size;
                        if (size3 > 0) {
                            callback.OooO00o(0, size3);
                        } else if (size3 < 0) {
                            callback.f10478OooO00o.f10465OooO00o.OooO0O0(0, -size3);
                        }
                        iMax = Math.max(0, i112 + size3);
                        i6 = i3 - iMax;
                        if (i6 > 0) {
                            callback.f10478OooO00o.f10465OooO00o.OooO0OO(iMax, i6);
                        }
                        callback.OooO0O0(loadType2);
                    } else {
                        i4 = o0ooooo.f10506OooO0Oo;
                        o0ooooo.f10504OooO0O0 -= o0ooooo.OooO0o(new IntRange(i2, i));
                        o0ooooo.f10506OooO0Oo = i3;
                        size2 = o0ooooo.getSize() - size;
                        if (size2 > 0) {
                            callback.OooO00o(size, size2);
                        } else if (size2 < 0) {
                            callback.f10478OooO00o.f10465OooO00o.OooO0O0(size + size2, -size2);
                        }
                        if (size2 < 0) {
                            iMin = Math.min(i4, -size2);
                        } else {
                            iMin = 0;
                        }
                        i5 = i3 - (i4 - iMin);
                        if (i5 > 0) {
                            callback.f10478OooO00o.f10465OooO00o.OooO0OO(o0ooooo.getSize() - i3, i5);
                        }
                        callback.OooO0O0(LoadType.APPEND);
                    }
                } else if (pageEvent instanceof Oooo000.OooO0OO) {
                    Oooo000.OooO0OO oooO0OO2 = (Oooo000.OooO0OO) pageEvent;
                    OooOOO sourceLoadStates4 = oooO0OO2.f10292OooO00o;
                    OooOOO oooOOO9 = oooO0OO2.f10293OooO0O0;
                    callback.getClass();
                    Intrinsics.checkNotNullParameter(sourceLoadStates4, "source");
                    o0Oo0oo<T> o0oo0oo11 = callback.f10478OooO00o;
                    o0oo0oo11.getClass();
                    Intrinsics.checkNotNullParameter(sourceLoadStates4, "source");
                    OooOo00 oooOo03 = o0oo0oo11.f10469OooO0o;
                    oooOo03.getClass();
                    Intrinsics.checkNotNullParameter(sourceLoadStates4, "sourceLoadStates");
                    oooOo03.OooO0OO(new o000(oooOo03, sourceLoadStates4, oooOOO9));
                } else if (pageEvent instanceof Oooo000.OooO0o) {
                    throw new IllegalStateException("Paging received an event to display a static list, while still actively loading\nfrom an existing generation of PagingData. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
                }
                if (this.f10456OooO0o0 instanceof Oooo000.OooO00o) {
                    this.f10455OooO0o.f10464OooO = false;
                }
                if (this.f10456OooO0o0 instanceof Oooo000.OooO0O0) {
                    value = this.f10455OooO0o.f10469OooO0o.f10268OooO0OO.getValue();
                    if (value != null) {
                        oooOOO3 = value.f35621OooO0Oo;
                    } else {
                        oooOOO3 = null;
                    }
                    if (oooOOO3 == null) {
                        throw new IllegalStateException("PagingDataDiffer.combinedLoadStatesCollection.stateFlow shouldnot hold null CombinedLoadStates after Insert event.".toString());
                    }
                    boolean z7 = oooOOO3.f10255OooO0O0.f10257OooO00o;
                    boolean z8 = oooOOO3.f10256OooO0OO.f10257OooO00o;
                    Oooo000.OooO0O0 oooO0O3 = (Oooo000.OooO0O0) this.f10456OooO0o0;
                    LoadType loadType4 = oooO0O3.f10286OooO00o;
                    if (loadType4 == LoadType.PREPEND) {
                    }
                    collection = oooO0O3.f10287OooO0O0;
                    if (!(collection instanceof Collection)) {
                        it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z3 = true;
                                break;
                            }
                            if (!((o000000O) it.next()).f10378OooO0O0.isEmpty()) {
                                z3 = false;
                                break;
                            }
                        }
                    } else {
                        it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z3 = true;
                                break;
                            }
                            if (!((o000000O) it.next()).f10378OooO0O0.isEmpty()) {
                                z3 = false;
                                break;
                            }
                        }
                    }
                    if (!z2) {
                        this.f10455OooO0o.f10464OooO = false;
                    } else if (this.f10455OooO0o.f10464OooO) {
                        if (z3) {
                            i7 = this.f10455OooO0o.f10473OooOO0;
                            o0oo0oo4 = this.f10455OooO0o;
                            if (i7 >= o0oo0oo4.f10470OooO0o0.f10505OooO0OO) {
                                i8 = o0oo0oo4.f10473OooOO0;
                                o0ooooo2 = this.f10455OooO0o.f10470OooO0o0;
                                if (i8 > o0ooooo2.f10505OooO0OO + o0ooooo2.f10504OooO0O0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            } else {
                                z4 = true;
                            }
                        } else {
                            z4 = true;
                        }
                        if (z4) {
                            o0oo0oo3 = this.f10455OooO0o;
                            o0000Var2 = o0oo0oo3.f10467OooO0OO;
                            if (o0000Var2 != null) {
                                o0000Var2.OooO00o(o0oo0oo3.f10470OooO0o0.OooO0o0(o0oo0oo3.f10473OooOO0));
                            }
                        } else {
                            this.f10455OooO0o.f10464OooO = false;
                        }
                    } else {
                        if (z3) {
                            i7 = this.f10455OooO0o.f10473OooOO0;
                            o0oo0oo4 = this.f10455OooO0o;
                            if (i7 >= o0oo0oo4.f10470OooO0o0.f10505OooO0OO) {
                                i8 = o0oo0oo4.f10473OooOO0;
                                o0ooooo2 = this.f10455OooO0o.f10470OooO0o0;
                                if (i8 > o0ooooo2.f10505OooO0OO + o0ooooo2.f10504OooO0O0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            } else {
                                z4 = true;
                            }
                        } else {
                            z4 = true;
                        }
                        if (z4) {
                            o0oo0oo3 = this.f10455OooO0o;
                            o0000Var2 = o0oo0oo3.f10467OooO0OO;
                            if (o0000Var2 != null) {
                                o0000Var2.OooO00o(o0oo0oo3.f10470OooO0o0.OooO0o0(o0oo0oo3.f10473OooOO0));
                            }
                        } else {
                            this.f10455OooO0o.f10464OooO = false;
                        }
                    }
                }
            }
        } else if (i10 == 1 || i10 == 2) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            o0Oo0oo<Object> o0oo0oo12 = this.f10455OooO0o;
            o0ooooo = o0oo0oo12.f10470OooO0o0;
            pageEvent = this.f10456OooO0o0;
            callback = o0oo0oo12.f10474OooOO0O;
            o0ooooo.getClass();
            Intrinsics.checkNotNullParameter(pageEvent, "pageEvent");
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (pageEvent instanceof Oooo000.OooO0O0) {
                oooO0O0 = (Oooo000.OooO0O0) pageEvent;
                it2 = oooO0O0.f10287OooO0O0.iterator();
                size4 = 0;
                while (it2.hasNext()) {
                    size4 += ((o000000O) it2.next()).f10378OooO0O0.size();
                }
                size5 = o0ooooo.getSize();
                i9 = o0ooOOo.OooO00o.$EnumSwitchMapping$0[oooO0O0.f10286OooO00o.ordinal()];
                if (i9 == 1) {
                    throw new IllegalStateException("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
                }
                list = o0ooooo.f10503OooO00o;
                collection2 = oooO0O0.f10287OooO0O0;
                if (i9 == 2) {
                    int iMin6 = Math.min(o0ooooo.f10505OooO0OO, size4);
                    int i113 = o0ooooo.f10505OooO0OO - iMin6;
                    int i114 = size4 - iMin6;
                    list.addAll(0, collection2);
                    o0ooooo.f10504OooO0O0 += size4;
                    o0ooooo.f10505OooO0OO = oooO0O0.f10288OooO0OO;
                    callback.f10478OooO00o.f10465OooO00o.OooO0OO(i113, iMin6);
                    callback.OooO00o(0, i114);
                    size6 = (o0ooooo.getSize() - size5) - i114;
                    if (size6 > 0) {
                        callback.OooO00o(0, size6);
                    } else if (size6 < 0) {
                        callback.f10478OooO00o.f10465OooO00o.OooO0O0(0, -size6);
                    }
                } else if (i9 == 3) {
                    int iMin7 = Math.min(o0ooooo.f10506OooO0Oo, size4);
                    int i115 = o0ooooo.f10505OooO0OO + o0ooooo.f10504OooO0O0;
                    int i116 = size4 - iMin7;
                    list.addAll(list.size(), collection2);
                    o0ooooo.f10504OooO0O0 += size4;
                    o0ooooo.f10506OooO0Oo = oooO0O0.f10289OooO0Oo;
                    callback.f10478OooO00o.f10465OooO00o.OooO0OO(i115, iMin7);
                    callback.OooO00o(i115 + iMin7, i116);
                    size7 = (o0ooooo.getSize() - size5) - i116;
                    if (size7 > 0) {
                        callback.OooO00o(o0ooooo.getSize() - size7, size7);
                    } else if (size7 < 0) {
                        callback.f10478OooO00o.f10465OooO00o.OooO0O0(o0ooooo.getSize(), -size7);
                    }
                }
                OooOOO sourceLoadStates5 = oooO0O0.f10291OooO0o0;
                OooOOO oooOOO10 = oooO0O0.f10290OooO0o;
                callback.getClass();
                Intrinsics.checkNotNullParameter(sourceLoadStates5, "source");
                o0Oo0oo<T> o0oo0oo13 = callback.f10478OooO00o;
                o0oo0oo13.getClass();
                Intrinsics.checkNotNullParameter(sourceLoadStates5, "source");
                OooOo00 oooOo04 = o0oo0oo13.f10469OooO0o;
                oooOo04.getClass();
                Intrinsics.checkNotNullParameter(sourceLoadStates5, "sourceLoadStates");
                oooOo04.OooO0OO(new o000(oooOo04, sourceLoadStates5, oooOOO10));
            } else if (pageEvent instanceof Oooo000.OooO00o) {
                Oooo000.OooO00o oooO00o3 = (Oooo000.OooO00o) pageEvent;
                size = o0ooooo.getSize();
                loadType = oooO00o3.f10281OooO00o;
                loadType2 = LoadType.PREPEND;
                i = oooO00o3.f10283OooO0OO;
                i2 = oooO00o3.f10282OooO0O0;
                i3 = oooO00o3.f10284OooO0Oo;
                if (loadType == loadType2) {
                    int i117 = o0ooooo.f10505OooO0OO;
                    o0ooooo.f10504OooO0O0 -= o0ooooo.OooO0o(new IntRange(i2, i));
                    o0ooooo.f10505OooO0OO = i3;
                    size3 = o0ooooo.getSize() - size;
                    if (size3 > 0) {
                        callback.OooO00o(0, size3);
                    } else if (size3 < 0) {
                        callback.f10478OooO00o.f10465OooO00o.OooO0O0(0, -size3);
                    }
                    iMax = Math.max(0, i117 + size3);
                    i6 = i3 - iMax;
                    if (i6 > 0) {
                        callback.f10478OooO00o.f10465OooO00o.OooO0OO(iMax, i6);
                    }
                    callback.OooO0O0(loadType2);
                } else {
                    i4 = o0ooooo.f10506OooO0Oo;
                    o0ooooo.f10504OooO0O0 -= o0ooooo.OooO0o(new IntRange(i2, i));
                    o0ooooo.f10506OooO0Oo = i3;
                    size2 = o0ooooo.getSize() - size;
                    if (size2 > 0) {
                        callback.OooO00o(size, size2);
                    } else if (size2 < 0) {
                        callback.f10478OooO00o.f10465OooO00o.OooO0O0(size + size2, -size2);
                    }
                    if (size2 < 0) {
                        iMin = Math.min(i4, -size2);
                    } else {
                        iMin = 0;
                    }
                    i5 = i3 - (i4 - iMin);
                    if (i5 > 0) {
                        callback.f10478OooO00o.f10465OooO00o.OooO0OO(o0ooooo.getSize() - i3, i5);
                    }
                    callback.OooO0O0(LoadType.APPEND);
                }
            } else if (pageEvent instanceof Oooo000.OooO0OO) {
                Oooo000.OooO0OO oooO0OO3 = (Oooo000.OooO0OO) pageEvent;
                OooOOO sourceLoadStates6 = oooO0OO3.f10292OooO00o;
                OooOOO oooOOO11 = oooO0OO3.f10293OooO0O0;
                callback.getClass();
                Intrinsics.checkNotNullParameter(sourceLoadStates6, "source");
                o0Oo0oo<T> o0oo0oo14 = callback.f10478OooO00o;
                o0oo0oo14.getClass();
                Intrinsics.checkNotNullParameter(sourceLoadStates6, "source");
                OooOo00 oooOo05 = o0oo0oo14.f10469OooO0o;
                oooOo05.getClass();
                Intrinsics.checkNotNullParameter(sourceLoadStates6, "sourceLoadStates");
                oooOo05.OooO0OO(new o000(oooOo05, sourceLoadStates6, oooOOO11));
            } else if (pageEvent instanceof Oooo000.OooO0o) {
                throw new IllegalStateException("Paging received an event to display a static list, while still actively loading\nfrom an existing generation of PagingData. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
            }
            if (this.f10456OooO0o0 instanceof Oooo000.OooO00o) {
                this.f10455OooO0o.f10464OooO = false;
            }
            if (this.f10456OooO0o0 instanceof Oooo000.OooO0O0) {
                value = this.f10455OooO0o.f10469OooO0o.f10268OooO0OO.getValue();
                if (value != null) {
                    oooOOO3 = value.f35621OooO0Oo;
                } else {
                    oooOOO3 = null;
                }
                if (oooOOO3 == null) {
                    throw new IllegalStateException("PagingDataDiffer.combinedLoadStatesCollection.stateFlow shouldnot hold null CombinedLoadStates after Insert event.".toString());
                }
                boolean z9 = oooOOO3.f10255OooO0O0.f10257OooO00o;
                boolean z10 = oooOOO3.f10256OooO0OO.f10257OooO00o;
                Oooo000.OooO0O0 oooO0O4 = (Oooo000.OooO0O0) this.f10456OooO0o0;
                LoadType loadType5 = oooO0O4.f10286OooO00o;
                z2 = (loadType5 == LoadType.PREPEND || !z9) && !(loadType5 == LoadType.APPEND && z10);
                collection = oooO0O4.f10287OooO0O0;
                if (!(collection instanceof Collection) && collection.isEmpty()) {
                    z3 = true;
                    break;
                }
                it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z3 = true;
                        break;
                    }
                    if (!((o000000O) it.next()).f10378OooO0O0.isEmpty()) {
                        z3 = false;
                        break;
                    }
                }
                if (!z2) {
                    this.f10455OooO0o.f10464OooO = false;
                } else if (this.f10455OooO0o.f10464OooO || z3) {
                    if (z3) {
                        i7 = this.f10455OooO0o.f10473OooOO0;
                        o0oo0oo4 = this.f10455OooO0o;
                        if (i7 >= o0oo0oo4.f10470OooO0o0.f10505OooO0OO) {
                            i8 = o0oo0oo4.f10473OooOO0;
                            o0ooooo2 = this.f10455OooO0o.f10470OooO0o0;
                            if (i8 > o0ooooo2.f10505OooO0OO + o0ooooo2.f10504OooO0O0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                        } else {
                            z4 = true;
                        }
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        o0oo0oo3 = this.f10455OooO0o;
                        o0000Var2 = o0oo0oo3.f10467OooO0OO;
                        if (o0000Var2 != null) {
                            o0000Var2.OooO00o(o0oo0oo3.f10470OooO0o0.OooO0o0(o0oo0oo3.f10473OooOO0));
                        }
                    } else {
                        this.f10455OooO0o.f10464OooO = false;
                    }
                }
            }
        }
        Oooo000<Object> oooo001 = this.f10456OooO0o0;
        if ((oooo001 instanceof Oooo000.OooO0O0) || (oooo001 instanceof Oooo000.OooO00o) || (oooo001 instanceof Oooo000.OooO0o)) {
            Iterator<Function0<Unit>> it3 = this.f10455OooO0o.f10471OooO0oO.iterator();
            while (it3.hasNext()) {
                it3.next().invoke();
            }
        }
        return Unit.INSTANCE;
    }
}
