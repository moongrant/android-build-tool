package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.material.internal.FlowLayout;
import com.yalla.yalla.model.user.UserInfoModel;
import com.zego.zegoavkit2.ZegoConstants;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import p579o0oOoo.oO0o0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public class UserInfoRightFragment extends com.yalla.yalla.base.fragment.OooO00o {
    FlowLayout flTag;
    ImageView ivUserConstellation;
    TextView tvTagHint;
    TextView tvUserConstellation;
    TextView tvUserLanguage;
    TextView tvUserTime;

    private void initView() {
        this.tvUserLanguage = (TextView) this.rootView.findViewById(oO00O0oO.tv_user_language);
        this.tvUserConstellation = (TextView) this.rootView.findViewById(oO00O0oO.tv_user_constellation);
        this.tvUserTime = (TextView) this.rootView.findViewById(oO00O0oO.tv_userinfo_time);
        this.ivUserConstellation = (ImageView) this.rootView.findViewById(oO00O0oO.iv_user_constellation);
        this.flTag = (FlowLayout) this.rootView.findViewById(oO00O0oO.fl_userinfo_tag);
        this.tvTagHint = (TextView) this.rootView.findViewById(oO00O0oO.tv_userinfo_tag_hint);
    }

    public static UserInfoRightFragment newInstantce() {
        UserInfoRightFragment userInfoRightFragment = new UserInfoRightFragment();
        userInfoRightFragment.setArguments(new Bundle());
        return userInfoRightFragment;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.rootView = layoutInflater.inflate(oO00OO0O.user_fragment_userinfo_right, viewGroup, false);
        initView();
        return this.rootView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    public void updataInfo(UserInfoModel userInfoModel) {
        FlowLayout flowLayout;
        Date time;
        int i;
        if (userInfoModel == null || isDetached() || (flowLayout = this.flTag) == null) {
            return;
        }
        flowLayout.removeAllViews();
        if (!com.code.android.util.OooOo00.OooO0O0(userInfoModel.getTags()) || getContext() == null) {
            this.tvTagHint.setVisibility(0);
        } else {
            this.tvTagHint.setVisibility(8);
            for (int i2 = 0; i2 < userInfoModel.getTags().size(); i2++) {
                View viewInflate = View.inflate(getContext(), oO00OO0O.item_flow_tag_userinfo, null);
                ((TextView) viewInflate.findViewById(oO00O0oO.tv_tag_flow_userinfo)).setText(userInfoModel.getTags().get(i2).getTagName());
                this.flTag.addView(viewInflate);
            }
        }
        this.tvUserTime.setText(userInfoModel.getRegTime() + ZegoConstants.ZegoVideoDataAuxPublishingStream + com.code.android.util.o0000.OooO0OO(oO00OOo0.days));
        switch (userInfoModel.getRegion()) {
            case 0:
                this.tvUserLanguage.setText(oO00OOo0.English);
                break;
            case 1:
                this.tvUserLanguage.setText(oO00OOo0.Arabic);
                break;
            case 2:
                this.tvUserLanguage.setText(oO00OOo0.Turkish);
                break;
            case 3:
                this.tvUserLanguage.setText(oO00OOo0.Indonesia);
                break;
            case 4:
            default:
                this.tvUserLanguage.setText("");
                break;
            case 5:
                this.tvUserLanguage.setText(oO00OOo0.Portuguese);
                break;
            case 6:
                this.tvUserLanguage.setText(oO00OOo0.Spanish);
                break;
            case 7:
                this.tvUserLanguage.setText(oO00OOo0.Hindi);
                break;
            case 8:
                this.tvUserLanguage.setText(oO00OOo0.Urdu);
                break;
        }
        try {
            time = new SimpleDateFormat("yyyy-MM-dd").parse(userInfoModel.getBirthday());
        } catch (Exception unused) {
            time = Calendar.getInstance().getTime();
        }
        int month = time.getMonth() + 1;
        int date = time.getDate();
        int i3 = month - 1;
        int i4 = oO0o0o.f56646OooOOO0[i3];
        int[] iArr = oO0o0o.f56645OooOOO;
        String strOooO0OO = com.code.android.util.o0000.OooO0OO(date < i4 ? iArr[i3] : iArr[month]);
        if (getContext() != null) {
            ImageView imageView = this.ivUserConstellation;
            Context context = getContext();
            if (strOooO0OO.equals(context.getString(oO0o0o.f56634OooO00o))) {
                i = oOo00OO0.aries;
            } else if (strOooO0OO.equals(context.getString(oO0o0o.f56635OooO0O0))) {
                i = oOo00OO0.taurus;
            } else if (strOooO0OO.equals(context.getString(oO0o0o.f56636OooO0OO))) {
                i = oOo00OO0.gemini;
            } else if (strOooO0OO.equals(context.getString(oO0o0o.f56637OooO0Oo))) {
                i = oOo00OO0.cancer;
            } else if (strOooO0OO.equals(context.getString(oO0o0o.f56639OooO0o0))) {
                i = oOo00OO0.leo;
            } else if (strOooO0OO.equals(context.getString(oO0o0o.f56638OooO0o))) {
                i = oOo00OO0.virgo;
            } else if (strOooO0OO.equals(context.getString(oO0o0o.f56640OooO0oO))) {
                i = oOo00OO0.libra;
            } else if (strOooO0OO.equals(context.getString(oO0o0o.f56641OooO0oo))) {
                i = oOo00OO0.scorpio;
            } else if (strOooO0OO.equals(context.getString(oO0o0o.f56633OooO))) {
                i = oOo00OO0.sagittarius;
            } else if (strOooO0OO.equals(context.getString(oO0o0o.f56642OooOO0))) {
                i = oOo00OO0.capricorn;
            } else if (strOooO0OO.equals(context.getString(oO0o0o.f56643OooOO0O))) {
                i = oOo00OO0.aquarius;
            } else {
                i = strOooO0OO.equals(context.getString(oO0o0o.f56644OooOO0o)) ? oOo00OO0.pisces : oOo00OO0.pisces;
            }
            imageView.setImageResource(i);
            this.ivUserConstellation.setVisibility(0);
        }
        this.tvUserConstellation.setText(strOooO0OO.trim());
        this.tvUserConstellation.setHint("");
    }
}
