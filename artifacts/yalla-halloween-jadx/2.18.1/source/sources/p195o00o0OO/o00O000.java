package p195o00o0OO;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.o000000;
import com.app.selectPicture.activity.AllImagesActivity;
import com.app.selectPicture.activity.ShowImagesSelectActivity;
import com.app.selectPicture.model.FileModel;
import com.app.selectPicture.model.ImageModel;
import com.app.selectPicture.model.SelectImageData;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p054o00000oo.o000OO00;
import p192o00o0O0.o00000;
import p192o00o0O0.o0OO00O;
import p193o00o0O00.OooOO0;
import p193o00o0O00.OooOo;
import p193o00o0O00.Oooo0;
import p199o00o0Oo.o00O00;
import p199o00o0Oo.o00O00O;
import p200o00o0Oo0.o00000OO;
import p200o00o0Oo0.o0000Ooo;
import p202o00o0Ooo.o00oOoo;
import p204o00o0o00.o00Oo0;
import p204o00o0o00.o00Ooo;
import p206o00o0o0o.o000O0O0;
import p206o00o0o0o.o000Oo0;
import p400o0Oo0O.OooOO0O;
import p400o0Oo0O.OooOOO;
import p400o0Oo0O.OooOOO0;
import p400o0Oo0O.OooOOOO;

