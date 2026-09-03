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
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.UserInfoModel;
import com.zego.zegoavkit2.ZegoConstants;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public class UserInfoRightFragment extends o00OOO0.OooO00o {
    public FlowLayout flTag;
    public ImageView ivUserConstellation;
    public TextView tvTagHint;
    public TextView tvUserConstellation;
    public TextView tvUserLanguage;
    public TextView tvUserTime;

    private void initView() {
        this.tvUserLanguage = (TextView) this.rootView.findViewById(R.id.tv_user_language);
        this.tvUserConstellation = (TextView) this.rootView.findViewById(R.id.tv_user_constellation);
        this.tvUserTime = (TextView) this.rootView.findViewById(R.id.tv_userinfo_time);
        this.ivUserConstellation = (ImageView) this.rootView.findViewById(R.id.iv_user_constellation);
        this.flTag = (FlowLayout) this.rootView.findViewById(R.id.fl_userinfo_tag);
        this.tvTagHint = (TextView) this.rootView.findViewById(R.id.tv_userinfo_tag_hint);
    }

    public static UserInfoRightFragment newInstantce() {
        UserInfoRightFragment userInfoRightFragment = new UserInfoRightFragment();
        userInfoRightFragment.setArguments(new Bundle());
        return userInfoRightFragment;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.rootView = layoutInflater.inflate(R.layout.user_fragment_userinfo_right, viewGroup, false);
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
        if (!com.yalla.support.common.util.OooO0OO.OooO0O0(userInfoModel.getTags()) || getContext() == null) {
            this.tvTagHint.setVisibility(0);
        } else {
            this.tvTagHint.setVisibility(8);
            for (int i2 = 0; i2 < userInfoModel.getTags().size(); i2++) {
                View viewInflate = View.inflate(getContext(), R.layout.item_flow_tag_userinfo, null);
                ((TextView) viewInflate.findViewById(R.id.tv_tag_flow_userinfo)).setText(userInfoModel.getTags().get(i2).getTagName());
                this.flTag.addView(viewInflate);
            }
        }
        this.tvUserTime.setText(userInfoModel.getRegTime() + ZegoConstants.ZegoVideoDataAuxPublishingStream + p254o00ooO0O.o000O0O0.OooO0OO(R.string.days));
        switch (userInfoModel.getRegion()) {
            case 0:
                this.tvUserLanguage.setText(R.string.English);
                break;
            case 1:
                this.tvUserLanguage.setText(R.string.Arabic);
                break;
            case 2:
                this.tvUserLanguage.setText(R.string.Turkish);
                break;
            case 3:
                this.tvUserLanguage.setText(R.string.Indonesia);
                break;
            case 4:
            default:
                this.tvUserLanguage.setText("");
                break;
            case 5:
                this.tvUserLanguage.setText(R.string.Portuguese);
                break;
            case 6:
                this.tvUserLanguage.setText(R.string.Spanish);
                break;
            case 7:
                this.tvUserLanguage.setText(R.string.Hindi);
                break;
            case 8:
                this.tvUserLanguage.setText(R.string.Urdu);
                break;
        }
        try {
            time = new SimpleDateFormat("yyyy-MM-dd").parse(userInfoModel.getBirthday());
        } catch (Exception unused) {
            time = Calendar.getInstance().getTime();
        }
        int month = time.getMonth() + 1;
        int i3 = month - 1;
        String strOooO0OO = p254o00ooO0O.o000O0O0.OooO0OO(time.getDate() < p168o00Ooo0.Oooo000.f32641OooO00o[i3] ? p168o00Ooo0.Oooo000.f32642OooO0O0[i3] : p168o00Ooo0.Oooo000.f32642OooO0O0[month]);
        if (getContext() != null) {
            ImageView imageView = this.ivUserConstellation;
            Context context = getContext();
            if (strOooO0OO.equals(context.getString(R.string.aries))) {
                i = R.drawable.aries;
            } else if (strOooO0OO.equals(context.getString(R.string.taurus))) {
                i = R.drawable.taurus;
            } else if (strOooO0OO.equals(context.getString(R.string.gemini))) {
                i = R.drawable.gemini;
            } else if (strOooO0OO.equals(context.getString(R.string.cancer))) {
                i = R.drawable.cancer;
            } else if (strOooO0OO.equals(context.getString(R.string.leo))) {
                i = R.drawable.leo;
            } else if (strOooO0OO.equals(context.getString(R.string.virgo))) {
                i = R.drawable.virgo;
            } else if (strOooO0OO.equals(context.getString(R.string.libra))) {
                i = R.drawable.libra;
            } else if (strOooO0OO.equals(context.getString(R.string.scorpio))) {
                i = R.drawable.scorpio;
            } else if (strOooO0OO.equals(context.getString(R.string.sagittarius))) {
                i = R.drawable.sagittarius;
            } else if (strOooO0OO.equals(context.getString(R.string.capricorn))) {
                i = R.drawable.capricorn;
            } else if (strOooO0OO.equals(context.getString(R.string.aquarius))) {
                i = R.drawable.aquarius;
            } else {
                strOooO0OO.equals(context.getString(R.string.pisces));
                i = R.drawable.pisces;
            }
            imageView.setImageResource(i);
            this.ivUserConstellation.setVisibility(0);
        }
        this.tvUserConstellation.setText(strOooO0OO.trim());
        this.tvUserConstellation.setHint("");
    }
}
