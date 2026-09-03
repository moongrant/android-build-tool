package p193o00o0O00;

import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.fragment.app.FragmentActivity;
import com.android.billingclient.api.o000000;
import com.yalantis.ucrop.UCropActivity;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import o000O000.OooO00o;
import p204o00o0o00.o00Oo0;
import p204o00o0o00.o00Ooo;
import p206o00o0o0o.o000Oo0;
import p400o0Oo0O.OooO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO {
    public static void OooO00o(final Activity activity, final Uri uri, float f, float f2, final o00Ooo o00ooo2) {
        String mimeTypeFromExtension;
        if (uri == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("UCrop.CompressionQuality", 90);
        bundle.putBoolean("UCrop.rotate", false);
        bundle.putBoolean("UCrop.scale", false);
        bundle.putBoolean("UCrop.ShowCropGrid", false);
        bundle.putBoolean("UCrop.ShowCropFrame", true);
        bundle.putBoolean("UCrop.CircleDimmedLayer", false);
        bundle.putBoolean("UCrop.FreeStyleCrop", false);
        bundle.putBoolean("UCrop.HideBottomControls", true);
        bundle.putString("UCrop.RenameCropFileName", System.currentTimeMillis() + ".jpg");
        final o0OoOo0 o0oooo1 = OooOo.f33128OooO0Oo;
        Point point = o0oooo1.f33161OooOOoo;
        if (point != null) {
            float f3 = point.x;
            float f4 = point.y;
            bundle.putFloat("UCrop.AspectRatioX", f3);
            bundle.putFloat("UCrop.AspectRatioY", f4);
        }
        if (f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && f2 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            bundle.putFloat("UCrop.AspectRatioX", f);
            bundle.putFloat("UCrop.AspectRatioY", f2);
        }
        bundle.putInt("UCrop.UcropRootViewBackgroundColor", o0oooo1.f33159OooOOo);
        bundle.putInt("UCrop.CropFrameColor", o0oooo1.f33158OooOOOo);
        bundle.putInt("UCrop.CropGridColor", o0oooo1.f33160OooOOo0);
        bundle.putInt("UCrop.DimmedLayerColor", OooO00o.OooO0O0(activity, OooO.select_picture_color_0b000000));
        if ("content".equals(uri.getScheme())) {
            mimeTypeFromExtension = activity.getContentResolver().getType(uri);
        } else {
            mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()).toLowerCase());
        }
        if (TextUtils.isEmpty(mimeTypeFromExtension)) {
            mimeTypeFromExtension = "image/jpeg";
        }
        mimeTypeFromExtension.replace("image/", ".");
        final Uri uriOooO00o = o000Oo0.OooO00o(activity);
        Intent intent = new Intent();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("UCrop.InputUri", uri);
        bundle2.putParcelable("UCrop.OutputUri", uriOooO00o);
        bundle2.putAll(bundle);
        o00Oo0 o00oo1 = new o00Oo0((FragmentActivity) activity);
        intent.setClass(activity, UCropActivity.class);
        intent.putExtras(bundle2);
        o00oo1.f33244OooO0OO = intent;
        o00oo1.OooO00o(new o00Ooo() { // from class: o00o0O00.OooOOO0
            @Override // p204o00o0o00.o00Ooo
            public final void onActivityResult(int i, Intent intent2) {
                o00Ooo o00ooo3 = o00ooo2;
                Activity activity2 = activity;
                Uri uri2 = uri;
                o0OoOo0 o0oooo2 = o0oooo1;
                Uri uri3 = uriOooO00o;
                if (i != -1 || intent2 == null) {
                    try {
                        p454o0Ooo0.OooOOO0.OooO00o(activity2, uri3);
                        return;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                }
                if (o00ooo3 != null) {
                    Uri uri4 = (Uri) intent2.getParcelableExtra("UCrop.OutputUri");
                    String strOooO0O0 = o000Oo0.OooO0O0(activity2, uri2);
                    String strOooO0O1 = o000Oo0.OooO0O0(activity2, uri4);
                    BitmapFactory.Options optionsOooO0OO = p454o0Ooo0.OooO.OooO0OO(activity2, strOooO0O0);
                    BitmapFactory.Options optionsOooO0OO2 = p454o0Ooo0.OooO.OooO0OO(activity2, strOooO0O1);
                    intent2.setAction(null);
                    intent2.setData(uri4);
                    if (o0oooo2.f33169OooOoOO && optionsOooO0OO.outHeight == optionsOooO0OO2.outHeight && optionsOooO0OO.outWidth == optionsOooO0OO2.outWidth) {
                        p454o0Ooo0.OooOOO0.OooO00o(activity2, uri4);
                        intent2.setData(uri2);
                    }
                    o000000.OooO0O0(activity2, o000Oo0.OooO0O0(activity2, uri4));
                    o00ooo3.onActivityResult(i, intent2);
                }
            }
        });
    }
}
