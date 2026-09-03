package com.zego.zegoavkit2;

/* JADX INFO: loaded from: classes4.dex */
public class ZegoConstants {
    public static final String KEY_FLV_URL_LIST = "flvList";
    public static final String KEY_HLS_URL_LST = "hlsList";
    public static final String KEY_MIX_STREAM_ID = "mixStreamID";
    public static final String KEY_PUBLISH_CDN_TARGET = "publish_cdn_target";
    public static final String KEY_PUBLISH_CUSTOM_TARGET = "publish_custom_target";
    public static final String KEY_RTMP_URL_LIST = "rtmpList";
    public static final String KEY_STREAM_ID = "streamID";
    public static final String ZegoVideoDataAuxPublishingStream = " ";
    public static final String ZegoVideoDataMainPublishingStream = "";

    public static final class AECMode {
        public static final int aggressive = 0;
        public static final int medium = 1;
        public static final int soft = 2;
    }

    public static final class AudioDeviceType {
        public static final int Input = 0;
        public static final int Output = 1;
    }

    public static final class AudioRouteType {
        public static final int AirPlay = 5;
        public static final int Bluetooth = 2;
        public static final int EarPhone = 1;
        public static final int LoudSpeaker = 0;
        public static final int Receiver = 3;
        public static final int UsbAudio = 4;
    }

    public static final class AudioVADType {
        public static final int noise = 0;
        public static final int speech = 1;
    }

    public static final class CDNProtocol {
        public static final int QUIC = 2;
        public static final int TCP = 1;
    }

    public static final class DeviceErrorReason {
        public static final int Disabled = 2;
        public static final int GenericError = -1;
        public static final int InBackground = 5;
        public static final int InUseByOther = -5;
        public static final int InUseBySiri = -9;
        public static final int Interruption = 4;
        public static final int InvalidID = -2;
        public static final int MagneticCase = -11;
        public static final int MediaServiceLost = -8;
        public static final int MultiForegroundApp = 6;
        public static final int Mute = 3;
        public static final int NoAuthorization = -3;
        public static final int None = 0;
        public static final int RebootRequired = -7;
        public static final int SoundLevelTooLow = -10;
        public static final int SystemPressure = 7;
        public static final int Unplugged = -6;
        public static final int ZeroFPS = -4;
    }

    public static final class EncodeProfile {
        public static final int baseline = 0;
        public static final int high = 2;
        public static final int main = 1;
    }

    public static final class MediaInfoType {
        public static final int SeiUserUnregisted = 2;
        public static final int SeiZegoDefined = 1;
        public static final int SideInfoZegoDefined = 0;
    }

    public static final class NetType {
        public static final int Line = 1;
        public static final int Mobile2G = 3;
        public static final int Mobile3G = 4;
        public static final int Mobile4G = 5;
        public static final int Mobile5G = 6;
        public static final int None = 0;
        public static final int UNKNOWN = 32;
        public static final int Wifi = 2;
    }

    public static final class PublishChannelIndex {
        public static final int AUX = 1;
        public static final int MAIN = 0;
    }

    public static final class SeiSendType {
        public static final int SeiSendInVideoFrame = 1;
        public static final int SeiSendSingleFrame = 0;
    }

    public static final class TrafficControlFocusOn {
        public static final int FocusOnLocalOnly = 0;
        public static final int FocusOnRemote = 1;
    }

    public static final class ZegoAPIErrorCode {
        public static final int AudioDeviceEngineError = 5102;
        public static final int ExternalAudioDeviceWasNotEnabled = 5101;
        public static final int InvalidParameter = 1;
        public static final int OK = 0;
    }

    public static final class ZegoAudioMixMode {
        public static final int Focused = 1;
        public static final int Raw = 0;
    }

    public static final class ZegoCodecError {
        public static final int Failed = -2;
        public static final int LowFPS = -3;
        public static final int None = 0;
        public static final int NotSupport = -1;
    }

    public static final class ZegoVideoCodecAvc {
        public static final int VIDEO_CODEC_DEFAULT = 0;
        public static final int VIDEO_CODEC_H265 = 3;
        public static final int VIDEO_CODEC_MULTILAYER = 1;
        public static final int VIDEO_CODEC_UNKNOWN = 100;
        public static final int VIDEO_CODEC_VP8 = 2;
    }

    public static final class ZegoVideoMirrorMode {
        public static final int VIDEO_MIRROR_MODE_PREVIEW_MIRROR_PUBLISH_NO_MIRROR = 0;
        public static final int VIDEO_MIRROR_MODE_PREVIEW_NO_MIRROR_PUBLISH_MIRROR = 3;
        public static final int VIDEO_MIRROR_MODE_PREVIEW_PUBLISH_BOTH_MIRROR = 1;
        public static final int VIDEO_MIRROR_MODE_PREVIEW_PUBLISH_BOTH_NO_MIRROR = 2;
    }

    public static final class ZegoVideoSourceType {
        public static final int VIDEO_SRC_CAMERA = 2;
        public static final int VIDEO_SRC_DEFAULT = 0;
        public static final int VIDEO_SRC_EXTERNAL_CAPTURE = 3;
        public static final int VIDEO_SRC_MAIN_PUBLISH_CHN = 4;
        public static final int VIDEO_SRC_NONE = 1;
    }
}
