package p089o000o000;

import androidx.paging.LoadType;
import io.agora.rtc.Constants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
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
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.YieldKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.paging.PagingDataDiffer$collectFrom$2$1$1", f = "PagingDataDiffer.kt", i = {}, l = {147, Constants.ERR_PUBLISH_STREAM_FORMAT_NOT_SUPPORTED, 172}, m = "invokeSuspend", n = {}, s = {})
public final class o00O00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f28954Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ o00O00<Object> f28955OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o0000O0O<Object> f28956OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00O(o0000O0O<Object> o0000o0o2, o00O00<Object> o00o01, Continuation<? super o00O00O> continuation) {
        super(2, continuation);
        this.f28956OoooO00 = o0000o0o2;
        this.f28955OoooO0 = o00o01;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O00O(this.f28956OoooO00, this.f28955OoooO0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00O00O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x023b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0242  */
    /* JADX WARN: Code duplicated, block: B:107:0x024c  */
    /* JADX WARN: Code duplicated, block: B:112:0x025f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0264  */
    /* JADX WARN: Code duplicated, block: B:115:0x026a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x026c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x026e  */
    /* JADX WARN: Code duplicated, block: B:119:0x027a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0288  */
    /* JADX WARN: Code duplicated, block: B:124:0x028b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0291  */
    /* JADX WARN: Code duplicated, block: B:127:0x029d  */
    /* JADX WARN: Code duplicated, block: B:140:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:142:0x025c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x025a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:? A[LOOP:0: B:105:0x0246->B:144:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:29:0x008c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x008d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:34:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:44:0x0106  */
    /* JADX WARN: Code duplicated, block: B:45:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0111  */
    /* JADX WARN: Code duplicated, block: B:47:0x011a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0143  */
    /* JADX WARN: Code duplicated, block: B:50:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0149  */
    /* JADX WARN: Code duplicated, block: B:53:0x0156  */
    /* JADX WARN: Code duplicated, block: B:55:0x015e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0162  */
    /* JADX WARN: Code duplicated, block: B:59:0x016e  */
    /* JADX WARN: Code duplicated, block: B:61:0x018d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0193  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x01cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x01da  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:87:0x0209  */
    /* JADX WARN: Code duplicated, block: B:90:0x0213  */
    /* JADX WARN: Code duplicated, block: B:92:0x0229 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x022b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        o00O00<Object> o00o01;
        List listListOf;
        o000000O o000000o2;
        boolean z;
        o000000O o000000o3;
        o000O<Object> o000o;
        o0000O0O<Object> pageEvent;
        o00O00.OooO0OO callback;
        o0000O0O.OooO00o oooO00o;
        int size;
        LoadType loadType;
        LoadType loadType2;
        int i;
        int size2;
        int iMin;
        int i2;
        int size3;
        int iMax;
        int i3;
        o0000O0O<Object> o0000o0o2;
        boolean z2;
        Collection collection;
        Iterator it;
        boolean z3;
        o00O00<Object> o00o02;
        o00OO000 o00oo001;
        int i4;
        o00O00<Object> o00o03;
        int i5;
        o000O<Object> o000o2;
        o0000O0O.OooO0O0 oooO0O0;
        int iOooO0oO;
        int size4;
        int i6;
        int size5;
        int size6;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.f28954Oooo;
        boolean z4 = true;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            o0000O0O<Object> o0000o0o3 = this.f28956OoooO00;
            if (o0000o0o3 instanceof o0000O0O.OooO0O0) {
                o0000O0O.OooO0O0 oooO0O1 = (o0000O0O.OooO0O0) o0000o0o3;
                if (oooO0O1.f28758OooO00o == LoadType.REFRESH) {
                    o00O00<Object> o00o04 = this.f28955OoooO0;
                    List<o00O<T>> list = oooO0O1.f28759OooO0O0;
                    int i8 = oooO0O1.f28760OooO0OO;
                    int i9 = oooO0O1.f28761OooO0Oo;
                    o000000O o000000o4 = oooO0O1.f28763OooO0o0;
                    o000000O o000000o5 = oooO0O1.f28762OooO0o;
                    this.f28954Oooo = 1;
                    if (o00O00.OooO00o(o00o04, list, i8, i9, true, o000000o4, o000000o5, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (o0000o0o3 instanceof o0000O0O.OooO0o) {
                    o00o01 = this.f28955OoooO0;
                    listListOf = CollectionsKt.listOf(new o00O(0, ((o0000O0O.OooO0o) this.f28956OoooO00).f28766OooO00o));
                    o0000O0O.OooO0o oooO0o = (o0000O0O.OooO0o) this.f28956OoooO00;
                    o000000o2 = oooO0o.f28767OooO0O0;
                    if (o000000o2 == null || oooO0o.f28768OooO0OO != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    o000000o3 = oooO0o.f28768OooO0OO;
                    this.f28954Oooo = 2;
                    if (o00O00.OooO00o(o00o01, listListOf, 0, 0, z, o000000o2, o000000o3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (this.f28955OoooO0.OooO0o0()) {
                        this.f28954Oooo = 3;
                        if (YieldKt.yield(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    o00O00<Object> o00o05 = this.f28955OoooO0;
                    o000o = o00o05.f28927OooO0OO;
                    pageEvent = this.f28956OoooO00;
                    callback = o00o05.f28933OooOO0;
                    Objects.requireNonNull(o000o);
                    Intrinsics.checkNotNullParameter(pageEvent, "pageEvent");
                    Intrinsics.checkNotNullParameter(callback, "callback");
                    if (pageEvent instanceof o0000O0O.OooO0O0) {
                        oooO0O0 = (o0000O0O.OooO0O0) pageEvent;
                        iOooO0oO = o000o.OooO0oO(oooO0O0.f28759OooO0O0);
                        size4 = o000o.getSize();
                        i6 = o000O.OooO0O0.$EnumSwitchMapping$0[oooO0O0.f28758OooO00o.ordinal()];
                        if (i6 == 1) {
                            throw new IllegalStateException("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
                        }
                        if (i6 == 2) {
                            int iMin2 = Math.min(o000o.f28781OooO0OO, iOooO0oO);
                            int i10 = o000o.f28781OooO0OO - iMin2;
                            int i11 = iOooO0oO - iMin2;
                            o000o.f28779OooO00o.addAll(0, oooO0O0.f28759OooO0O0);
                            o000o.f28780OooO0O0 += iOooO0oO;
                            o000o.f28781OooO0OO = oooO0O0.f28760OooO0OO;
                            callback.OooO00o(i10, iMin2);
                            callback.OooO0O0(0, i11);
                            size5 = (o000o.getSize() - size4) - i11;
                            if (size5 > 0) {
                                callback.OooO0O0(0, size5);
                            } else if (size5 < 0) {
                                callback.OooO0OO(0, -size5);
                            }
                        } else if (i6 == 3) {
                            int iMin3 = Math.min(o000o.f28782OooO0Oo, iOooO0oO);
                            int i12 = o000o.f28781OooO0OO + o000o.f28780OooO0O0;
                            int i13 = iOooO0oO - iMin3;
                            List<o00O<Object>> list2 = o000o.f28779OooO00o;
                            list2.addAll(list2.size(), oooO0O0.f28759OooO0O0);
                            o000o.f28780OooO0O0 += iOooO0oO;
                            o000o.f28782OooO0Oo = oooO0O0.f28761OooO0Oo;
                            callback.OooO00o(i12, iMin3);
                            callback.OooO0O0(i12 + iMin3, i13);
                            size6 = (o000o.getSize() - size4) - i13;
                            if (size6 > 0) {
                                callback.OooO0O0(o000o.getSize() - size6, size6);
                            } else if (size6 < 0) {
                                callback.OooO0OO(o000o.getSize(), -size6);
                            }
                        }
                        callback.OooO0o0(oooO0O0.f28763OooO0o0, oooO0O0.f28762OooO0o);
                    } else if (pageEvent instanceof o0000O0O.OooO00o) {
                        oooO00o = (o0000O0O.OooO00o) pageEvent;
                        size = o000o.getSize();
                        loadType = oooO00o.f28752OooO00o;
                        loadType2 = LoadType.PREPEND;
                        if (loadType == loadType2) {
                            int i14 = o000o.f28781OooO0OO;
                            o000o.f28780OooO0O0 -= o000o.OooO0o(new IntRange(oooO00o.f28753OooO0O0, oooO00o.f28754OooO0OO));
                            o000o.f28781OooO0OO = oooO00o.f28755OooO0Oo;
                            size3 = o000o.getSize() - size;
                            if (size3 > 0) {
                                callback.OooO0O0(0, size3);
                            } else if (size3 < 0) {
                                callback.OooO0OO(0, -size3);
                            }
                            iMax = Math.max(0, i14 + size3);
                            i3 = oooO00o.f28755OooO0Oo - iMax;
                            if (i3 > 0) {
                                callback.OooO00o(iMax, i3);
                            }
                            callback.OooO0Oo(loadType2);
                        } else {
                            i = o000o.f28782OooO0Oo;
                            o000o.f28780OooO0O0 -= o000o.OooO0o(new IntRange(oooO00o.f28753OooO0O0, oooO00o.f28754OooO0OO));
                            o000o.f28782OooO0Oo = oooO00o.f28755OooO0Oo;
                            size2 = o000o.getSize() - size;
                            if (size2 > 0) {
                                callback.OooO0O0(size, size2);
                            } else if (size2 < 0) {
                                callback.OooO0OO(size + size2, -size2);
                            }
                            if (size2 < 0) {
                                iMin = Math.min(i, -size2);
                            } else {
                                iMin = 0;
                            }
                            i2 = oooO00o.f28755OooO0Oo - (i - iMin);
                            if (i2 > 0) {
                                callback.OooO00o(o000o.getSize() - oooO00o.f28755OooO0Oo, i2);
                            }
                            callback.OooO0Oo(LoadType.APPEND);
                        }
                    } else if (pageEvent instanceof o0000O0O.OooO0OO) {
                        o0000O0O.OooO0OO oooO0OO = (o0000O0O.OooO0OO) pageEvent;
                        callback.OooO0o0(oooO0OO.f28764OooO00o, oooO0OO.f28765OooO0O0);
                    } else if (pageEvent instanceof o0000O0O.OooO0o) {
                        throw new IllegalStateException("Paging received an event to display a static list, while still actively loading\nfrom an existing generation of PagingData. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
                    }
                    if (this.f28956OoooO00 instanceof o0000O0O.OooO00o) {
                        this.f28955OoooO0.f28932OooO0oo = false;
                    }
                    o0000o0o2 = this.f28956OoooO00;
                    if (o0000o0o2 instanceof o0000O0O.OooO0O0) {
                        o000000O o000000o6 = this.f28955OoooO0.f28930OooO0o0.f28735OooO0o;
                        boolean z5 = o000000o6.f28722OooO0O0.f28714OooO00o;
                        boolean z6 = o000000o6.f28723OooO0OO.f28714OooO00o;
                        o0000O0O.OooO0O0 oooO0O2 = (o0000O0O.OooO0O0) o0000o0o2;
                        LoadType loadType3 = oooO0O2.f28758OooO00o;
                        if (loadType3 == LoadType.PREPEND) {
                        }
                        collection = oooO0O2.f28759OooO0O0;
                        if (!(collection instanceof Collection)) {
                            it = collection.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z3 = true;
                                    break;
                                }
                                if (!((o00O) it.next()).f28917OooO0O0.isEmpty()) {
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
                                if (!((o00O) it.next()).f28917OooO0O0.isEmpty()) {
                                    z3 = false;
                                    break;
                                }
                            }
                        }
                        if (!z2) {
                            this.f28955OoooO0.f28932OooO0oo = false;
                        } else if (this.f28955OoooO0.f28932OooO0oo) {
                            if (!z3) {
                                i4 = this.f28955OoooO0.f28924OooO;
                                o00o03 = this.f28955OoooO0;
                                if (i4 >= o00o03.f28927OooO0OO.f28781OooO0OO) {
                                    i5 = o00o03.f28924OooO;
                                    o000o2 = this.f28955OoooO0.f28927OooO0OO;
                                    if (i5 <= o000o2.f28781OooO0OO + o000o2.f28780OooO0O0) {
                                        z4 = false;
                                    }
                                }
                            }
                            if (z4) {
                                o00o02 = this.f28955OoooO0;
                                o00oo001 = o00o02.f28928OooO0Oo;
                                if (o00oo001 != null) {
                                    o00oo001.OooO0O0(o00o02.f28927OooO0OO.OooO0o0(o00o02.f28924OooO));
                                }
                            } else {
                                this.f28955OoooO0.f28932OooO0oo = false;
                            }
                        } else {
                            if (!z3) {
                                i4 = this.f28955OoooO0.f28924OooO;
                                o00o03 = this.f28955OoooO0;
                                if (i4 >= o00o03.f28927OooO0OO.f28781OooO0OO) {
                                    i5 = o00o03.f28924OooO;
                                    o000o2 = this.f28955OoooO0.f28927OooO0OO;
                                    if (i5 <= o000o2.f28781OooO0OO + o000o2.f28780OooO0O0) {
                                        z4 = false;
                                    }
                                }
                            }
                            if (z4) {
                                o00o02 = this.f28955OoooO0;
                                o00oo001 = o00o02.f28928OooO0Oo;
                                if (o00oo001 != null) {
                                    o00oo001.OooO0O0(o00o02.f28927OooO0OO.OooO0o0(o00o02.f28924OooO));
                                }
                            } else {
                                this.f28955OoooO0.f28932OooO0oo = false;
                            }
                        }
                    }
                }
            } else if (o0000o0o3 instanceof o0000O0O.OooO0o) {
                o00o01 = this.f28955OoooO0;
                listListOf = CollectionsKt.listOf(new o00O(0, ((o0000O0O.OooO0o) this.f28956OoooO00).f28766OooO00o));
                o0000O0O.OooO0o oooO0o2 = (o0000O0O.OooO0o) this.f28956OoooO00;
                o000000o2 = oooO0o2.f28767OooO0O0;
                if (o000000o2 == null) {
                    z = true;
                } else {
                    z = true;
                }
                o000000o3 = oooO0o2.f28768OooO0OO;
                this.f28954Oooo = 2;
                if (o00O00.OooO00o(o00o01, listListOf, 0, 0, z, o000000o2, o000000o3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (this.f28955OoooO0.OooO0o0()) {
                    this.f28954Oooo = 3;
                    if (YieldKt.yield(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                o00O00<Object> o00o06 = this.f28955OoooO0;
                o000o = o00o06.f28927OooO0OO;
                pageEvent = this.f28956OoooO00;
                callback = o00o06.f28933OooOO0;
                Objects.requireNonNull(o000o);
                Intrinsics.checkNotNullParameter(pageEvent, "pageEvent");
                Intrinsics.checkNotNullParameter(callback, "callback");
                if (pageEvent instanceof o0000O0O.OooO0O0) {
                    oooO0O0 = (o0000O0O.OooO0O0) pageEvent;
                    iOooO0oO = o000o.OooO0oO(oooO0O0.f28759OooO0O0);
                    size4 = o000o.getSize();
                    i6 = o000O.OooO0O0.$EnumSwitchMapping$0[oooO0O0.f28758OooO00o.ordinal()];
                    if (i6 == 1) {
                        throw new IllegalStateException("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
                    }
                    if (i6 == 2) {
                        int iMin4 = Math.min(o000o.f28781OooO0OO, iOooO0oO);
                        int i15 = o000o.f28781OooO0OO - iMin4;
                        int i16 = iOooO0oO - iMin4;
                        o000o.f28779OooO00o.addAll(0, oooO0O0.f28759OooO0O0);
                        o000o.f28780OooO0O0 += iOooO0oO;
                        o000o.f28781OooO0OO = oooO0O0.f28760OooO0OO;
                        callback.OooO00o(i15, iMin4);
                        callback.OooO0O0(0, i16);
                        size5 = (o000o.getSize() - size4) - i16;
                        if (size5 > 0) {
                            callback.OooO0O0(0, size5);
                        } else if (size5 < 0) {
                            callback.OooO0OO(0, -size5);
                        }
                    } else if (i6 == 3) {
                        int iMin5 = Math.min(o000o.f28782OooO0Oo, iOooO0oO);
                        int i17 = o000o.f28781OooO0OO + o000o.f28780OooO0O0;
                        int i18 = iOooO0oO - iMin5;
                        List<o00O<Object>> list3 = o000o.f28779OooO00o;
                        list3.addAll(list3.size(), oooO0O0.f28759OooO0O0);
                        o000o.f28780OooO0O0 += iOooO0oO;
                        o000o.f28782OooO0Oo = oooO0O0.f28761OooO0Oo;
                        callback.OooO00o(i17, iMin5);
                        callback.OooO0O0(i17 + iMin5, i18);
                        size6 = (o000o.getSize() - size4) - i18;
                        if (size6 > 0) {
                            callback.OooO0O0(o000o.getSize() - size6, size6);
                        } else if (size6 < 0) {
                            callback.OooO0OO(o000o.getSize(), -size6);
                        }
                    }
                    callback.OooO0o0(oooO0O0.f28763OooO0o0, oooO0O0.f28762OooO0o);
                } else if (pageEvent instanceof o0000O0O.OooO00o) {
                    oooO00o = (o0000O0O.OooO00o) pageEvent;
                    size = o000o.getSize();
                    loadType = oooO00o.f28752OooO00o;
                    loadType2 = LoadType.PREPEND;
                    if (loadType == loadType2) {
                        int i19 = o000o.f28781OooO0OO;
                        o000o.f28780OooO0O0 -= o000o.OooO0o(new IntRange(oooO00o.f28753OooO0O0, oooO00o.f28754OooO0OO));
                        o000o.f28781OooO0OO = oooO00o.f28755OooO0Oo;
                        size3 = o000o.getSize() - size;
                        if (size3 > 0) {
                            callback.OooO0O0(0, size3);
                        } else if (size3 < 0) {
                            callback.OooO0OO(0, -size3);
                        }
                        iMax = Math.max(0, i19 + size3);
                        i3 = oooO00o.f28755OooO0Oo - iMax;
                        if (i3 > 0) {
                            callback.OooO00o(iMax, i3);
                        }
                        callback.OooO0Oo(loadType2);
                    } else {
                        i = o000o.f28782OooO0Oo;
                        o000o.f28780OooO0O0 -= o000o.OooO0o(new IntRange(oooO00o.f28753OooO0O0, oooO00o.f28754OooO0OO));
                        o000o.f28782OooO0Oo = oooO00o.f28755OooO0Oo;
                        size2 = o000o.getSize() - size;
                        if (size2 > 0) {
                            callback.OooO0O0(size, size2);
                        } else if (size2 < 0) {
                            callback.OooO0OO(size + size2, -size2);
                        }
                        if (size2 < 0) {
                            iMin = Math.min(i, -size2);
                        } else {
                            iMin = 0;
                        }
                        i2 = oooO00o.f28755OooO0Oo - (i - iMin);
                        if (i2 > 0) {
                            callback.OooO00o(o000o.getSize() - oooO00o.f28755OooO0Oo, i2);
                        }
                        callback.OooO0Oo(LoadType.APPEND);
                    }
                } else if (pageEvent instanceof o0000O0O.OooO0OO) {
                    o0000O0O.OooO0OO oooO0OO2 = (o0000O0O.OooO0OO) pageEvent;
                    callback.OooO0o0(oooO0OO2.f28764OooO00o, oooO0OO2.f28765OooO0O0);
                } else if (pageEvent instanceof o0000O0O.OooO0o) {
                    throw new IllegalStateException("Paging received an event to display a static list, while still actively loading\nfrom an existing generation of PagingData. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
                }
                if (this.f28956OoooO00 instanceof o0000O0O.OooO00o) {
                    this.f28955OoooO0.f28932OooO0oo = false;
                }
                o0000o0o2 = this.f28956OoooO00;
                if (o0000o0o2 instanceof o0000O0O.OooO0O0) {
                    o000000O o000000o7 = this.f28955OoooO0.f28930OooO0o0.f28735OooO0o;
                    boolean z7 = o000000o7.f28722OooO0O0.f28714OooO00o;
                    boolean z8 = o000000o7.f28723OooO0OO.f28714OooO00o;
                    o0000O0O.OooO0O0 oooO0O3 = (o0000O0O.OooO0O0) o0000o0o2;
                    LoadType loadType4 = oooO0O3.f28758OooO00o;
                    if (loadType4 == LoadType.PREPEND) {
                    }
                    collection = oooO0O3.f28759OooO0O0;
                    if (!(collection instanceof Collection)) {
                        it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z3 = true;
                                break;
                            }
                            if (!((o00O) it.next()).f28917OooO0O0.isEmpty()) {
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
                            if (!((o00O) it.next()).f28917OooO0O0.isEmpty()) {
                                z3 = false;
                                break;
                            }
                        }
                    }
                    if (!z2) {
                        this.f28955OoooO0.f28932OooO0oo = false;
                    } else if (this.f28955OoooO0.f28932OooO0oo) {
                        if (!z3) {
                            i4 = this.f28955OoooO0.f28924OooO;
                            o00o03 = this.f28955OoooO0;
                            if (i4 >= o00o03.f28927OooO0OO.f28781OooO0OO) {
                                i5 = o00o03.f28924OooO;
                                o000o2 = this.f28955OoooO0.f28927OooO0OO;
                                if (i5 <= o000o2.f28781OooO0OO + o000o2.f28780OooO0O0) {
                                    z4 = false;
                                }
                            }
                        }
                        if (z4) {
                            o00o02 = this.f28955OoooO0;
                            o00oo001 = o00o02.f28928OooO0Oo;
                            if (o00oo001 != null) {
                                o00oo001.OooO0O0(o00o02.f28927OooO0OO.OooO0o0(o00o02.f28924OooO));
                            }
                        } else {
                            this.f28955OoooO0.f28932OooO0oo = false;
                        }
                    } else {
                        if (!z3) {
                            i4 = this.f28955OoooO0.f28924OooO;
                            o00o03 = this.f28955OoooO0;
                            if (i4 >= o00o03.f28927OooO0OO.f28781OooO0OO) {
                                i5 = o00o03.f28924OooO;
                                o000o2 = this.f28955OoooO0.f28927OooO0OO;
                                if (i5 <= o000o2.f28781OooO0OO + o000o2.f28780OooO0O0) {
                                    z4 = false;
                                }
                            }
                        }
                        if (z4) {
                            o00o02 = this.f28955OoooO0;
                            o00oo001 = o00o02.f28928OooO0Oo;
                            if (o00oo001 != null) {
                                o00oo001.OooO0O0(o00o02.f28927OooO0OO.OooO0o0(o00o02.f28924OooO));
                            }
                        } else {
                            this.f28955OoooO0.f28932OooO0oo = false;
                        }
                    }
                }
            }
        } else if (i7 == 1 || i7 == 2) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i7 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            o00O00<Object> o00o07 = this.f28955OoooO0;
            o000o = o00o07.f28927OooO0OO;
            pageEvent = this.f28956OoooO00;
            callback = o00o07.f28933OooOO0;
            Objects.requireNonNull(o000o);
            Intrinsics.checkNotNullParameter(pageEvent, "pageEvent");
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (pageEvent instanceof o0000O0O.OooO0O0) {
                oooO0O0 = (o0000O0O.OooO0O0) pageEvent;
                iOooO0oO = o000o.OooO0oO(oooO0O0.f28759OooO0O0);
                size4 = o000o.getSize();
                i6 = o000O.OooO0O0.$EnumSwitchMapping$0[oooO0O0.f28758OooO00o.ordinal()];
                if (i6 == 1) {
                    throw new IllegalStateException("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
                }
                if (i6 == 2) {
                    int iMin6 = Math.min(o000o.f28781OooO0OO, iOooO0oO);
                    int i110 = o000o.f28781OooO0OO - iMin6;
                    int i111 = iOooO0oO - iMin6;
                    o000o.f28779OooO00o.addAll(0, oooO0O0.f28759OooO0O0);
                    o000o.f28780OooO0O0 += iOooO0oO;
                    o000o.f28781OooO0OO = oooO0O0.f28760OooO0OO;
                    callback.OooO00o(i110, iMin6);
                    callback.OooO0O0(0, i111);
                    size5 = (o000o.getSize() - size4) - i111;
                    if (size5 > 0) {
                        callback.OooO0O0(0, size5);
                    } else if (size5 < 0) {
                        callback.OooO0OO(0, -size5);
                    }
                } else if (i6 == 3) {
                    int iMin7 = Math.min(o000o.f28782OooO0Oo, iOooO0oO);
                    int i112 = o000o.f28781OooO0OO + o000o.f28780OooO0O0;
                    int i113 = iOooO0oO - iMin7;
                    List<o00O<Object>> list4 = o000o.f28779OooO00o;
                    list4.addAll(list4.size(), oooO0O0.f28759OooO0O0);
                    o000o.f28780OooO0O0 += iOooO0oO;
                    o000o.f28782OooO0Oo = oooO0O0.f28761OooO0Oo;
                    callback.OooO00o(i112, iMin7);
                    callback.OooO0O0(i112 + iMin7, i113);
                    size6 = (o000o.getSize() - size4) - i113;
                    if (size6 > 0) {
                        callback.OooO0O0(o000o.getSize() - size6, size6);
                    } else if (size6 < 0) {
                        callback.OooO0OO(o000o.getSize(), -size6);
                    }
                }
                callback.OooO0o0(oooO0O0.f28763OooO0o0, oooO0O0.f28762OooO0o);
            } else if (pageEvent instanceof o0000O0O.OooO00o) {
                oooO00o = (o0000O0O.OooO00o) pageEvent;
                size = o000o.getSize();
                loadType = oooO00o.f28752OooO00o;
                loadType2 = LoadType.PREPEND;
                if (loadType == loadType2) {
                    int i114 = o000o.f28781OooO0OO;
                    o000o.f28780OooO0O0 -= o000o.OooO0o(new IntRange(oooO00o.f28753OooO0O0, oooO00o.f28754OooO0OO));
                    o000o.f28781OooO0OO = oooO00o.f28755OooO0Oo;
                    size3 = o000o.getSize() - size;
                    if (size3 > 0) {
                        callback.OooO0O0(0, size3);
                    } else if (size3 < 0) {
                        callback.OooO0OO(0, -size3);
                    }
                    iMax = Math.max(0, i114 + size3);
                    i3 = oooO00o.f28755OooO0Oo - iMax;
                    if (i3 > 0) {
                        callback.OooO00o(iMax, i3);
                    }
                    callback.OooO0Oo(loadType2);
                } else {
                    i = o000o.f28782OooO0Oo;
                    o000o.f28780OooO0O0 -= o000o.OooO0o(new IntRange(oooO00o.f28753OooO0O0, oooO00o.f28754OooO0OO));
                    o000o.f28782OooO0Oo = oooO00o.f28755OooO0Oo;
                    size2 = o000o.getSize() - size;
                    if (size2 > 0) {
                        callback.OooO0O0(size, size2);
                    } else if (size2 < 0) {
                        callback.OooO0OO(size + size2, -size2);
                    }
                    if (size2 < 0) {
                        iMin = Math.min(i, -size2);
                    } else {
                        iMin = 0;
                    }
                    i2 = oooO00o.f28755OooO0Oo - (i - iMin);
                    if (i2 > 0) {
                        callback.OooO00o(o000o.getSize() - oooO00o.f28755OooO0Oo, i2);
                    }
                    callback.OooO0Oo(LoadType.APPEND);
                }
            } else if (pageEvent instanceof o0000O0O.OooO0OO) {
                o0000O0O.OooO0OO oooO0OO3 = (o0000O0O.OooO0OO) pageEvent;
                callback.OooO0o0(oooO0OO3.f28764OooO00o, oooO0OO3.f28765OooO0O0);
            } else if (pageEvent instanceof o0000O0O.OooO0o) {
                throw new IllegalStateException("Paging received an event to display a static list, while still actively loading\nfrom an existing generation of PagingData. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
            }
            if (this.f28956OoooO00 instanceof o0000O0O.OooO00o) {
                this.f28955OoooO0.f28932OooO0oo = false;
            }
            o0000o0o2 = this.f28956OoooO00;
            if (o0000o0o2 instanceof o0000O0O.OooO0O0) {
                o000000O o000000o8 = this.f28955OoooO0.f28930OooO0o0.f28735OooO0o;
                boolean z9 = o000000o8.f28722OooO0O0.f28714OooO00o;
                boolean z10 = o000000o8.f28723OooO0OO.f28714OooO00o;
                o0000O0O.OooO0O0 oooO0O4 = (o0000O0O.OooO0O0) o0000o0o2;
                LoadType loadType5 = oooO0O4.f28758OooO00o;
                z2 = (loadType5 == LoadType.PREPEND || !z9) && !(loadType5 == LoadType.APPEND && z10);
                collection = oooO0O4.f28759OooO0O0;
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
                    if (!((o00O) it.next()).f28917OooO0O0.isEmpty()) {
                        z3 = false;
                        break;
                    }
                }
                if (!z2) {
                    this.f28955OoooO0.f28932OooO0oo = false;
                } else if (this.f28955OoooO0.f28932OooO0oo || z3) {
                    if (!z3) {
                        i4 = this.f28955OoooO0.f28924OooO;
                        o00o03 = this.f28955OoooO0;
                        if (i4 >= o00o03.f28927OooO0OO.f28781OooO0OO) {
                            i5 = o00o03.f28924OooO;
                            o000o2 = this.f28955OoooO0.f28927OooO0OO;
                            if (i5 <= o000o2.f28781OooO0OO + o000o2.f28780OooO0O0) {
                                z4 = false;
                            }
                        }
                    }
                    if (z4) {
                        o00o02 = this.f28955OoooO0;
                        o00oo001 = o00o02.f28928OooO0Oo;
                        if (o00oo001 != null) {
                            o00oo001.OooO0O0(o00o02.f28927OooO0OO.OooO0o0(o00o02.f28924OooO));
                        }
                    } else {
                        this.f28955OoooO0.f28932OooO0oo = false;
                    }
                }
            }
        }
        o0000O0O<Object> o0000o0o4 = this.f28956OoooO00;
        if ((o0000o0o4 instanceof o0000O0O.OooO0O0) || (o0000o0o4 instanceof o0000O0O.OooO00o) || (o0000o0o4 instanceof o0000O0O.OooO0o)) {
            Iterator<Function0<Unit>> it2 = this.f28955OoooO0.f28929OooO0o.iterator();
            while (it2.hasNext()) {
                it2.next().invoke();
            }
        }
        return Unit.INSTANCE;
    }
}
