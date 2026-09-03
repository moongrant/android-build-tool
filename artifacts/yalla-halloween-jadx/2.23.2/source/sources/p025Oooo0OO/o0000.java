package p025Oooo0OO;

import android.os.Build;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.facebook.appevents.AppEventsConstants;
import com.youth.banner.config.BannerConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p024Oooo0O0.o000;
import p024Oooo0O0.o0000O;
import p024Oooo0O0.o000OO;
import p028Oooo0oO.o00O0O0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000 f1030OooO00o = (o000) o000OO.OooO00o(o000.class);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo f1031OooO0O0;

    public o0000(@NonNull String str) {
        this.f1031OooO0O0 = new o000OOo(str);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0073  */
    @NonNull
    public final Size[] OooO00o(@NonNull Size[] sizeArr, int i) {
        List listEmptyList;
        ArrayList arrayList;
        ArrayList arrayList2;
        Size[] sizeArr2;
        ArrayList arrayList3 = new ArrayList(Arrays.asList(sizeArr));
        if (this.f1030OooO00o != null) {
            if (i != 34) {
                sizeArr2 = new Size[0];
            } else {
                if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) {
                    sizeArr2 = new Size[]{new Size(1920, 1080), new Size(1440, 1080), new Size(1280, 720), new Size(960, 720), new Size(864, 480), new Size(720, 480)};
                } else {
                    sizeArr2 = new Size[0];
                }
            }
            if (sizeArr2.length > 0) {
                arrayList3.addAll(Arrays.asList(sizeArr2));
            }
        }
        o000OOo o000ooo2 = this.f1031OooO0O0;
        o000ooo2.getClass();
        if (((o0000O) o000OO.OooO00o(o0000O.class)) == null) {
            listEmptyList = new ArrayList();
        } else {
            String str = Build.BRAND;
            boolean z = "OnePlus".equalsIgnoreCase(str) && "OnePlus6".equalsIgnoreCase(Build.DEVICE);
            String str2 = o000ooo2.f1056OooO00o;
            if (z) {
                arrayList2 = new ArrayList();
                if (str2.equals(AppEventsConstants.EVENT_PARAM_VALUE_NO) && i == 256) {
                    arrayList2.add(new Size(4160, 3120));
                    arrayList2.add(new Size(4000, BannerConfig.LOOP_TIME));
                }
            } else {
                if ("OnePlus".equalsIgnoreCase(str) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList2 = new ArrayList();
                    if (str2.equals(AppEventsConstants.EVENT_PARAM_VALUE_NO) && i == 256) {
                        arrayList2.add(new Size(4160, 3120));
                        arrayList2.add(new Size(4000, BannerConfig.LOOP_TIME));
                    }
                } else {
                    if ("HUAWEI".equalsIgnoreCase(str) && "HWANE".equalsIgnoreCase(Build.DEVICE)) {
                        arrayList = new ArrayList();
                        if (str2.equals(AppEventsConstants.EVENT_PARAM_VALUE_NO) && (i == 34 || i == 35)) {
                            arrayList.add(new Size(720, 720));
                            arrayList.add(new Size(400, 400));
                        }
                    } else if (o0000O.OooO0o0()) {
                        arrayList = new ArrayList();
                        if (str2.equals(AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
                            if (i == 34) {
                                arrayList.add(new Size(4128, 3096));
                                arrayList.add(new Size(4128, 2322));
                                arrayList.add(new Size(3088, 3088));
                                arrayList.add(new Size(3264, 2448));
                                arrayList.add(new Size(3264, 1836));
                                arrayList.add(new Size(2048, 1536));
                                arrayList.add(new Size(2048, 1152));
                                arrayList.add(new Size(1920, 1080));
                            } else if (i == 35) {
                                arrayList.add(new Size(4128, 2322));
                                arrayList.add(new Size(3088, 3088));
                                arrayList.add(new Size(3264, 2448));
                                arrayList.add(new Size(3264, 1836));
                                arrayList.add(new Size(2048, 1536));
                                arrayList.add(new Size(2048, 1152));
                                arrayList.add(new Size(1920, 1080));
                            }
                        } else if (str2.equals("1") && (i == 34 || i == 35)) {
                            arrayList.add(new Size(3264, 2448));
                            arrayList.add(new Size(3264, 1836));
                            arrayList.add(new Size(2448, 2448));
                            arrayList.add(new Size(1920, 1920));
                            arrayList.add(new Size(2048, 1536));
                            arrayList.add(new Size(2048, 1152));
                            arrayList.add(new Size(1920, 1080));
                        }
                    } else if (o0000O.OooO0Oo()) {
                        arrayList = new ArrayList();
                        if (str2.equals(AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
                            if (i == 34) {
                                arrayList.add(new Size(4128, 3096));
                                arrayList.add(new Size(4128, 2322));
                                arrayList.add(new Size(3088, 3088));
                                arrayList.add(new Size(3264, 2448));
                                arrayList.add(new Size(3264, 1836));
                                arrayList.add(new Size(2048, 1536));
                                arrayList.add(new Size(2048, 1152));
                                arrayList.add(new Size(1920, 1080));
                            } else if (i == 35) {
                                arrayList.add(new Size(2048, 1536));
                                arrayList.add(new Size(2048, 1152));
                                arrayList.add(new Size(1920, 1080));
                            }
                        } else if (str2.equals("1") && (i == 34 || i == 35)) {
                            arrayList.add(new Size(2576, 1932));
                            arrayList.add(new Size(2560, 1440));
                            arrayList.add(new Size(1920, 1920));
                            arrayList.add(new Size(2048, 1536));
                            arrayList.add(new Size(2048, 1152));
                            arrayList.add(new Size(1920, 1080));
                        }
                    } else {
                        o00O0O0.OooO0oo("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
                        listEmptyList = Collections.emptyList();
                    }
                    listEmptyList = arrayList;
                }
            }
            listEmptyList = arrayList2;
        }
        if (!listEmptyList.isEmpty()) {
            arrayList3.removeAll(listEmptyList);
        }
        if (arrayList3.isEmpty()) {
            o00O0O0.OooO0oo("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) arrayList3.toArray(new Size[0]);
    }
}