/* JADX INFO: loaded from: classes.dex */
public final class o00O000 extends RecyclerView.Adapter<RecyclerView.oo0o0Oo> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Activity f33174OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f33176OooO0OO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o0000Ooo<ArrayList<ImageModel>, Integer> f33178OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f33179OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public FileModel f33180OooO0oO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f33182OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public o00O00 f33183OooOO0O;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ArrayList<ImageModel> f33175OooO0O0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f33181OooO0oo = false;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f33173OooO = false;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f33184OooOO0o = 3;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o00oOoo f33177OooO0Oo = new o00oOoo();

    public class OooO00o extends o00O00O {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public OooO0O0 f33185Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f33186OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public ImageModel f33187OoooO00;

        public OooO00o(OooO0O0 oooO0O0, ImageModel imageModel, int i) {
            super(200L);
            this.f33185Oooo = oooO0O0;
            this.f33187OoooO00 = imageModel;
            this.f33186OoooO0 = i;
        }

        @Override // p199o00o0Oo.o00O00O
        public final void OooO00o(View view) {
            int id = view.getId();
            if (id != OooOOO0.layout_all_image_iv_add) {
                if (id == OooOOO0.layout_all_image_tv_select || id == OooOOO0.layout_all_image_layout_select) {
                    if (o00O000.this.f33179OooO0o0 > 1) {
                        OooO0O0(this.f33185Oooo, this.f33187OoooO00, this.f33186OoooO0);
                        return;
                    } else {
                        OooO0OO();
                        return;
                    }
                }
                if (id == OooOOO0.layout_all_image_iv_covering || id == OooOOO0.layout_all_image_iv) {
                    OooO0OO();
                    return;
                }
                return;
            }
            o00O000 o00o001 = o00O000.this;
            if (!o00o001.f33176OooO0OO || this.f33186OoooO0 != 0) {
                OooO0O0(this.f33185Oooo, this.f33187OoooO00, this.f33186OoooO0);
                return;
            }
            int iOooO0o = o00o001.f33177OooO0Oo.OooO0o();
            o00O000 o00o002 = o00O000.this;
            if (iOooO0o >= o00o002.f33179OooO0o0) {
                OooOo.OooO0O0().OooO00o(o000OO00.OooO00o(o00O000.this.f33174OooO00o.getString(OooOOOO.select_picture_string_Select_a_maximum_of_xxx_photos), o00O000.this.f33179OooO0o0 + ""));
                return;
            }
            o00O00 o00o01 = o00o002.f33183OooOO0O;
            if (o00o01 != null) {
                final Activity activity = o00o002.f33174OooO00o;
                final boolean z = o00o002.f33182OooOO0;
                final o00000 o00000Var = (o00000) o00o01;
                AllImagesActivity allImagesActivity = o00000Var.f33081OooO00o;
                final o0OO00O o0oo00o2 = allImagesActivity.f12272OoooooO ? new o0OO00O(o00000Var, 0) : null;
                final float f = allImagesActivity.f12258OoooO0O;
                final float f2 = allImagesActivity.f12255OoooO;
                final o00Ooo o00ooo2 = new o00Ooo() { // from class: o00o0O0.o000000
                    @Override // p204o00o0o00.o00Ooo
                    public final void onActivityResult(int i, Intent intent) {
                        o00000 o00000Var2 = o00000Var;
                        Objects.requireNonNull(o00000Var2);
                        if (i != -1 || intent == null) {
                            return;
                        }
                        try {
                            if (intent.getData() == null || intent.getData().getPath() == null) {
                                return;
                            }
                            SelectImageData selectImageData = new SelectImageData();
                            AllImagesActivity allImagesActivity2 = o00000Var2.f33081OooO00o;
                            selectImageData.f12327Oooo0o = allImagesActivity2.OooOOOo(allImagesActivity2.f12263OoooOoO.OooO0OO(), intent.getData());
                            intent.putExtra("selectData", selectImageData);
                            o00000Var2.f33081OooO00o.setResult(i, intent);
                            Function1<? super SelectImageData, Unit> function1 = Oooo0.f33131OooO0O0;
                            if (function1 != null) {
                                function1.invoke(selectImageData);
                            }
                            Oooo0.f33131OooO0O0 = null;
                            o00000Var2.f33081OooO00o.finish();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                };
                final o00Ooo o00ooo3 = new o00Ooo() { // from class: o00o0O0.oo0o0Oo
                    @Override // p204o00o0o00.o00Ooo
                    public final void onActivityResult(int i, Intent intent) {
                        o00000 o00000Var2 = o00000Var;
                        Objects.requireNonNull(o00000Var2);
                        if (i != -1 || intent == null) {
                            return;
                        }
                        try {
                            SelectImageData selectImageData = new SelectImageData();
                            selectImageData.OooO0OO(intent.getData());
                            intent.putExtra("selectData", selectImageData);
                            o00000Var2.f33081OooO00o.setResult(i, intent);
                            Function1<? super SelectImageData, Unit> function1 = Oooo0.f33131OooO0O0;
                            if (function1 != null) {
                                function1.invoke(selectImageData);
                            }
                            Oooo0.f33131OooO0O0 = null;
                            o00000Var2.f33081OooO00o.finish();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                };
                PackageManager packageManager = activity.getPackageManager();
                if (((packageManager.hasSystemFeature("android.hardware.camera") || packageManager.hasSystemFeature("android.hardware.camera.front")) ? 1 : 0) == 0) {
                    return;
                }
                final Uri uriOooO00o = o000Oo0.OooO00o(activity);
                final String strOooO0O0 = o000Oo0.OooO0O0(activity, uriOooO00o);
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                intent.putExtra("output", uriOooO00o);
                intent.addFlags(2);
                intent.putExtra("android.intent.extra.videoQuality", 1);
                o00Oo0 o00oo1 = new o00Oo0((FragmentActivity) activity);
                o00oo1.f33244OooO0OO = intent;
                o00oo1.OooO00o(new o00Ooo() { // from class: o00o0O00.OooOO0O
                    @Override // p204o00o0o00.o00Ooo
                    public final void onActivityResult(int i, Intent intent2) {
                        Activity activity2 = activity;
                        String str = strOooO0O0;
                        boolean z2 = z;
                        o00000OO o00000oo2 = o0oo00o2;
                        Uri uri = uriOooO00o;
                        float f3 = f;
                        float f4 = f2;
                        o00Ooo o00ooo4 = o00ooo3;
                        o00Ooo o00ooo5 = o00ooo2;
                        if (i != -1) {
                            try {
                                p454o0Ooo0.OooOOO0.OooO00o(activity2, uri);
                                return;
                            } catch (Exception e) {
                                e.printStackTrace();
                                return;
                            }
                        }
                        o000000.OooO0O0(activity2.getApplication(), str);
                        if (z2) {
                            if (o00000oo2 != null) {
                                o00000oo2.OooO00o(uri);
                                return;
                            } else {
                                OooOOO.OooO00o(activity2, uri, f3, f4, o00ooo4);
                                return;
                            }
                        }
                        if (o00ooo5 != null) {
                            if (intent2 == null) {
                                intent2 = new Intent();
                            }
                            intent2.setAction(null);
                            intent2.setData(uri);
                            o00ooo5.onActivityResult(i, intent2);
                        }
                    }
                });
            }
        }

        public final void OooO0O0(OooO0O0 oooO0O0, ImageModel imageModel, int i) {
            if (o00O000.this.f33177OooO0Oo.OooO00o(Long.valueOf(imageModel.f12318Oooo0o))) {
                o00O000.this.f33177OooO0Oo.OooO0Oo(imageModel);
                o00O000.this.notifyDataSetChanged();
            } else {
                if (o00O000.this.f33177OooO0Oo.OooO0o() >= o00O000.this.f33179OooO0o0) {
                    OooOo.OooO0O0().OooO00o(o000OO00.OooO00o(o00O000.this.f33174OooO00o.getString(OooOOOO.select_picture_string_Select_a_maximum_of_xxx_photos), o00O000.this.f33179OooO0o0 + ""));
                    return;
                }
                if (imageModel.OooO0O0() && imageModel.OooO0OO()) {
                    OooOo.OooO0O0().OooO00o(o00O000.this.f33174OooO00o.getString(OooOOOO.select_picture_string_GIF_too_large));
                    return;
                }
                if (!OooOO0.OooO0O0(o00O000.this.f33174OooO00o, imageModel.f12326o000oOoO)) {
                    OooOo.OooO0O0().OooO00o(o00O000.this.f33174OooO00o.getString(OooOOOO.select_picture_string_is_not_image_file_format));
                    return;
                }
                o00oOoo o00oooo2 = o00O000.this.f33177OooO0Oo;
                o00oooo2.OooO0OO();
                o00oooo2.f33232OooO00o.put(Long.valueOf(imageModel.f12318Oooo0o), imageModel);
                o00oooo2.f33233OooO0O0.add(imageModel);
                TextView textView = oooO0O0.f33196OooO0oO;
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("");
                sbOooO0o0.append(o00O000.this.OooO0O0(imageModel));
                textView.setText(sbOooO0o0.toString());
                oooO0O0.f33196OooO0oO.setBackgroundResource(OooOO0O.icon_select_green);
                oooO0O0.f33197OooO0oo.setVisibility(0);
            }
            o00O000 o00o001 = o00O000.this;
            o0000Ooo<ArrayList<ImageModel>, Integer> o0000ooo = o00o001.f33178OooO0o;
            if (o0000ooo != null) {
                o0000ooo.OooO0o0(o00o001.OooO0OO(), Integer.valueOf(i));
            }
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
        public final void OooO0OO() {
            o00O000 o00o001 = o00O000.this;
            ?? r1 = o00o001.f33176OooO0OO;
            if (o00o001.f33179OooO0o0 == 1 && o00o001.f33182OooOO0) {
                if (o00o001.f33183OooOO0O == null || o00o001.OooO00o().size() <= this.f33186OoooO0 || o00O000.this.OooO00o().get(this.f33186OoooO0) == null) {
                    return;
                }
                o00O000 o00o002 = o00O000.this;
                ((o00000) o00o002.f33183OooOO0O).OooO00o(o00o002.f33174OooO00o, o00o002.OooO00o().get(this.f33186OoooO0));
                return;
            }
            if (o00o001.f33183OooOO0O == null || o00o001.OooO00o().size() <= r1 || o00O000.this.OooO00o().get(r1 == true ? 1 : 0) == null) {
                return;
            }
            o00O000 o00o003 = o00O000.this;
            o00O00 o00o01 = o00o003.f33183OooOO0O;
            final Activity activity = o00o003.f33174OooO00o;
            int i = o00o003.f33179OooO0o0;
            FileModel fileModel = o00o003.f33180OooO0oO;
            ArrayList<ImageModel> arrayListOooO0OO = o00o003.OooO0OO();
            ImageModel imageModel = o00O000.this.OooO00o().get(r1 == true ? 1 : 0);
            int i2 = this.f33186OoooO0;
            boolean z = o00O000.this.f33176OooO0OO;
            final o00000 o00000Var = (o00000) o00o01;
            boolean z2 = o00000Var.f33081OooO00o.f12269OooooOo;
            o00Ooo o00ooo2 = new o00Ooo() { // from class: o00o0O0.o000000O
                @Override // p204o00o0o00.o00Ooo
                public final void onActivityResult(int i3, Intent intent) {
                    o00000 o00000Var2 = o00000Var;
                    Activity activity2 = activity;
                    Objects.requireNonNull(o00000Var2);
                    if (i3 != -1) {
                        if (i3 == 0 && intent != null && intent.hasExtra("selectData")) {
                            o00000Var2.f33081OooO00o.f12264OoooOoo = intent.getParcelableArrayListExtra("selectData");
                            AllImagesActivity allImagesActivity = o00000Var2.f33081OooO00o;
                            if (allImagesActivity.f12264OoooOoo == null) {
                                allImagesActivity.f12264OoooOoo = new ArrayList<>();
                            }
                            AllImagesActivity allImagesActivity2 = o00000Var2.f33081OooO00o;
                            allImagesActivity2.f12263OoooOoO.OooO0o0(allImagesActivity2.f12264OoooOoo);
                            o00000Var2.f33081OooO00o.OooOOo();
                            return;
                        }
                        return;
                    }
                    ArrayList<ImageModel> arrayList = new ArrayList<>();
                    if (intent.hasExtra("selectData")) {
                        arrayList = intent.getParcelableArrayListExtra("selectData");
                    }
                    if (o00000Var2.f33081OooO00o.f12256OoooO0 && arrayList != null && arrayList.size() == 1) {
                        o00000Var2.OooO00o(activity2, arrayList.get(0));
                        return;
                    }
                    Intent intent2 = new Intent();
                    SelectImageData selectImageData = new SelectImageData();
                    selectImageData.f12327Oooo0o = o00000Var2.f33081OooO00o.OooOOOo(arrayList, null);
                    intent2.putExtra("selectData", selectImageData);
                    o00000Var2.f33081OooO00o.setResult(-1, intent2);
                    Function1<? super SelectImageData, Unit> function1 = Oooo0.f33131OooO0O0;
                    if (function1 != null) {
                        function1.invoke(selectImageData);
                    }
                    Oooo0.f33131OooO0O0 = null;
                    o00000Var2.f33081OooO00o.finish();
                }
            };
            int i3 = ShowImagesSelectActivity.f12282Ooooo0o;
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("MaxCount", i);
                bundle.putParcelable("currentImageFile", fileModel);
                bundle.putParcelableArrayList("selectData", arrayListOooO0OO);
                bundle.putParcelable("data", imageModel);
                bundle.putInt("File_Index", i2);
                bundle.putBoolean("IsTakePhoto", z);
                bundle.putBoolean("IsSupportGif", z2);
                o00Oo0 o00oo1 = new o00Oo0((FragmentActivity) activity);
                o00oo1.f33243OooO0O0 = ShowImagesSelectActivity.class;
                o00oo1.f33245OooO0Oo = new Bundle(bundle);
                o00oo1.OooO00o(o00ooo2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static class OooO0O0 extends RecyclerView.oo0o0Oo {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f33189OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public RelativeLayout f33190OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public TextView f33191OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public ImageView f33192OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public TextView f33193OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public RelativeLayout f33194OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public ImageButton f33195OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public TextView f33196OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public ImageView f33197OooO0oo;

        public OooO0O0(Context context, ViewGroup viewGroup) {
            super(LayoutInflater.from(context).inflate(OooOOO.layout_all_image, viewGroup, false));
            this.f33189OooO = 3;
            this.f33190OooO00o = (RelativeLayout) this.itemView.findViewById(OooOOO0.layout_all_image_bg);
            this.f33191OooO0O0 = (TextView) this.itemView.findViewById(OooOOO0.layout_all_image_name);
            this.f33195OooO0o0 = (ImageButton) this.itemView.findViewById(OooOOO0.layout_all_image_iv_add);
            this.f33193OooO0Oo = (TextView) this.itemView.findViewById(OooOOO0.layout_all_image_tv_gif);
            this.f33192OooO0OO = (ImageView) this.itemView.findViewById(OooOOO0.layout_all_image_iv);
            this.f33197OooO0oo = (ImageView) this.itemView.findViewById(OooOOO0.layout_all_image_iv_covering);
            this.f33194OooO0o = (RelativeLayout) this.itemView.findViewById(OooOOO0.layout_all_image_layout_select);
            this.f33196OooO0oO = (TextView) this.itemView.findViewById(OooOOO0.layout_all_image_tv_select);
            int iOooO0O0 = o000O0O0.OooO0O0(context) / this.f33189OooO;
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f33190OooO00o.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).height = iOooO0O0;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = iOooO0O0;
            this.f33190OooO00o.setLayoutParams(layoutParams);
            OooO00o();
        }

        public final void OooO00o() {
            this.f33195OooO0o0.setVisibility(8);
            this.f33191OooO0O0.setVisibility(8);
            this.f33193OooO0Oo.setVisibility(8);
            this.f33194OooO0o.setVisibility(8);
            this.f33196OooO0oO.setVisibility(8);
            this.f33192OooO0OO.setVisibility(8);
            this.f33192OooO0OO.setImageResource(OooOO0O.icon_pic);
            this.f33197OooO0oo.setVisibility(8);
            this.f33196OooO0oO.setText("");
            this.f33196OooO0oO.setBackgroundResource(OooOO0O.icon_select_gray);
        }
    }

    public o00O000(Activity activity, int i, boolean z, boolean z2) {
        this.f33179OooO0o0 = i;
        this.f33176OooO0OO = z;
        this.f33182OooOO0 = z2;
        this.f33174OooO00o = activity;
        OooO0Oo(null, null);
    }

    public final ArrayList<ImageModel> OooO00o() {
        if (this.f33175OooO0O0 == null) {
            this.f33175OooO0O0 = new ArrayList<>();
        }
        return this.f33175OooO0O0;
    }

    public final int OooO0O0(ImageModel imageModel) {
        if (this.f33177OooO0Oo.OooO00o(Long.valueOf(imageModel.f12318Oooo0o))) {
            return 1 + this.f33177OooO0Oo.OooO0O0(imageModel);
        }
        return 1;
    }

    public final ArrayList<ImageModel> OooO0OO() {
        o00oOoo o00oooo2 = this.f33177OooO0Oo;
        o00oooo2.OooO0OO();
        return o00oooo2.f33233OooO0O0;
    }

    public final void OooO0Oo(ArrayList<ImageModel> arrayList, FileModel fileModel) {
        this.f33175OooO0O0 = arrayList;
        this.f33180OooO0oO = fileModel;
        if (arrayList == null) {
            ArrayList<ImageModel> arrayList2 = new ArrayList<>();
            this.f33175OooO0O0 = arrayList2;
            if (this.f33176OooO0OO) {
                arrayList2.add(0, new ImageModel());
            }
        }
        if (this.f33176OooO0OO && !this.f33175OooO0O0.isEmpty() && this.f33175OooO0O0.get(0) != null && this.f33175OooO0O0.get(0).f12326o000oOoO != null) {
            this.f33175OooO0O0.add(0, new ImageModel());
        }
        notifyDataSetChanged();
    }

    public final void OooO0o0(ArrayList<ImageModel> arrayList) {
        if (this.f33175OooO0O0 == null) {
            this.f33175OooO0O0 = new ArrayList<>();
        }
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.f33177OooO0Oo.OooO0o0(arrayList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList<ImageModel> arrayList = this.f33175OooO0O0;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.oo0o0Oo oo0o0oo, int i) {
        boolean z;
        OooO0O0 oooO0O0 = (OooO0O0) oo0o0oo;
        oooO0O0.OooO00o();
        oooO0O0.f33189OooO = this.f33184OooOO0o;
        ArrayList<ImageModel> arrayList = this.f33175OooO0O0;
        ImageModel imageModel = (arrayList == null || i >= arrayList.size()) ? null : this.f33175OooO0O0.get(i);
        if (imageModel != null) {
            if (this.f33176OooO0OO && i == 0 && imageModel.f12326o000oOoO == null) {
                oooO0O0.f33195OooO0o0.setVisibility(0);
                oooO0O0.f33194OooO0o.setVisibility(8);
                oooO0O0.f33196OooO0oO.setVisibility(8);
                oooO0O0.f33192OooO0OO.setVisibility(8);
                oooO0O0.f33197OooO0oo.setVisibility(8);
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                oooO0O0.f33195OooO0o0.setVisibility(8);
                oooO0O0.f33194OooO0o.setVisibility(0);
                if (this.f33179OooO0o0 > 1) {
                    oooO0O0.f33196OooO0oO.setVisibility(0);
                }
                oooO0O0.f33192OooO0OO.setVisibility(0);
                if (this.f33177OooO0Oo.OooO00o(Long.valueOf(imageModel.f12318Oooo0o))) {
                    TextView textView = oooO0O0.f33196OooO0oO;
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("");
                    sbOooO0o0.append(OooO0O0(imageModel));
                    textView.setText(sbOooO0o0.toString());
                    oooO0O0.f33196OooO0oO.setBackgroundResource(OooOO0O.icon_select_green);
                    oooO0O0.f33197OooO0oo.setVisibility(0);
                } else {
                    oooO0O0.f33196OooO0oO.setText("");
                    oooO0O0.f33196OooO0oO.setBackgroundResource(OooOO0O.icon_select_gray);
                    oooO0O0.f33197OooO0oo.setVisibility(8);
                }
                OooOo.OooO00o().OooO0O0(this.f33174OooO00o, imageModel.f12326o000oOoO, oooO0O0.f33192OooO0OO);
            }
            OooO00o oooO00o = new OooO00o(oooO0O0, imageModel, i);
            oooO0O0.f33194OooO0o.setOnClickListener(oooO00o);
            oooO0O0.f33196OooO0oO.setOnClickListener(oooO00o);
            oooO0O0.f33195OooO0o0.setOnClickListener(oooO00o);
            oooO0O0.f33192OooO0OO.setOnClickListener(oooO00o);
            oooO0O0.f33197OooO0oo.setOnClickListener(oooO00o);
            if (this.f33181OooO0oo && imageModel.OooO0O0()) {
                oooO0O0.f33193OooO0Oo.setVisibility(0);
            }
            if (this.f33173OooO) {
                oooO0O0.f33191OooO0O0.setVisibility(0);
                oooO0O0.f33191OooO0O0.setText(imageModel.f12323OoooO00 + "\n " + imageModel.OooO00o() + " MB");
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.oo0o0Oo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new OooO0O0(this.f33174OooO00o, viewGroup);
    }
}
