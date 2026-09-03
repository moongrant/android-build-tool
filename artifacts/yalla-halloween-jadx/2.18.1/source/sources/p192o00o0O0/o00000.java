package p192o00o0O0;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.app.selectPicture.activity.AllImagesActivity;
import com.app.selectPicture.model.ImageModel;
import com.app.selectPicture.model.SelectImageData;
import java.io.OutputStream;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p193o00o0O00.OooOO0;
import p193o00o0O00.OooOOO;
import p193o00o0O00.OooOo;
import p193o00o0O00.Oooo0;
import p199o00o0Oo.o00O00;
import p200o00o0Oo0.o0000O00;
import p204o00o0o00.o00Ooo;
import p206o00o0o0o.o000O0o;
import p206o00o0o0o.o000Oo0;
import p400o0Oo0O.OooOOOO;
import p458o0Ooo00o.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class o00000 implements o00O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ AllImagesActivity f33081OooO00o;

    public o00000(AllImagesActivity allImagesActivity) {
        this.f33081OooO00o = allImagesActivity;
    }

    public final void OooO00o(final Activity activity, final ImageModel imageModel) {
        AllImagesActivity allImagesActivity = this.f33081OooO00o;
        Objects.requireNonNull(allImagesActivity);
        if (!OooOO0.OooO0O0(allImagesActivity, imageModel.f12326o000oOoO)) {
            o0000O00 o0000o00OooO0O0 = OooOo.OooO0O0();
            AllImagesActivity allImagesActivity2 = this.f33081OooO00o;
            Objects.requireNonNull(allImagesActivity2);
            o0000o00OooO0O0.OooO00o(allImagesActivity2.getString(OooOOOO.select_picture_string_is_not_image_file_format));
            return;
        }
        if (this.f33081OooO00o.f12272OoooooO) {
            Intent intent = new Intent();
            SelectImageData selectImageData = new SelectImageData();
            selectImageData.OooO0OO(imageModel.f12326o000oOoO);
            intent.putExtra("selectData", selectImageData);
            this.f33081OooO00o.setResult(-1, intent);
            Function1<? super SelectImageData, Unit> function1 = Oooo0.f33131OooO0O0;
            if (function1 != null) {
                function1.invoke(selectImageData);
            }
            Oooo0.f33131OooO0O0 = null;
            this.f33081OooO00o.finish();
            return;
        }
        if (imageModel.OooO0O0()) {
            AllImagesActivity allImagesActivity3 = this.f33081OooO00o;
            if (allImagesActivity3.f12256OoooO0) {
                if (allImagesActivity3.f12252Oooo == 1 && allImagesActivity3.f12271Oooooo0) {
                    Objects.requireNonNull(allImagesActivity3);
                    final Uri uriOooO00o = o000Oo0.OooO00o(allImagesActivity3);
                    AllImagesActivity allImagesActivity4 = this.f33081OooO00o;
                    Objects.requireNonNull(allImagesActivity4);
                    new o000OOo(allImagesActivity4, new Function1() { // from class: o00o0O0.o0Oo0oo
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            final o00000 o00000Var = this.f33102Oooo0o;
                            Uri uri = uriOooO00o;
                            Activity activity2 = activity;
                            ImageModel imageModel2 = imageModel;
                            o000O0o.OooO00o[] oooO00oArr = (o000O0o.OooO00o[]) obj;
                            Objects.requireNonNull(o00000Var);
                            if (oooO00oArr == null || oooO00oArr.length <= 0) {
                                SelectImageData selectImageData2 = new SelectImageData();
                                selectImageData2.OooO0OO(imageModel2.f12326o000oOoO);
                                Function1<? super SelectImageData, Unit> function2 = Oooo0.f33131OooO0O0;
                                if (function2 != null) {
                                    function2.invoke(selectImageData2);
                                }
                                Oooo0.f33131OooO0O0 = null;
                                o00000Var.f33081OooO00o.finish();
                            } else {
                                AllImagesActivity allImagesActivity5 = o00000Var.f33081OooO00o;
                                Objects.requireNonNull(allImagesActivity5);
                                boolean z = false;
                                Bitmap bitmap = oooO00oArr[0].f33291OooO00o;
                                if (bitmap != null && uri != null) {
                                    try {
                                        OutputStream outputStreamOpenOutputStream = allImagesActivity5.getContentResolver().openOutputStream(uri);
                                        if (outputStreamOpenOutputStream != null) {
                                            bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStreamOpenOutputStream);
                                            outputStreamOpenOutputStream.flush();
                                            outputStreamOpenOutputStream.close();
                                            z = true;
                                        }
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                                if (z) {
                                    AllImagesActivity allImagesActivity6 = o00000Var.f33081OooO00o;
                                    OooOOO.OooO00o(activity2, uri, allImagesActivity6.f12258OoooO0O, allImagesActivity6.f12255OoooO, new o00Ooo() { // from class: o00o0O0.o0O0O00
                                        @Override // p204o00o0o00.o00Ooo
                                        public final void onActivityResult(int i, Intent intent2) {
                                            o00000 o00000Var2 = o00000Var;
                                            Objects.requireNonNull(o00000Var2);
                                            if (i != -1 || intent2 == null) {
                                                return;
                                            }
                                            try {
                                                SelectImageData selectImageData3 = new SelectImageData();
                                                selectImageData3.OooO0OO(intent2.getData());
                                                intent2.putExtra("selectData", selectImageData3);
                                                o00000Var2.f33081OooO00o.setResult(i, intent2);
                                                Function1<? super SelectImageData, Unit> function3 = Oooo0.f33131OooO0O0;
                                                if (function3 != null) {
                                                    function3.invoke(selectImageData3);
                                                }
                                                Oooo0.f33131OooO0O0 = null;
                                                o00000Var2.f33081OooO00o.finish();
                                            } catch (Exception e2) {
                                                e2.printStackTrace();
                                            }
                                        }
                                    });
                                }
                            }
                            return null;
                        }
                    }).execute(imageModel.f12326o000oOoO);
                    return;
                }
                SelectImageData selectImageData2 = new SelectImageData();
                selectImageData2.OooO0OO(imageModel.f12326o000oOoO);
                Function1<? super SelectImageData, Unit> function2 = Oooo0.f33131OooO0O0;
                if (function2 != null) {
                    function2.invoke(selectImageData2);
                }
                Oooo0.f33131OooO0O0 = null;
                this.f33081OooO00o.finish();
                return;
            }
        }
        Uri uri = imageModel.f12326o000oOoO;
        AllImagesActivity allImagesActivity5 = this.f33081OooO00o;
        OooOOO.OooO00o(activity, uri, allImagesActivity5.f12258OoooO0O, allImagesActivity5.f12255OoooO, new o00Ooo() { // from class: o00o0O0.o000OOo
            @Override // p204o00o0o00.o00Ooo
            public final void onActivityResult(int i, Intent intent2) {
                o00000 o00000Var = this.f33095OooO00o;
                Objects.requireNonNull(o00000Var);
                if (i != -1 || intent2 == null) {
                    return;
                }
                try {
                    SelectImageData selectImageData3 = new SelectImageData();
                    selectImageData3.OooO0OO(intent2.getData());
                    intent2.putExtra("selectData", selectImageData3);
                    o00000Var.f33081OooO00o.setResult(i, intent2);
                    Function1<? super SelectImageData, Unit> function3 = Oooo0.f33131OooO0O0;
                    if (function3 != null) {
                        function3.invoke(selectImageData3);
                    }
                    Oooo0.f33131OooO0O0 = null;
                    o00000Var.f33081OooO00o.finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
