package com.yalla.yalla.base.loadcache;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLoadLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoadLogic.kt\ncom/yalla/yalla/base/loadcache/LoadLogic\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
public abstract class LoadLogic<K, T> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/base/loadcache/LoadLogic$LoadLevel;", "", "", "level", "I", "OooO00o", "()I", "CACHE", "DISK", "ALL", "YLBase_release"}, k = 1, mv = {1, 8, 0})
    public enum LoadLevel {
        CACHE(1),
        DISK(2),
        ALL(3);

        private final int level;

        LoadLevel(int i) {
            this.level = i;
        }

        /* JADX INFO: renamed from: OooO00o, reason: from getter */
        public final int getLevel() {
            return this.level;
        }
    }

    @Nullable
    public abstract Object OooO00o(Object obj, @NotNull OooO00o oooO00o);

    /* JADX WARN: Code duplicated, block: B:24:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0088  */
    /* JADX WARN: Code duplicated, block: B:27:0x008e  */
    /* JADX WARN: Code duplicated, block: B:29:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b7 A[PHI: r2 r8 r9
      0x00b7: PHI (r2v5 com.yalla.yalla.base.loadcache.LoadLogic<K, T>) = (r2v2 com.yalla.yalla.base.loadcache.LoadLogic<K, T>), (r2v6 com.yalla.yalla.base.loadcache.LoadLogic<K, T>) binds: [B:26:0x008c, B:37:0x00b4] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r8v5 java.lang.Object) = (r8v25 java.lang.Object), (r8v7 java.lang.Object) binds: [B:26:0x008c, B:37:0x00b4] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r9v5 com.yalla.yalla.base.loadcache.LoadLogic$LoadLevel) = (r9v1 com.yalla.yalla.base.loadcache.LoadLogic$LoadLevel), (r9v9 com.yalla.yalla.base.loadcache.LoadLogic$LoadLevel) binds: [B:26:0x008c, B:37:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:46:0x00de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00df  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ef A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0O0(String str, @NotNull LoadLevel loadLevel, @NotNull Continuation continuation) {
        OooO00o oooO00o;
        LoadLogic<K, T> loadLogic;
        Object obj;
        Object obj2;
        LoadLevel loadLevel2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f22768OooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f22768OooO = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(this, continuation);
            }
        } else {
            oooO00o = new OooO00o(this, continuation);
        }
        Object objOooO0OO = oooO00o.f22772OooO0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (oooO00o.f22768OooO) {
            case 0:
                ResultKt.throwOnFailure(objOooO0OO);
                oooO00o.f22769OooO0Oo = this;
                oooO00o.f22771OooO0o0 = str;
                oooO00o.f22770OooO0o = loadLevel;
                oooO00o.f22768OooO = 1;
                objOooO0OO = OooO0OO(str);
                if (objOooO0OO == coroutine_suspended) {
                    return coroutine_suspended;
                }
                loadLogic = this;
                if (objOooO0OO != null) {
                    obj = str;
                    return objOooO0OO;
                }
                obj = str;
                if (loadLevel.getLevel() > 1) {
                    oooO00o.f22769OooO0Oo = loadLogic;
                    oooO00o.f22771OooO0o0 = obj;
                    oooO00o.f22770OooO0o = loadLevel;
                    oooO00o.f22768OooO = 2;
                    objOooO0OO = loadLogic.OooO0Oo(obj, oooO00o);
                    if (objOooO0OO == coroutine_suspended) {
                        obj3 = obj;
                        return coroutine_suspended;
                    }
                    LoadLevel loadLevel3 = loadLevel;
                    obj2 = obj;
                    loadLevel2 = loadLevel3;
                    if (objOooO0OO != null) {
                        obj3 = obj;
                        oooO00o.f22769OooO0Oo = objOooO0OO;
                        oooO00o.f22771OooO0o0 = null;
                        oooO00o.f22770OooO0o = null;
                        oooO00o.f22768OooO = 3;
                        if (loadLogic.OooO0o(obj2, objOooO0OO) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return objOooO0OO;
                    }
                    obj3 = obj;
                    Object obj8 = obj2;
                    loadLevel = loadLevel2;
                    obj3 = obj8;
                    obj3 = obj;
                    if (loadLevel.getLevel() > 2) {
                        oooO00o.f22769OooO0Oo = loadLogic;
                        oooO00o.f22771OooO0o0 = obj3;
                        oooO00o.f22770OooO0o = null;
                        oooO00o.f22768OooO = 4;
                        objOooO0OO = loadLogic.OooO00o(obj3, oooO00o);
                        if (objOooO0OO == coroutine_suspended) {
                            obj4 = obj3;
                            return coroutine_suspended;
                        }
                        obj4 = obj3;
                        obj5 = obj4;
                        if (objOooO0OO != null) {
                            oooO00o.f22769OooO0Oo = loadLogic;
                            oooO00o.f22771OooO0o0 = obj5;
                            oooO00o.f22770OooO0o = objOooO0OO;
                            oooO00o.f22768OooO = 5;
                            if (loadLogic.OooO0o(obj5, objOooO0OO) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj6 = objOooO0OO;
                            obj7 = obj5;
                            oooO00o.f22769OooO0Oo = obj6;
                            oooO00o.f22771OooO0o0 = null;
                            oooO00o.f22770OooO0o = null;
                            oooO00o.f22768OooO = 6;
                            if (loadLogic.OooO0o0(obj7, obj6) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return obj6;
                        }
                    }
                } else {
                    obj3 = obj;
                    if (loadLevel.getLevel() > 2) {
                        oooO00o.f22769OooO0Oo = loadLogic;
                        oooO00o.f22771OooO0o0 = obj3;
                        oooO00o.f22770OooO0o = null;
                        oooO00o.f22768OooO = 4;
                        objOooO0OO = loadLogic.OooO00o(obj3, oooO00o);
                        if (objOooO0OO == coroutine_suspended) {
                            obj4 = obj3;
                            return coroutine_suspended;
                        }
                        obj4 = obj3;
                        obj5 = obj4;
                        if (objOooO0OO != null) {
                            oooO00o.f22769OooO0Oo = loadLogic;
                            oooO00o.f22771OooO0o0 = obj5;
                            oooO00o.f22770OooO0o = objOooO0OO;
                            oooO00o.f22768OooO = 5;
                            if (loadLogic.OooO0o(obj5, objOooO0OO) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj6 = objOooO0OO;
                            obj7 = obj5;
                            oooO00o.f22769OooO0Oo = obj6;
                            oooO00o.f22771OooO0o0 = null;
                            oooO00o.f22770OooO0o = null;
                            oooO00o.f22768OooO = 6;
                            if (loadLogic.OooO0o0(obj7, obj6) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return obj6;
                        }
                    }
                }
                return null;
            case 1:
                loadLevel = (LoadLevel) oooO00o.f22770OooO0o;
                Object obj9 = oooO00o.f22771OooO0o0;
                loadLogic = (LoadLogic) oooO00o.f22769OooO0Oo;
                ResultKt.throwOnFailure(objOooO0OO);
                obj = obj9;
                if (objOooO0OO != null) {
                    obj = str;
                    return objOooO0OO;
                }
                obj = str;
                if (loadLevel.getLevel() > 1) {
                    oooO00o.f22769OooO0Oo = loadLogic;
                    oooO00o.f22771OooO0o0 = obj;
                    oooO00o.f22770OooO0o = loadLevel;
                    oooO00o.f22768OooO = 2;
                    objOooO0OO = loadLogic.OooO0Oo(obj, oooO00o);
                    if (objOooO0OO == coroutine_suspended) {
                        obj3 = obj;
                        return coroutine_suspended;
                    }
                    LoadLevel loadLevel4 = loadLevel;
                    obj2 = obj;
                    loadLevel2 = loadLevel4;
                    if (objOooO0OO != null) {
                        obj3 = obj;
                        oooO00o.f22769OooO0Oo = objOooO0OO;
                        oooO00o.f22771OooO0o0 = null;
                        oooO00o.f22770OooO0o = null;
                        oooO00o.f22768OooO = 3;
                        if (loadLogic.OooO0o(obj2, objOooO0OO) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return objOooO0OO;
                    }
                    obj3 = obj;
                    Object obj10 = obj2;
                    loadLevel = loadLevel2;
                    obj3 = obj10;
                    obj3 = obj;
                    if (loadLevel.getLevel() > 2) {
                        oooO00o.f22769OooO0Oo = loadLogic;
                        oooO00o.f22771OooO0o0 = obj3;
                        oooO00o.f22770OooO0o = null;
                        oooO00o.f22768OooO = 4;
                        objOooO0OO = loadLogic.OooO00o(obj3, oooO00o);
                        if (objOooO0OO == coroutine_suspended) {
                            obj4 = obj3;
                            return coroutine_suspended;
                        }
                        obj4 = obj3;
                        obj5 = obj4;
                        if (objOooO0OO != null) {
                            oooO00o.f22769OooO0Oo = loadLogic;
                            oooO00o.f22771OooO0o0 = obj5;
                            oooO00o.f22770OooO0o = objOooO0OO;
                            oooO00o.f22768OooO = 5;
                            if (loadLogic.OooO0o(obj5, objOooO0OO) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj6 = objOooO0OO;
                            obj7 = obj5;
                            oooO00o.f22769OooO0Oo = obj6;
                            oooO00o.f22771OooO0o0 = null;
                            oooO00o.f22770OooO0o = null;
                            oooO00o.f22768OooO = 6;
                            if (loadLogic.OooO0o0(obj7, obj6) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return obj6;
                        }
                    }
                } else {
                    obj3 = obj;
                    if (loadLevel.getLevel() > 2) {
                        oooO00o.f22769OooO0Oo = loadLogic;
                        oooO00o.f22771OooO0o0 = obj3;
                        oooO00o.f22770OooO0o = null;
                        oooO00o.f22768OooO = 4;
                        objOooO0OO = loadLogic.OooO00o(obj3, oooO00o);
                        if (objOooO0OO == coroutine_suspended) {
                            obj4 = obj3;
                            return coroutine_suspended;
                        }
                        obj4 = obj3;
                        obj5 = obj4;
                        if (objOooO0OO != null) {
                            oooO00o.f22769OooO0Oo = loadLogic;
                            oooO00o.f22771OooO0o0 = obj5;
                            oooO00o.f22770OooO0o = objOooO0OO;
                            oooO00o.f22768OooO = 5;
                            if (loadLogic.OooO0o(obj5, objOooO0OO) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj6 = objOooO0OO;
                            obj7 = obj5;
                            oooO00o.f22769OooO0Oo = obj6;
                            oooO00o.f22771OooO0o0 = null;
                            oooO00o.f22770OooO0o = null;
                            oooO00o.f22768OooO = 6;
                            if (loadLogic.OooO0o0(obj7, obj6) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return obj6;
                        }
                    }
                }
                return null;
            case 2:
                loadLevel2 = (LoadLevel) oooO00o.f22770OooO0o;
                Object obj11 = oooO00o.f22771OooO0o0;
                loadLogic = (LoadLogic) oooO00o.f22769OooO0Oo;
                ResultKt.throwOnFailure(objOooO0OO);
                obj2 = obj11;
                if (objOooO0OO != null) {
                    obj3 = obj;
                    oooO00o.f22769OooO0Oo = objOooO0OO;
                    oooO00o.f22771OooO0o0 = null;
                    oooO00o.f22770OooO0o = null;
                    oooO00o.f22768OooO = 3;
                    if (loadLogic.OooO0o(obj2, objOooO0OO) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objOooO0OO;
                }
                obj3 = obj;
                Object obj12 = obj2;
                loadLevel = loadLevel2;
                obj3 = obj12;
                obj3 = obj;
                if (loadLevel.getLevel() > 2) {
                    oooO00o.f22769OooO0Oo = loadLogic;
                    oooO00o.f22771OooO0o0 = obj3;
                    oooO00o.f22770OooO0o = null;
                    oooO00o.f22768OooO = 4;
                    objOooO0OO = loadLogic.OooO00o(obj3, oooO00o);
                    if (objOooO0OO == coroutine_suspended) {
                        obj4 = obj3;
                        return coroutine_suspended;
                    }
                    obj4 = obj3;
                    obj5 = obj4;
                    if (objOooO0OO != null) {
                        oooO00o.f22769OooO0Oo = loadLogic;
                        oooO00o.f22771OooO0o0 = obj5;
                        oooO00o.f22770OooO0o = objOooO0OO;
                        oooO00o.f22768OooO = 5;
                        if (loadLogic.OooO0o(obj5, objOooO0OO) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj6 = objOooO0OO;
                        obj7 = obj5;
                        oooO00o.f22769OooO0Oo = obj6;
                        oooO00o.f22771OooO0o0 = null;
                        oooO00o.f22770OooO0o = null;
                        oooO00o.f22768OooO = 6;
                        if (loadLogic.OooO0o0(obj7, obj6) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return obj6;
                    }
                }
                return null;
            case 3:
                Object obj13 = oooO00o.f22769OooO0Oo;
                ResultKt.throwOnFailure(objOooO0OO);
                return obj13;
            case 4:
                Object obj14 = oooO00o.f22771OooO0o0;
                LoadLogic<K, T> loadLogic2 = (LoadLogic) oooO00o.f22769OooO0Oo;
                ResultKt.throwOnFailure(objOooO0OO);
                loadLogic = loadLogic2;
                obj4 = obj14;
                obj4 = obj3;
                obj5 = obj4;
                if (objOooO0OO != null) {
                    oooO00o.f22769OooO0Oo = loadLogic;
                    oooO00o.f22771OooO0o0 = obj5;
                    oooO00o.f22770OooO0o = objOooO0OO;
                    oooO00o.f22768OooO = 5;
                    if (loadLogic.OooO0o(obj5, objOooO0OO) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj6 = objOooO0OO;
                    obj7 = obj5;
                    oooO00o.f22769OooO0Oo = obj6;
                    oooO00o.f22771OooO0o0 = null;
                    oooO00o.f22770OooO0o = null;
                    oooO00o.f22768OooO = 6;
                    if (loadLogic.OooO0o0(obj7, obj6) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return obj6;
                }
                return null;
            case 5:
                obj6 = oooO00o.f22770OooO0o;
                Object obj15 = oooO00o.f22771OooO0o0;
                loadLogic = (LoadLogic) oooO00o.f22769OooO0Oo;
                ResultKt.throwOnFailure(objOooO0OO);
                obj7 = obj15;
                oooO00o.f22769OooO0Oo = obj6;
                oooO00o.f22771OooO0o0 = null;
                oooO00o.f22770OooO0o = null;
                oooO00o.f22768OooO = 6;
                if (loadLogic.OooO0o0(obj7, obj6) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return obj6;
            case 6:
                Object obj16 = oooO00o.f22769OooO0Oo;
                ResultKt.throwOnFailure(objOooO0OO);
                return obj16;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Nullable
    public abstract Object OooO0OO(String str);

    @Nullable
    public abstract Object OooO0Oo(Object obj, @NotNull OooO00o oooO00o);

    @Nullable
    public abstract Unit OooO0o(Object obj, Object obj2);

    @Nullable
    public abstract Unit OooO0o0(Object obj, Object obj2);
}
