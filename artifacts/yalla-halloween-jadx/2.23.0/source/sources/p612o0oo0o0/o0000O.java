package p612o0oo0o0;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.MotionEvent;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yy.yyeva.mix.EvaSrc;
import com.yy.yyeva.mix.OooO00o;
import com.yy.yyeva.mix.OooO0O0;
import com.yy.yyeva.mix.OooO0OO;
import com.yy.yyeva.mix.OooO0o;
import com.yy.yyeva.util.EvaJniUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p607o0oo0OOo.k1;
import p607o0oo0OOo.m1;
import p610o0oo0Ooo.r1;
import p613o0oo0o00.OooOO0O;
import p613o0oo0o00.OooOOO0;
import p614o0oo0o0O.o000OO0O;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nEvaAnimPluginManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EvaAnimPluginManager.kt\ncom/yy/yyeva/plugin/EvaAnimPluginManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,107:1\n1855#2,2:108\n1855#2,2:110\n1855#2,2:112\n1855#2,2:114\n1855#2,2:116\n1855#2,2:118\n1855#2,2:120\n*S KotlinDebug\n*F\n+ 1 EvaAnimPluginManager.kt\ncom/yy/yyeva/plugin/EvaAnimPluginManager\n*L\n36#1:108,2\n49#1:110,2\n57#1:112,2\n81#1:114,2\n89#1:116,2\n96#1:118,2\n102#1:120,2\n*E\n"})
public final class o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final m1 f57008OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooO00o f57009OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final List<OooO00o> f57010OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f57011OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f57012OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f57013OooO0o0;

    public o0000O(@NotNull m1 playerEva) {
        Intrinsics.checkNotNullParameter(playerEva, "playerEva");
        this.f57008OooO00o = playerEva;
        OooO00o oooO00o = new OooO00o(playerEva);
        this.f57009OooO0O0 = oooO00o;
        this.f57010OooO0OO = CollectionsKt.listOf(oooO00o);
    }

    public final int OooO00o(@NotNull k1 config) {
        int i;
        boolean z;
        HashMap<String, EvaSrc> map;
        Collection<EvaSrc> collectionValues;
        HashMap<String, EvaSrc> map2;
        Collection<EvaSrc> collectionValues2;
        HashMap<String, EvaSrc> map3;
        Collection<EvaSrc> collectionValues3;
        HashMap<String, EvaSrc> map4;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimPluginManager", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onConfigCreateEva", "msg");
        Iterator<T> it = this.f57010OooO0OO.iterator();
        do {
            i = 0;
            if (!it.hasNext()) {
                return 0;
            }
            OooO00o oooO00o = (OooO00o) it.next();
            oooO00o.getClass();
            Intrinsics.checkNotNullParameter(config, "config");
            if (config.f56914OooOO0) {
                if (oooO00o.f32960OooO0O0 != null) {
                    ArrayList arrayList = config.f56909OooO0Oo;
                    if (arrayList != null) {
                        oooO00o.f32961OooO0OO = new OooO0o(arrayList);
                    }
                    ArrayList datas = config.f56911OooO0o0;
                    if (datas != null) {
                        Intrinsics.checkNotNullParameter(datas, "datas");
                        SparseArray sparseArray = new SparseArray();
                        Iterator it2 = datas.iterator();
                        while (it2.hasNext()) {
                            OooOO0O oooOO0O = new OooOO0O((k1.OooO0O0) it2.next());
                            sparseArray.put(oooOO0O.f57014OooO00o, oooOO0O);
                        }
                    }
                    oooO00o.f32959OooO00o.f56944OooO0O0 = EvaJniUtil.f32972OooO00o.mixConfigCreate(oooO00o.f32959OooO00o.f56944OooO0O0, String.valueOf(config.f56905OooO));
                    synchronized (oooO00o.f32963OooO0o) {
                        oooO00o.f32965OooO0oO = false;
                        Unit unit = Unit.INSTANCE;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    OooO0o oooO0o = oooO00o.f32961OooO0OO;
                    int size = (oooO0o == null || (map4 = oooO0o.f32971OooO00o) == null) ? 0 : map4.size();
                    String msg = "load resource totalSrc = " + size;
                    Intrinsics.checkNotNullParameter("EvaAnimPlayer.MixAnimPlugin", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter(msg, "msg");
                    oooO00o.f32962OooO0Oo = 0;
                    OooO0o oooO0o2 = oooO00o.f32961OooO0OO;
                    if (oooO0o2 != null && (map3 = oooO0o2.f32971OooO00o) != null && (collectionValues3 = map3.values()) != null) {
                        for (EvaSrc src : collectionValues3) {
                            EvaSrc.SrcType srcType = src.f32950OooO0Oo;
                            if (srcType == EvaSrc.SrcType.IMG) {
                                String msg2 = "fetch image " + src.f32947OooO00o;
                                Intrinsics.checkNotNullParameter("EvaAnimPlayer.MixAnimPlugin", ViewHierarchyConstants.TAG_KEY);
                                Intrinsics.checkNotNullParameter(msg2, "msg");
                                r1 r1Var = oooO00o.f32960OooO0O0;
                                if (r1Var != null) {
                                    Intrinsics.checkNotNullExpressionValue(src, "src");
                                    r1Var.setImage(new OooO0OO(src), new OooO0O0(src, oooO00o));
                                }
                            } else if (srcType == EvaSrc.SrcType.TXT) {
                                String msg3 = "fetch txt " + src.f32947OooO00o;
                                Intrinsics.checkNotNullParameter("EvaAnimPlayer.MixAnimPlugin", ViewHierarchyConstants.TAG_KEY);
                                Intrinsics.checkNotNullParameter(msg3, "msg");
                                r1 r1Var2 = oooO00o.f32960OooO0O0;
                                if (r1Var2 != null) {
                                    Intrinsics.checkNotNullExpressionValue(src, "src");
                                    r1Var2.setText(new OooO0OO(src), new OooOOO0(src, oooO00o));
                                }
                            }
                        }
                    }
                    synchronized (oooO00o.f32963OooO0o) {
                        while (oooO00o.f32962OooO0Oo < size && !oooO00o.f32965OooO0oO) {
                            oooO00o.f32963OooO0o.wait();
                        }
                        Unit unit2 = Unit.INSTANCE;
                    }
                    String msg4 = "setResourceSync cost=" + (SystemClock.elapsedRealtime() - jElapsedRealtime) + "ms";
                    Intrinsics.checkNotNullParameter("EvaAnimPlayer.MixAnimPlugin", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter(msg4, "msg");
                    try {
                        OooO0o oooO0o3 = oooO00o.f32961OooO0OO;
                        if (oooO0o3 != null && (map2 = oooO0o3.f32971OooO00o) != null && (collectionValues2 = map2.values()) != null) {
                            for (EvaSrc src2 : collectionValues2) {
                                if (src2.f32950OooO0Oo == EvaSrc.SrcType.TXT) {
                                    Intrinsics.checkNotNullExpressionValue(src2, "src");
                                    src2.f32954OooO0oo = o000OO0O.OooO00o(src2);
                                }
                            }
                        }
                        z = true;
                    } catch (OutOfMemoryError tr) {
                        String msg5 = "draw text OOM " + tr;
                        Intrinsics.checkNotNullParameter("EvaAnimPlayer.MixAnimPlugin", ViewHierarchyConstants.TAG_KEY);
                        Intrinsics.checkNotNullParameter(msg5, "msg");
                        Intrinsics.checkNotNullParameter(tr, "tr");
                        z = false;
                    }
                    if (!z) {
                        i = 10006;
                        break;
                    }
                    String msg6 = "load resource " + oooO00o.f32962OooO0Oo;
                    Intrinsics.checkNotNullParameter("EvaAnimPlayer.MixAnimPlugin", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter(msg6, "msg");
                    OooO0o oooO0o4 = oooO00o.f32961OooO0OO;
                    if (oooO0o4 != null && (map = oooO0o4.f32971OooO00o) != null && (collectionValues = map.values()) != null) {
                        for (EvaSrc evaSrc : collectionValues) {
                            Bitmap bitmap = evaSrc.f32954OooO0oo;
                            if (bitmap == null) {
                                String msg7 = "missing src " + evaSrc;
                                Intrinsics.checkNotNullParameter("EvaAnimPlayer.MixAnimPlugin", ViewHierarchyConstants.TAG_KEY);
                                Intrinsics.checkNotNullParameter(msg7, "msg");
                            } else if (bitmap.getConfig() == Bitmap.Config.ALPHA_8) {
                                String msg8 = "src " + evaSrc + " bitmap must not be ALPHA_8";
                                Intrinsics.checkNotNullParameter("EvaAnimPlayer.MixAnimPlugin", ViewHierarchyConstants.TAG_KEY);
                                Intrinsics.checkNotNullParameter(msg8, "msg");
                            }
                            i = 10006;
                            break;
                        }
                    }
                } else {
                    Intrinsics.checkNotNullParameter("EvaAnimPlayer.MixAnimPlugin", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter("IFetchResource is empty", "msg");
                }
            }
        } while (i == 0);
        return i;
    }

    public final void OooO0O0(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        Iterator<T> it = this.f57010OooO0OO.iterator();
        while (it.hasNext()) {
            ((OooO00o) it.next()).getClass();
            Intrinsics.checkNotNullParameter(ev, "ev");
            Intrinsics.checkNotNullParameter(ev, "ev");
        }
    }

    public final void OooO0OO() {
        HashMap<String, EvaSrc> map;
        Collection<EvaSrc> collectionValues;
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimPluginManager", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onRelease", "msg");
        for (OooO00o oooO00o : this.f57010OooO0OO) {
            k1 k1Var = oooO00o.f32959OooO00o.f56965OooOo0o.f56939OooO0O0;
            if (!((k1Var == null || k1Var.f56914OooOO0) ? false : true)) {
                ArrayList arrayList = new ArrayList();
                OooO0o oooO0o = oooO00o.f32961OooO0OO;
                if (oooO0o != null && (map = oooO0o.f32971OooO00o) != null && (collectionValues = map.values()) != null) {
                    for (EvaSrc src : collectionValues) {
                        Intrinsics.checkNotNullExpressionValue(src, "src");
                        arrayList.add(new OooO0OO(src));
                    }
                }
                r1 r1Var = oooO00o.f32960OooO0O0;
                if (r1Var != null) {
                    r1Var.releaseSrc(arrayList);
                }
            }
        }
    }

    public final void OooO0Oo() {
        k1 k1Var = this.f57008OooO00o.f56965OooOo0o.f56939OooO0O0;
        if ((k1Var == null || k1Var.f56914OooOO0) ? false : true) {
            return;
        }
        if (this.f57013OooO0o0 > this.f57011OooO0Oo + 1 || this.f57012OooO0o >= 4) {
            String msg = "jump frameIndex= " + this.f57011OooO0Oo + ",decodeIndex=" + this.f57013OooO0o0 + ",frameDiffTimes=" + this.f57012OooO0o;
            Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimPluginManager", ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter(msg, "msg");
            this.f57011OooO0Oo = this.f57013OooO0o0;
        }
        if (this.f57013OooO0o0 != this.f57011OooO0Oo) {
            this.f57012OooO0o++;
        } else {
            this.f57012OooO0o = 0;
        }
        String msg2 = "onRendering frameIndex=" + this.f57011OooO0Oo;
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimPluginManager", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg2, "msg");
        for (OooO00o oooO00o : this.f57010OooO0OO) {
            int i = this.f57011OooO0Oo;
            oooO00o.getClass();
            EvaJniUtil.f32972OooO00o.mixRendering(oooO00o.f32959OooO00o.f56944OooO0O0, i);
        }
        this.f57011OooO0Oo++;
    }
}
