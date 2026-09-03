package p193o00o0O00;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.app.selectPicture.activity.AllImagesActivity;
import com.app.selectPicture.model.SelectImageData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p204o00o0o00.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Oooo0 f33130OooO00o = new Oooo0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static Function1<? super SelectImageData, Unit> f33131OooO0O0;

    public final void OooO00o(@NotNull o000oOoO config, @Nullable Function1<? super SelectImageData, Unit> function1) {
        Intrinsics.checkNotNullParameter(config, "config");
        f33131OooO0O0 = function1;
        int i = AllImagesActivity.f12251ooOO;
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("MaxCount", config.f33135OooO0O0);
            bundle.putBoolean("IsTakePhoto", config.f33136OooO0OO);
            bundle.putBoolean("IsClipPhoto", config.f33137OooO0Oo);
            bundle.putFloat("ClipWidthRatio", config.f33139OooO0o0);
            bundle.putFloat("ClipHeightRatio", config.f33138OooO0o);
            bundle.putBoolean("IsSupportGif", config.f33140OooO0oO);
            bundle.putBoolean("IsSupportGifClip", config.f33141OooO0oo);
            bundle.putParcelable("selectData", config.f33142OooOO0);
            bundle.putBoolean("clipType", config.f33133OooO);
            o00Oo0 o00oo1 = new o00Oo0(config.f33134OooO00o);
            o00oo1.f33243OooO0O0 = AllImagesActivity.class;
            o00oo1.f33245OooO0Oo = new Bundle(bundle);
            o00oo1.OooO00o(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void OooO0O0(@NotNull FragmentActivity activity, float f, float f2, boolean z, boolean z2, @Nullable Function1 function1) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        SelectImageData selectImageData = new SelectImageData();
        Intrinsics.checkNotNullParameter(activity, "activity");
        o000oOoO o000oooo2 = new o000oOoO(activity);
        o000oooo2.f33135OooO0O0 = 1;
        o000oooo2.f33136OooO0OO = true;
        o000oooo2.f33137OooO0Oo = true;
        o000oooo2.f33133OooO = false;
        o000oooo2.f33139OooO0o0 = f;
        o000oooo2.f33138OooO0o = f2;
        o000oooo2.f33140OooO0oO = z;
        o000oooo2.f33141OooO0oo = z2;
        o000oooo2.f33142OooOO0 = selectImageData;
        OooO00o(o000oooo2, function1);
    }

    public final void OooO0OO(@NotNull FragmentActivity activity, boolean z, @Nullable Function1 function1) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        SelectImageData selectImageData = new SelectImageData();
        Intrinsics.checkNotNullParameter(activity, "activity");
        o000oOoO o000oooo2 = new o000oOoO(activity);
        o000oooo2.f33135OooO0O0 = 1;
        o000oooo2.f33136OooO0OO = true;
        o000oooo2.f33137OooO0Oo = false;
        o000oooo2.f33133OooO = false;
        o000oooo2.f33139OooO0o0 = 1.0f;
        o000oooo2.f33138OooO0o = 1.0f;
        o000oooo2.f33140OooO0oO = z;
        o000oooo2.f33141OooO0oo = false;
        o000oooo2.f33142OooOO0 = selectImageData;
        OooO00o(o000oooo2, function1);
    }
}
