package com.dianyou.javapoet;


public interface Constants {
    String UTF8 = "utf-8";

    /**
     * 起始页面保存
     */
    String EXTRA_KEY_SOURCEPAGE = "sourcePage";
    /**
     * 来源
     */
    String EXTRA_KEY_SOURCE = "dy_statistics_source";

    /**
     * 进程来源
     */
    String EXTRA_KEY_PROCESS = "process_name_source";

    // 下载文件夹
    String download = "APK";
    ///***************************** 游戏分类信息 ***************************************/

    ///***************************** 广播回调 ***************************************/
    String COMMENT_RECEIVER = "commentReceiver";//游戏评论回调
    String COMMENT_GAME_ID = "gameId";//评论游戏ID

    String GAME_READY_RECEIVER = "gamereadyReceiver";//游戏评论回调

	/*String TOP_TASK_RED_SHOW = "TaskReceiver" ;//游戏下载红点显示回调
    String IS_SHOW_TASK_RED ="TaskRedIsShow";//红点是否显示*/

    String ATTENTION_INFO = "AttentionInfo";//关注信息
    String ATTENTION_INFO_USER_ID = "AttentionInfoUserId";//关注用户id
    String ATTENTION_INFO_CHANGE = "IsAttention";//是否关注

    /**
     * 红包成熟通知
     */
    String DY_PLUGIN_SHOW_NEW_MSG = "dy_plugin_show_new_msg";
    /**
     * 点游插件包名
     */
    String DY_PLUGIN_PKG_NAME = "dy_plugin_pkg_name";

    /**
     * 红包插件包名
     */
    String RED_ENVELOPE_PKG_NAME = "com.dianyou.app.market.redenvelope";


    /**
     * 游戏GameHomeTab
     */
    String GAME_TAB_ID = "game_tab_id";

    /**
     * 红包每日任务提醒
     */
    String RED_ENVELOPE_ACITON_REMIND = "red_envelope_aciton_remind";

    ////////////////////////////////推送相关////////////////////////////////////
    String NOTIFICATION_ID = "notification_id";
    String NOTIFICATION_CONTENT = "notification_content";
    String NOTIFICATION_TYPE = "notification_type";
    String NOTIFICATION_MESSAGE_NUMBER = "notification_number";
    String NOTIFICATION_PROTOCOL = "notification_protocol";

    ////////////////////////////////计时器////////////////////////////////////////
    String COUNTDOWNTASK_TIME = "countdowntask_time";
    String COUNTDOWNTASK_STOP = "countdowntask_stop";

    ////////////////////////////////语音视频////////////////////////////////////////

    String AVCHAT_NOTIFITION_ACTIVE = "AVCHAT_NOTIFITION_ACTIVE";
    String AVCHAT_NOTIFITION_CACEL = "AVCHAT_NOTIFITION_CACEL";

    String AVCHAT_MINIMUM = "AVCHAT_MINIMUM";

    String AVCHAT_DATA = "AVCHAT_DATA";
    String AVCHAT_EXTRA_DATA = "AVCHAT_EXTRA_DATA";
    String AVCHAT_DISPLAYNAME = "AVCHAT_DISPLAYNAME";
    String AVCHAT_STATE = "AVCHAT_STATE";
    String AVCHAT_ISINCOMINGCALL = "AVCHAT_ISINCOMINGCALL";

    String AVCHAT_STARTACTIVITY = "AVCHAT_STARTACTIVITY";

    String AVCHAT_SOURCE = "AVCHAT_SOURCE";

    String AVCHAT_STATE_CHANGE = "AVCHAT_STATE_CHANGE";

    //调试标志位(默认关闭)
    boolean reverse = false;

    //是否使用旧的通讯录接口
    boolean useOldContactApi = false;

    //服务json
    String JSON_VALUE = "ContentServices";

    //匿名服务提醒(添加最大次数)
    int MAX_ANONYMITY_COUNT = 3;

    String LOW_VERSION_HIT = "您客户端版本过低，请先升级版本，您可以通过以下方式获得最新版本：<font color='#507daf'>个人中心→设置→检查更新</font>";

    /***************************** 路由交互专用 ***************************************/
    /**
     * 进入主TAB页
     */
    String DY_MAIN_ROUTER_GOTO_MAIN_TAB_ACTIVITY = "dy_main_router_goto_main_tab_activity";
    /**
     * 启动下载
     */
    String DY_MAIN_ROUTER_GOTO_DOWNLOAD_GAME = "dy_main_router_goto_download_game";
    /**
     * 关闭当前页面
     */
    String DY_MAIN_ROUTER_FINISHED_ACTIVITY = "dy_main_router_finished_activity";
    /**
     * 进入游戏加载页面
     */
    String DY_MAIN_ROUTER_GOTO_GAMELOADING_ACTIVITY = "dy_main_router_goto_gameloading_activity";
    /**
     * 停止预下载
     */
    String DY_MAIN_ROUTER_GOTO_STOPPRELOAD = "dy_main_router_goto_stop_preload";

    int GALLERY_SPAN_COUNT = 4;

    String KEYWORD_HIGHLIGHT_FORMAT = "<font color='#FF5548'>%s</font>";

    String DISK_CACHE_CIRCLE_DIR_NAME = "DyCircle";


    //赚钱栏目事件
    String EVENT_AVATAR = "ZQ_Avatar";
    String EVENT_GOLD = "ZQ_Gold";
    String EVENT_DIAMOND = "ZQ_Diamond";
    String EVENT_DIAMOND_PLUS = "ZQ_Diamond+";
    String EVENT_CHANGE = "ZQ_Change";
    String EVENT_WITHDRAW = "ZQ_Withdraw";
    String EVENT_MISSIONBOARD = "ZQ_MissionBoard";
    String EVENT_MISSIONBOARD_PICKUP = "ZQ_MissionBoard_Pickup";
    String EVENT_ACTIVITY = "ZQ_Activity";
    String EVENT_IMMATURE_HB = "ZQ_Immature_hb";
    String EVENT_MATURE_HB = "ZQ_Mature_hb";
    String EVENT_HB_RECEIVE = "HB_Receive";
    String EVENT_SEEDETAILS = "ZQ_SeeDetails";
    String EVENT_RECHARGE = "ZQ_Recharge";

    /**
     * 活跃度任务倡议书的小视频用户观看20S可关闭
     */
    long LIVENS_DURATION = 20 * 1000;

    /**
     * 全民吃瓜信息安全及用户行为规范文章ID
     */
    String USER_SAFETY_NORM_ID = "80542566";

    /**
     * 红包雨接口版本号
     */
    String REDSHOWER_API_VERSION = "20200219";

    /**
     * 加群稍后处理发送服务号消息 的BType
     */
    interface BType {
        String BType_EPSSG = "epssg"; //进群的btype
        String BType_SHOP = "shop"; // 商户群
    }



    //////////////////////////////////游戏///////////////////////////////////////
    interface GameTabId {
        /**
         * 精选
         */
        int CHOICENESS = 0;
        /**
         * 分类
         */
        int CLASSIFY = 1;
        /**
         * 排行
         */
        int RANKING = 2;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * 用于初始化时切换tab
     */
    interface InitTabName {
        /**
         * 游戏
         */
        String GAME = "game";
        /**
         * 发现
         */
        String DISCOVERY = "discovery";
        /**
         * 红包
         */
        String RED_ENVELOPE = "red_envelope";
        /**
         * 消息
         */
        String MESSAGE = "message";
        /**
         * 圈子
         */
        String CIRCLE = "circle";
        /**
         * 真心话
         */
        String TRUE_WORDS = "true_words";
        /**
         * 组织
         */
        String ORGANIZATION = "organization";
        /**
         * 竞技
         */
        String ATHLETICS = "athletics";
    }

    /**
     * 各种下载状态
     */
    interface Download {
        /**
         * 未下载
         ***/
        int STATE_NONE = 0;
        /**
         * 等待中
         */
        int STATE_WAITING = 1;
        /**
         * 下载中
         */
        int STATE_DOWNLOADING = 2;
        /**
         * 暂停
         */
        int STATE_PAUSED = 3;
        /**
         * 下载完毕
         */
        int STATE_FINISH = 4;
        /**
         * 下载失败
         */
        int STATE_ERROR = 5;
        /*** 已经安装 **/
        int STATE_INSTALLED = 6;
    }

    /**
     * 引导页最后一页的数据类型
     */
    interface GuidePlayDataType {
        /**
         * 本地数据
         */
        int LOCAL_DATA = 0;
        /**
         * 网络数据
         */
        int NET_DATA = 1;
    }

    interface LoginType {
        /**
         * 自动登录
         */
        int LOGIN_AUTO = 1;
        String AUTO_LOGIN = "login_auto";
        String AUTO_LOGIN_UNAME = "uname";
        String AUTO_LOGIN_PWD = "password";
    }
    ///////////////////////////////////精选//////////////////////////////////

    /**
     * 模板类型 1-六宫格 2-列表大图 3-单款大图 4-横条小图
     */
    interface ModuleType {
        /**
         * 六宫格
         */
        int MODULETYPE_SIX_GRID = 1;
        /**
         * 大图专题
         */
        int MODULETYPE_BIG_IMG = 2;
        /**
         * 单款游戏
         */
        int MODULETYPE_SINGLE_GAME = 3;
        /**
         * 列表游戏
         */
        int MODULETYPE_LIST_GAME = 4;
        // 自定义类型
        /**
         * 热门活动
         */
        int MODULETYPE_HOT_ACT = -1;
    }

    interface BannerType {
        /**
         * 游戏类型的banner
         */
        int TYPE_GAME = 1;
        /**
         * 福利活动类型的banner
         */
        int TYPE_BENEFITS = 2;
        /**
         * 游戏列表的banner
         */
        int TYPE_GAMELIST = 3;
    }


    ///////////////////////////////////游戏圈//////////////////////////////////

    /**
     * 圈子动态分类需要验证登录与否
     */
    interface GameCircleTypeNeedLogin {
        /**
         * 不需要
         */
        int NOT_NEED = 0;
        /**
         * 需要
         */
        int NEED_LOGIN = 1;
    }

    interface GameCircleCommentType {
        /**
         * 评论
         */
        int COMMENT_TYPE = 1;
        /**
         * 回复
         */
        int REPLY_TYPE = 2;
    }

    interface GameCircleUserType {
        /**
         * 作者号
         */
        int OFFICIAL_TYPE = 2;

        /**
         * 马甲号
         */
        int SOCKPUPPET = 1;

        /**
         * 普通
         */
        int ORDINARY_TYPE = 0;

        /**
         * 主播
         */

        int LIVE_PLAYER = 4;
    }

    interface OfficerCircleUserType {
        /**
         * 作者号
         */
        int OFFICIAL_TYPE = 1;


        /**
         * 普通
         */
        int ORDINARY_TYPE = 2;
    }

    interface GameCircleType {
        /**
         * 普通
         */
        int NORMAL_TYPE = 0;
        /**
         * 游戏
         */
        int GAME_TYPE = 1;
        /**
         * 活动
         */
        int ACTIVITY_TYPE = 2;
        /**
         * 礼包
         */
        int GIFTS_TYPE = 3;
        /**
         * 游戏分享
         */
        int GAME_SHARE_TYPE = 4;
        /**
         * 文章
         */
        int ARTICLE_TYPE = 5;
        /**
         * 视频
         */
        int VIDEO_TYPE = 6;
        /**
         * 新闻
         */
        int NEWS_TYPE = 7;
        /**
         * 转发
         */
        int TRANSPOND_TYPE = 8;
        /**
         * 直播服务
         */
        int LIVE_SERVICE_TYPE = 9;
        /**
         * 红包游戏分享
         */
        int RED_ENVELOPE_GAME_SHARE_TYPE = 10;
        /**
         * IM转发
         */
        int IM_TRANSPOND = 11;
        /**
         * 广告类型
         */
        int AD_TYPE = 99;
        /**
         * 单图类型
         */
        int ONE_IMAGE_TYPE = 98;

        int CGAD_TYPE = 97;  //吃瓜广告类型

        int CSJ_TYPE = 96;  //穿山甲

        /**
         * ci
         * 用户发送的视屏
         */
        int USER_SEND_VIDEO_TYPE = 100;

        /**
         * 小视频
         */
        int SMALL_VIDEO = 101;
        /**
         * 吃瓜课堂的视频
         */
        int CLASS_VIDEO = 102;
        /**
         * 音乐转发
         */
        int MUSIC_TYPE = 103;
        /**
         * 推荐频道小视频
         */
        int RECOM_SMALL_VIDEO = 1104;
        /**
         * 推荐频道的吃瓜课堂数据
         */
        int RECOM_SPECIAL_DATA_TYPE = 1105;
        /**
         * im发的小视频
         */
        int IM_SMALL_VIDEO = 401;

        /**
         * 小说类型
         */
        int NOVEL_TYPE = 500;

        /**
         * 圈子大图
         **/
        int DUTE_BIG_IMAGE = 402;

        /**
         * 圈子轮播图
         */
        int DUTE_CYCLE_PLAYER = 403;

    }

    interface CircleShowType {
        /*资讯类型*/
        int SHOWTYPE_NEWS = 1;
        /*视频类型*/
        int SHOWTYPE_VIDEO = 2;
        /*服务类型*/
        int SHOWTYPE_SERVER = 3;
        /*朋友圈类型*/
        int SHOWTYPE_FRIENDS = 5;

        /*资讯类型-小图图文*/
        int SUBSHOWTYPE_SMALL_IMAGE_TEXT = 101;
        /*资讯类型-大图图文*/
        int SUBSHOWTYPE_BIG_IMAGE_TEXT = 102;
        /*资讯类型-专题图文*/
        int SUBSHOWTYPE_SPECIAL_IMAGE_TEXT = 103;

        /*视频类型-短视频*/
        int SUBSHOWTYPE_SHORT_VIDEO = 201;
        /*视频类型-小视频*/
        int SUBSHOWTYPE_SMALL_VIDEO = 202;
        /*视频类型-回播视频*/
        int SUBSHOWTYPE_REBROADCAST_VIDEO = 203;

        /*服务类型-音乐*/
        int SUBSHOWTYPE_SERVER_MUSIC = 301;
        /*服务类型-小说*/
        int SUBSHOWTYPE_SERVER_NOVEL = 302;
        /*服务类型-游戏*/
        int SUBSHOWTYPE_SERVER_GAME = 303;
        /*服务类型-影视*/
        int SUBSHOWTYPE_SERVER_MOVIE = 304;

        /*朋友圈图文*/
        int SUBSHOWTYPE_FRIENDS_IMAGE_TEXT = 501;
        /*朋友圈短视频*/
        int SUBSHOWTYPE_FRIENDS_SHORT_VIDEO = 502;
        /*朋友圈转发资讯*/
        int SUBSHOWTYPE_FRIENDS_FORWARD_NEWS = 503;
        /*朋友圈自定义转发*/
        int SUBSHOWTYPE_FRIENDS_CUSTOM_FORWARD = 504;
        /*朋友圈小视频*/
        int SUBSHOWTYPE_FRIENDS_SMALL_VIDEO = 505;

        /*默认类型(不支持的类型)*/
        int DEFAULT_TYPE = 1000;
        int DEFAULT_FRIEND_TYPE = 1001;
        int DEFAULT_NEWS_TYPE = 1002;

    }

    interface GameCirclePraiseType {
        /**
         * 取消赞
         */
        int CANCEL_PRAISE_TYPE = 0;
        /**
         * 点赞
         */
        int PRAISE_TYPE = 1;
    }

    /*****评论或者回复点赞类型***/
    interface CommentOrReplyPraiseType {
        /**
         * 点赞
         */
        int PRAISE_COMMENT_TYPE = 3;
        /**
         * 取消赞
         */
        int CANCEL_COMMENT_PRAISE_TYPE = 4;
    }


    interface GameCirclePageType {
        /**
         * 圈子首页
         */
        int CIRCLE_HOME_TYPE = 1;
        /**
         * 动态详情页
         */
        int CIRCLE_DETAIL_TYPE = 2;
        /**
         * 个人动态页
         */
        int CIRCLE_PERSONAL_TYPE = 3;

    }

    /**
     * 圈子举报的类型
     */
    interface CircleReportObjectType {
        /**
         * 动态类型
         */
        int REPORT_DYNAMIC = 1;
        /**
         * 评论类型
         */
        int REPORT_COMMENT = 2;
        /**
         * 回复类型
         */
        int REPORT_REPLY = 3;


    }

    interface AttentionFansType {
        /**
         * 关注
         */
        int ATTENTION_TYPE = 1;
        /**
         * 粉丝
         */
        int FANS_TYPE = 2;
    }

    interface GameCircleAttentionStatusType {
        /**
         * 不显示
         */
        int HIDE_TYPE = 0;
        /**
         * 未关注
         */
        int UNATTENTION_TYPE = 1;
        /**
         * 已关注
         */
        int ATTENTION_TYPE = 2;
    }

    interface GameCircleMsgStatus {
        /**
         * 全部
         */
        int ALL_TYPE = 1;
        /**
         * 未读
         */
        int UNREAD_TYPE = 2;
    }

    interface IsMeAttention {
        /**
         * 当前用户
         */
        int IsMe = 0;
    }

    /**
     * 消息类型
     */
    interface GameCircleMsgType {
        /**
         * 评论
         */
        int COMMENT_TYPE = 1;
        /**
         * 回复
         */
        int REPLY_TYPE = 2;
        /**
         * 点赞
         */
        int PRAISE_TYPE = 3;
        /**
         * 关注
         */
        int ATTENTION_TYPE = 4;
    }

    /**
     * 消息文本类型
     */
    interface GameCircleMsgTxtType {
        /**
         * 文本
         */
        int TEXT_TYPE = 1;
        /**
         * 图片
         */
        int IMAGE_TYPE = 2;
    }

    /**
     * 游戏圈发布动态类型
     */
    interface GameCircleAddDynamicsType {
        /**
         * 图文（不关联游戏）
         */
        int IMAGE_TEXT_TYPE = 0;
        /**
         * 游戏
         */
        int GAME_TYPE = 1;
        /**
         * 活动或活动分享页
         */
        int ACTIVITY_TYPE = 2;
        /**
         * 礼包或礼包分享页
         */
        int GIFTS_TYPE = 3;
        /**
         * 游戏详情分享页
         */
        int GAME_DETAIL_SHARE_TYPE = 4;
    }

    ///////////////////////////////////新圈子//////////////////////////////////

    /**
     * 动态点赞类型
     */
    interface CircleDynamicPraiseType {
        /**
         * 点赞
         */
        int PRAISE_DYANMIC_TYPE = 1;
        /**
         * 取消赞
         */
        int CANCEL_PRAISE_DYNAMIC_TYPE = 0;
    }


    interface CircleCollectDynamicType {
        /****添加收藏****/
        int ADD_COLLECT_DYNAMIC_TYPE = 1;
        /*****取消动态收藏****/
        int CANCEL_COLLECT_DYNAMIC_TYPE = 0;
    }

    /**
     * 关注类型
     */
    interface CircleAttentionType {
        /**
         * 取消关注
         */
        int CANCEL_ATTENTION = 0;
        /**
         * 关注
         */
        int ATTENTION = 1;
    }

    /**
     * 圈子关注状态
     */
    interface CircleAttentionStatusType {
        /**
         * 不显示
         */
        int HIDE_TYPE = 0;
        /**
         * 未关注
         */
        int UNATTENTION_TYPE = 1;
        /**
         * 已关注
         */
        int ATTENTION_TYPE = 2;
    }

    /**
     * 圈子页面类型
     */
    interface CirclePageType {
        /**
         * 圈子首页
         */
        int CIRCLE_HOME_TYPE = 1;
        /**
         * 动态详情页
         */
        int CIRCLE_DETAIL_TYPE = 2;
        /**
         * 个人动态页
         */
        int CIRCLE_PERSONAL_TYPE = 3;
    }

    /**
     * 圈子url类型
     */
    interface CircleUrlType {
        /**
         * 游戏
         */
        int GAME_TYPE = 1;
        /**
         * 活动
         */
        int ACTIVITY_TYPE = 2;
        /**
         * 礼包
         */
        int GIFTS_TYPE = 3;
        /**
         * 动态
         */
        int DYNAMIC_TYPE = 4;
        /**
         * IM转发
         */
        int IM_TRANSPOND = 5;

        /**
         * 小视频转发
         */
        int SMALLVIDEO_TRANSPOND = 6;

    }

    /**
     * 圈子转发类型
     */
    interface CircleTranspondType {
        /**
         * 转发动态
         */
        int TRANSPOND_DYNAMIC_TYPE = 8;
        /**
         * 转发评论
         */
        int TRANSPOND_COMMENT_TYPE = 9;
    }

    interface CircleMsgStatus {
        /**
         * 全部
         */
        int ALL_TYPE = 1;
        /**
         * 未读
         */
        int UNREAD_TYPE = 2;
    }

    /**
     * 消息类型
     */
    interface CircleMsgType {
        /**
         * 评论
         */
        int COMMENT_TYPE = 1;
        /**
         * 回复
         */
        int REPLY_TYPE = 2;
        /**
         * 动态点赞
         */
        int PRAISE_TYPE = 3;
        /**
         * 关注
         */
        int ATTENTION_TYPE = 4;
        /**
         * 点赞评论
         */
        int PRAISE_COMMENT_TYPE = 5;
        /**
         * 转发
         */
        int TRANSPOND_TYPE = 6;
        /**
         * 举报
         */
        int REPORT_TYPE = 9;
    }

    /**
     * 消息文本类型
     */
    interface CircleMsgTxtType {
        /**
         * 文本
         */
        int TEXT_TYPE = 1;
        /**
         * 图片
         */
        int IMAGE_TYPE = 2;
    }

    /**
     * 屏蔽粘贴字符长度
     */
    interface CirclePasteTxtLength {
        int TEXT_LENGTH = 30;
    }

    ///////////////////////////////////发现//////////////////////////////////

    /**
     * 发现模块代码
     */
    interface DiscoveryModuleType {
        /**
         * 抢红包
         */
        int RED_ENVELOPE_TYPE = 1;
        /**
         * 活动中心
         */
        int ACTIVITY_CENTER_TYPE = 2;
        /**
         * 礼包中心
         */
        int GIFTS_CENTER_TYPE = 3;
        /**
         * 真心话
         */
        int TRUE_WORDS_TYPE = 4;
    }

    /**
     * 发现模块转跳类型代码
     */
    interface DiscoveryModuleGoType {
        /**
         * 发现主页列表
         */
        int GO_TYPE_MAIN = 0;
        /**
         * 模块 web url
         */
        int GO_TYPE_URL = 1;
        /**
         * 模块点游界面
         */
        int GO_TYPE_APP_PAGE = 2;
        /**
         * 模块插件
         */
        int GO_TYPE_PLUGIN = 3;
        /**
         * 点游页面
         */
        int GO_DY_PAGE = 4;
    }

    /**
     * 发现模块插件下载状态
     */
    interface PluginDownloadStatus {
        /**
         * 下载中
         */
        int DOWNLOADING = 1;
        /**
         * 下载成功
         */
        int DOWNLOAD_SUCCESS = 2;
        /**
         * 下载失败
         */
        int DOWNLOAD_FAILURE = 3;
    }

    ////////////////////////////////////////////////////////////////////
    interface MyGiftsFragmentParentActivity {
        int PARENT_ACTIVITY_IS_MainTabActivity = 0;
        int PARENT_ACTIVITY_IS_DiscoveryCenterActivity = 1;
        int PARENT_ACTIVITY_IS_MyGiftsActivity = 2;
    }

    //////////////////////////////////////////////////////////////////

    /**
     * 管理tab类型
     */
    interface ManagementTabType {
        /**
         * 下载管理
         */
        int GAME_DOWNLOAD = 0;
        /**
         * 游戏管理
         */
        int GAME_MANAGE = 1;
        /**
         * 游戏更新
         */
        int GAME_UPDATE = 2;
        /**
         * 游戏缓存
         */
        int GAME_CACHE = 3;
    }

    //////////////////////////////////////////////////////////////////

    /**
     * 点游和红包自动登录流程
     */
    interface AutoLoginDyAndRedEnvelopeStatus {
        /**
         * 登录成功
         */
        int LOGIN_SUCCESS = 1;
        /**
         * 点游登录失败
         */
        int DY_FALIURE = 2;
        /**
         * 红包登录失败
         */
        int REDENVELOPE_FAILUIRE = 3;
    }

    ////////////////////////////////Common//////////////////////////////

    /**
     * 活动礼包公共页面来源
     */
    interface ActGiftsWebViewActivityFromType {
        /**
         * 从热门礼包进入
         */
        int FROMWHERE_HOT_GIFTS = 1;
        /**
         * 从热门活动进入
         */
        int FROMWHERE_HOT_ACT = 2;
    }

    /**
     * 系统类型
     */
    interface DeviceType {
        /**
         *
         */
        int ANDROID = 1;
        /**
         *
         */
        int IOS = 2;
    }

    /**
     * OSS上传成功的Map key
     */
    interface OSSUploadFileSuccessMapKey {
        String FILE_MD5 = "file_md5";
        String FILE_NAME = "file_name";
        String FILE_SIZE = "file_size";
        String FILE_TYPE = "file_type";

        String VOICE_URL = "voice_url";
        String VOICE_LENGTH = "voice_length";

        String IMG_WIDTH = "img_width";
        String IMG_HEIGHT = "img_height";
        String IMG_URL = "img_url";

        String VIDEO_IMG_WIDTH = "video_img_width";
        String VIDEO_IMG_HEIGHT = "video_img_height";
        String VIDEO_IMG_URL = "video_img_url";
        String VIDEO_URL = "video_url";
        String VIDEO_LENGTH = "video_length";

        String FILE_URL = "file_url";
    }

    /**
     * 发布动态的类型
     */
    interface PublishDynamicType {
        String IMAGE_TEXT = "0";
        String GAME = "1";
        String VIDEO = "100";
        String IM_VIDEO = "401";
    }

    /**
     * IM上传文件的类型
     */
    interface IMOSSUploadFileType {
        String IMAGE = "1";
        String VOICE = "2";
        String VIDEO = "3";
        String FILE = "4";
    }

    //////////////////////////////////////////////////////////////////

    /**
     * 消息tab类型
     */
    interface MessageTabType {
        /**
         * 消息
         */
        int MESSAGE_TYPE = 0;
        /**
         * 联系人
         */
        int CONTACTS_TYPE = 1;
        /**
         * 我的
         */
        int PERSONAL_CENTER_TYPE = 2;
    }


    /**
     * 性别
     */
    interface Sex {
        /**
         * 男
         */
        String MALE = "M";
        /**
         * 女
         */
        String FEMALE = "F";
    }

    /**
     * 返回拦截弹窗类型
     */
    interface BackDialogType {
        /**
         * 红包
         */
        int RED_ENVELOPE = 1;
        /**
         * 圈子
         */
        int CIRCLE = 2;
        /**
         * 真心话
         */
        int TRUE_WORDS = 3;
    }

    interface CircleProtocolType {
        /**
         * 跳转协议分享到im
         * dycircle://defaultpackage/share2im?Base64StringArgs=
         */
        String SHARE_TO_IM = "/share2im";
        /**
         * 打开播放器
         * dycircle://defaultpackage/videoPlayer?Base64StringArgs=
         */
        String VIDEO_PLAYER = "/videoPlayer";
        /***
         * 打开网页
         * dycircle://defaultpackage/http?Base64StringArgs=网址
         */
        String HTTP = "/http";
        /**
         * 路由页面
         * dycircle://defaultpackage/router?Base64StringArgs=参数由客户端提供
         */
        String ROUTER = "/router";
        /**
         * 请求服务端接口
         * dycircle://defaultpackage/api?Base64StringArgs=参数由服务端提供
         */
        String API = "/api";

        /**
         * 影视服务
         * dycircle://defaultpackage/movieservice?Base64StringArgs=
         */
        String MOVIE_SERVICE = "/movieservice";

        /**
         * 音乐服务
         * dycircle://defaultpackage/movieservice?Base64StringArgs=
         */
        String MUSIC_SERVICE = "/musicservice";

        /**
         * 本地处理
         * dycircle://defaultpackage/native?Base64StringArgs={"type":1, "value":"json string"}
         */
        String NATIVE = "/native";
    }

    interface NativeType {
        // 匿名聊天
        int ANONYMITY_CHAT = 1;
        // 音视频通话
        int VOIP = 2;
    }

    /**
     * 网页加载是否需要header
     */
    interface LoadWithHeader {

        int NO = 0;

        int YES = 1;
    }


    interface StockPos {

        int STOCK = 0;

        int MONEY = 1;
    }


    /**
     * H5业务
     */
    interface WebBusiness {

        int HEADER = 0x100; //titlebar下面

        int NONE = 0;//titlebar透明

        int USER_LIVENESS = 1; //活跃度界面

        int BOX_AWARD = 2; //宝箱奖励界面

        int UPGRADE_GUIDE = 3; //用户升级页面

        int RED_ENVELOPE_CARD = 4; //红包卡

        int STOCK_PKG = 5; //知识币钱包

        int STOCK_BILL = 6;//知识币账单

        int FEEDBACK_PAGE = 7; //用户反馈

        int REDENVELOPE_SELF = 8; //自己的红包结算页

        int REDENVELOPE_FRIEND = 9; // 好友红包结算页

        int REDENVELOPE_STRANGER = 10; //陌生人好友红包结算页

        int ECO = 11; //经济

        int NEWS_COMMENT = 12; //今日头条评论

        int TEACHER_MASTER = 13; //邀请入团

        int WITHDRAW = 14;  // 提现

        int WITHDRAW_RECORD = 15;  // 提现记录

        int PROFITS_STOCK = 16;  // 知识币分红

        int PROFITS_RECORD = 17;  // 分红记录

        int MAKE_MONEY = 18;  // 赚零钱

        int PARTNERPAGE = 19;  // 申请成为合伙人

        int SHARE_TRANSFER = 20; //分享中转

        int ENERGY = 21; //能量池

        int ENERGY_B = 22;

        int STOCK_EXPLAIN = 23; // 瓜子说明

        int TODAY_ACTIVENESS_RECORD = 24;   // 今日活跃度记录

        int PARTNER_EXPLANATION = 25;   // 招募合伙人

        int PREVIOUS_WITHDRAW_RECORD = 26;   // 往期提现记录

        int ACTIVITY_CENTER = 27; // 活动中心

        int MY_BONUS = 28; // 我的分红

        int CG_CURRENCY_DATA = 29; // 瓜子价格相关数据

        int CG_CURRENCY_PRIVILEGE = 30; // 瓜子特权

        int TODAY_PROJECTED_REVENUE = 31; // 今日预计收入

        //32 ios端已被使用
        int CONTRIBUTION_LIST = 33;//师徒贡献榜

        // (提现新增客服入口需求 @link https://www.tapd.cn/21462461/prong/stories/view/1121462461001006333)
        int WITHDRAW_STATE = 34;// 提现说明
        int WITHDRAW_BIND_CARD = 35;// 提现绑卡页面
        int WITHDRAW_BOUND_CARD = 36;// 提现页面（输入金额页面）

        int MANAGE_BALANCE = 37; // 商家余额页面
        int BALANCE_WITHDRAW = 38; // 商家余额提现页面
        int SEO_PAGE = 39; // 推广页面
        int SEO_FRIEND_LIST = 40; // 推广好友列表
        int REQUEST_ACCESS = 41; // 开通权限回购福利
        int AUTO_WITHDRAW = 42; // 自动提现


    }

    /**
     * 悬浮球功能区
     */
    interface Function {

        int NOTIFY_SWITCH = 1; //开启/关闭通知

        int STOCK_PKG = 2; //知识币

        int LIVENESS = 3; //活跃度

        int GAME = 4; //游戏

        int MAKE_FRIENDS = 5; //交朋友

        int FLIM_DONATE = 6; //赠片

        int ORGANIZATION = 7;//组织

        int FOOD = 8; //美食

        int PHOTO_GRAPHY = 9; //摄影

        int TRAVEL = 10; //旅游

        int DESKTOP = 11; //添加到桌面

        int UPDATE = 12; //版本更新

        int BROWSER = 13; //浏览器

        int MORE = 0x100; //更多

        int PEANUT_SUBWAY = 14;//花生地铁wifi

        int Report_Problem = 15;//问题反馈

    }


    interface EcoPager {

        int PRODUCER = 1;

        int CONNECTOR = 2;

        int SERVICER = 3;

        int SPREADER = 4;

        int CONSUMER = 5;

    }

    interface StockPageSource {

        String STOCK_FLOATBALL = "suspensionBall";

        String STOCK_DEFAULT = "";
    }


    interface DyDetailOnActivityResultAction {

        int ToShare = 1;

        int ToDetailCommentArea = 2;

        int ToDetailServicesArea = 3;

    }

    interface FloatBallGuide {
        // 将悬浮球放入回收站引导
        int TRASH_FLOAT_BALL = 1;
        // 点击悬浮球引导
        int CLICK_FLOAT_BALL = 2;
    }


    interface UnitySearchTAG {

        String SEARCH_TAG = "SEARCH_TAG";

        String RESULT_TAG = "RESULT_TAG";

        String NULL_TAG = "NULL_TAG";//不存在
    }

    interface AdvertisePostionType {
        String INFORMATION_FLOW = "1";   // 信息流广告位
        String BANNER = "2"; // banner广告位
        String OPEN_SCREEN = "3";    // 开屏广告位
        String TABLE_PLAQUE = "4";   // 插屏广告位
        String VIDEO = "5";  // 视频广告位
        String RED_PACKET = "6"; // 红包广告位
    }

    interface AdvertiseShowSourceType {
        String NEWS_LIST_PAGE = "1"; // 资讯列表页
        String NEWS_DETAILS = "2";   // 资讯详情
        String MUSIC_LIST_PAGE = "3";     // 音乐列表页
        String MUSIC_PLAY_PAGE = "4";    // 音乐播放页
        String MOVIE_PLAY_BEFORE = "5";  // 影视播放前
        String MOVIE_PLAY_SUSPEND = "6"; // 影视播放暂停
        String MOVIE_PLAY_OVER = "7";    // 影视播放结束
        String CINEMA_PLAY_BEFORE = "8";     // 电影播放前
        String CINEMA_PLAY_SUSPEND = "9";    // 电影播放暂停
        String CINEMA_PLAY_OVER = "10";  // 电影播放结束
        String NOVEL_DETAIL_PAGE = "11";  // 小说详情页
    }

    interface AdvertiseSourceType {
        String DIANYOU = "1";    // 点游平台
        String TENCENT = "2";    // 腾讯
        String BAIDU = "3";  // 百度
        String THIRD_PARTY_OTHER = "4";  // 其它第三方
    }

    interface AdvertiseType {
        String LARGE_PICTURE = "1";  // 大图
        String BANNER = "2"; // banner
        String FULL_SCREEN = "3";    // 全屏
        String GIF = "4";    // gif
        String IMAGE_TEXT = "5"; // 图片+文字
        String VIDEO = "6";  // 视频广告
        String REDPACKET_REWARD_SMALL_PICTURE = "7"; // 红包奖励广告（小图）
        String POPUP = "8";  // 弹窗广告
    }

    interface UserActionType {
        String SHOW = "1";   // 曝光
        String CLICK = "2";  // 点击
    }

    /*interface DynamicDetailSourceType {
        int NORMAL = 0; // 正常、im进入
        int PRODUCT_SERVICE = 1;    // 产品服务进入
        int FORWARD = 2;    // 转发进入
        int RELATED_NEWS = 3;   // 相关推荐进入
    }*/


    //统一搜索的类型
    interface UnitySearchType {

        String ALL = "all";

        String MOVIE = "movie";

        String VIDEO = "video";

        String SMALLVIDEO = "smallVideo";

        String PHOTO = "photo";

        String CONTENT = "content";

        String MUSIC = "music";

        String BAIDU = "baidu";

        String FRIEND = "friend"; //朋友圈

        String USER = "user";

        String GROUP = "group";

        String CHAT = "chat";

        String CHIGUAKETANG = "chiGuaKeTang";

        String SHENZHENHAO = "shenZhenHao";

        String SHENZHENHAOARTICLE = "shenzhenhaoarticle";

        String SHENZHENHAOQUESTION = "shenzhenhaoquestion";

        String NOVEL = "novel";

    }

    interface CenterInfoType {

        int IMAGE = 1;

        int TEXT = 2;

    }


    interface ServicesGroup {

        String GROUP_PUBLISH = "10"; //发布转发

        String GROUP_COMMENT = "10"; //评论 (暂时与发布转发一样)

        String GROUP_SEARCH = "9"; //搜索

    }


    interface CurrentOperationPage {

        int PUBLISH = 1; //发布转发
        int COMMENT = 2; //评论
        int TRANSPOND = 3; //转发

    }


    interface OpenNewWindowType {
        //1进入RedEnvelopeX5WebviewActivity 全屏显示
        String toX5Webview = "1";
        //为2进入普通webview SpecialAreaDetailWebviewActivity
        String toNormalWebview = "2";
        //3进入RedEnvelopeX5WebviewActivity 有titlebar
        String toX5Webview_has_title = "3";
    }


    interface SearchEntrance {

        int DEFAULT = 0; //默认

        int SERVICE = 1; //添加服务

        int SHARE = 2; //分享

        int MOVIE = 3; //影视

        int SMALLVIDEO = 4; //小视频

        int CHIGUACLASS = 5; //吃瓜课堂

        int INFORMATION = 6; //资讯

        int SHENZHENHAO = 7;//深圳号

        int NOVEL = 8; //小说

    }

    interface UpdateUserInfoType {
        // 头像
        String HEAD_PORTRAIT = "1";
        // 昵称
        String NICKNAME = "2";
        // 个性签名
        String SIGNATURE = "6";
        // 性别
        String GENDER = "7";
        // 帐号
        String ACCOUNT = "100";
        // 实名信息
        String REAL = "100";
    }

    interface HomeTabName {
        String MOVIE = "影视";
        String GAME = "游戏";
        String BEAUTY = "美女";
        String ORGANIZATION = "组织";
        String SMALLVIDEO = "小视频";
        String COMPANY = "开公司";
        String NOVEL = "小说";
        String DEBATER = "最佳辩手";
//        String I_WILL_HELP_YOU = "我帮你说";
//        String BEAUTY_CHAT = "美女陪聊";
//        String EAT_MELON = "瓜子";
//        String TRUTH = "真心话交友";
//        String COLLECTION_BILL = "收款小账本";
//        String ACTIVE = "活跃度";
//        String ENERGY_POOL = "能量池";
//        String LANDLORD = "斗地主";
//        String BIG_COFFEE_LANDLORD = "大咖斗地主";
//        String HAND_SPEED = "测手速";
//        String SUBWAY_HOT_CHAT = "地铁热聊";
//        String BROWSER = "浏览器";
//        String COMPANY_RESEARCH_REPORT = "公司研报";
//        String EAT_MELON_MALL = "吃瓜商城";
//        String FINANCIAL_CENTER = "金融中心";
//        String EAT_MELON_LANDLORD = "吃瓜斗地主";
//        String GREAT_GOD_FISHING = "大神捕鱼";
//        String GAME_CENTER = "游戏中心";
//        String SOUL_MATCH = "灵魂匹配";
//        String BOSS_SPEAK = "BOSS开讲";
//        String SERVICE_CENTER = "服务中心";

    }

    interface ProgressDialogBackground {
        String DEFAULT = "default";//默认
        String TRANSLUCANT = "translucant"; //背景透明
    }


    interface ShortVideoScene {

        int NORMAL = 0; //一般

        int RECOMMEND = 1; //推荐

        int FULL_SCREEN = 2; //全屏

        int ID_REQ = 3; // 只传ID,请求详情

        int LIKE = 4; //喜欢

        int CIRCLE = 5; //圈子

        int FRIEND = 6; //朋友圈

        int CLASS_ROOM = 7; //吃瓜

        int SINGLE_REQ = 8; //播放一个视频，并请求

        int MINIPROGRAM_COLUMNS = 9; //小程序栏目


    }

    interface CircleSpecialEntrance {

        int DEFAULT = 0;

        int SHARE = 2;
    }

    interface DynamicType {

        String FRIEND = "0"; //朋友圈

        String PERSONAL = "1"; //个人动态

        String CLASSROOM_DIALOG = "2"; //吃瓜课堂弹窗

        String HISTORY_COLLECT = "3"; //浏览历史

    }


    interface DynamicSubType {

        String DEFAULT = "default";

        String COMMENT = "comment";

        String SHARE = "share";

        String CLASS_ROOM = "class_room";//吃瓜课堂类型

    }


    interface PayType {

        int STOCK = 8;
        int RED_CASH = 5;
        int WALLET = 2;
    }


    interface FlingType {
        String LEFT = "left";    //左滑
        String RIGHT = "right";  // 右滑
    }

    /**
     * 吃瓜课堂专题类型
     */
    interface ClassRoomType {
        /**
         * 吃瓜课堂
         */
        String CLASSROOM_TYPE = "241";
        /**
         * 新手引导
         */
        String NOVICE_GUIDE_TYPE = "243";
        /**
         * 进阶教程
         */
        String ADVANCED_TYPE = "245";
        /**
         * 实例
         */
        String EXAMPLE_TYPE = "247";
        /**
         * 常见问题
         */
        String COMMON_PROBLEM_TYPE = "249";
        /**
         * 公司价值
         */
        String COMPANY_VALUE_TYPE = "251";
        /**
         * 运营价值
         */
        String OPERATION_VALUE_TYPE = "253";
        /**
         * 推广价值
         */
        String PROMOTION_VALUE_TYPE = "255";
        /**
         * 锚定物
         */
        String ANCHORAGE_TYPE = "257";
        /**
         * 产品价值
         */
        String PRODUCT_VALUE_TYPE = "259";

        /**
         * 新的吃瓜课堂分组id
         */
        String NEW_CLASSROOM_TYPE = "8";
        /**
         * 新的公司价值分组id
         */
        String NEW_COMPANY_VALUE_TYPE = "15";
    }


    interface CourseID {

        String ANCHOR = "40580923";

        String IOS_TRUST = "32912431";

    }

    /**
     * 设置资料类型
     */
    interface SettingDataType {

        String BLACK_LIST = "hmd";

        /**
         * 不看他
         */
        String NOT_LOOKHIM_CIRCLE = "notLookHimCircle";
        /**
         * 不让他看
         */
        String NOT_ALLOWED_SEEME_CIRCLE = "notAllowedSeeMeCircle";

    }

    /**
     * 用户设置页面类型
     */
    interface SettingPageType {

        String OPEN_SUSPENDED_BALL = "kqxfq";

        String INSTAL_SUCCESS_DELETE_APK = "azcghscapkb";

        String RED_PUSH = "hbts";

        String DYNAMIC_PUSH = "dtts";

        String ALLOW_BY_PHONE_FIND_ME = "yxtgcsjhzdw";

        String ONLY_RECEIVE_CONTACT_MSG = "zjslxrxx";

        String ONLY_CONTACT_PUBLIC_MY_PHONE = "dlxrgkwdsjh";

        String ALLOW_RECOMMEND_ADDRESS_BOOK_FRIEND = "yxgwtjtxlhy";
        /**
         * 允许陌生人查看十条朋友圈
         */
        String ALLOW_STRANGER_SEE_FRIEND_CIRCLE = "allowStrangerSeeCircle";
        /**
         * 朋友圈更新提醒
         */
        String CIRCLE_FRIEND_CHANGE_REMIND = "circleFriendChangeRemind";

    }

    /**
     * 用户新消息通知配置
     */
    interface MessageNoticeConfig {

        String NEW_MESSAGE_PUSH_SHOW = "newMessagePushShow";

        String NO_START_WHEN_CALL_REMIND_RES = "noStartWhenCallRemindRes";

        String FRIEND_INVITED_REMIND = "friendInvitedRemind";

        String NO_START_WHEN_NEW_MESSAGE_NOTICE = "noStartWhenNewMessageNotice";

        String CIRCLE_DYNAMIC_REMIND = "circleDynamicRemind";


    }


    interface PreviewFrom {

        int CIRCLE = 0;
        int IM = 1;
        int RED_ENVELOPE = 2;
        int HIDE_OTHER = 3;//隐藏类型
        int SHOW_OTHER = 4;//显示类型

    }

    interface RedApiBusType {

        String BLAME = "1";
        String CHAT = "2";

    }


    interface ChannelName {
        String SMALL_VIDEO = "小视频";
        String RECOMMEND = "推荐";
        String MOVIE = "影视";
        String FRIEND_DES = "朋友圈";
    }


    interface EnergyState {

        int PERSONAL = 1;

        int TEAM = 2;

    }


    /**
     * 吃瓜课堂ID
     */
    interface ChiGuaClassId {
        /**
         * 如何玩转真心话匿名聊天
         */
        String HOW_PLAY_ANONYMOUS_CHAT = "41502977";
        /**
         * 如何使用任务红包
         */
        String HOW_APPLY_TASK_RED_ENVELOPE = "31901297";
        /**
         * 怎样举报违规用户
         */
        String HOW_REPORT_VIONLATION_USER = "45829845";
        /**
         * 如何快速升级
         */
        String HOW_FAST_UPGRADE = "45836145";
        /**
         * 产品服务范例说明
         */
        String PRODUCT_SERVICE_EXPLAIN = "27380061";
        /**
         * 如何添加网页服务
         */
        String HOW_ADD_WEB_PAGE_SERVICE = "41491597";
        /**
         * 如何添加音乐服务
         */
        String HOW_ADD_MUSIC_SERVICE = "41493047";
        /**
         * 如何添加影视服务
         */
        String HOW_ADD_VIDEO_SERVICE = "41493161";
        /**
         * 如何添加资讯服务
         */
        String HOW_ADD_NEWS_SERVICE = "41492463";
        /**
         * 如何添加小视频服务
         */
        String HOW_ADD_SMALL_VIDEO_SERVICE = "45832705";
        /**
         * 如何添加产品服务
         */
        String HOW_ADD_PRODUCT_SERVICE = "27346909";
        /**
         * 活跃度明细
         */
        String LIVENESS_DETAILS = "41492861";
        /**
         * 真心话私聊技巧
         */
        String TRUE_WORDS_ADEPT = "44821667";
        /**
         * 师徒运营群公告
         */
        String MASTER_GROUP_NOTICE = "41495515";
        /**
         * 知识币钱包
         */
        String STOCK_PKG = "41492933";
        /**
         * 知识币说明
         */
        String STOCK_EXPLAIN = "41490285";
        /**
         * 消息-社交玩法
         */
        String IM_PLAYING_METHOD = "32945009";
        /**
         * 师徒功能下推广分享
         */
        String MASTER_SHARE = "41579311";
        /**
         * 我帮你说
         */
        String HELP_YOU_SAY = "41496823";
        /**
         * 用户首次频繁切换菜单页功能时的弹窗提示
         */
        String START_APP_MAIN_TAB_CLICK = "51226705";

        /**
         * 如何使用社交工具
         */
        String FIRST_CLICK_ADD = "30337141";
        /**
         * 首次在匿名房间中发真心话问题
         */
        String FIRST_TRUE_WORDS_QUESTION = "41499433";
        /**
         * 首次与通讯录好友聊天时
         */
        String FIRST_ADDRESS_LIST_FRIEND = "32950765";
        /**
         * 首次使用邀请入团工具邀请入团后（发出邀请即算使用过）
         */
        String FIRST_INVITATION_TOOL = "31109397";
        /**
         * 首次进入自己的师徒群聊(团长身份)（在群内发布消息后触发）资讯非小视频
         */
        String FIRST_INTO_MASTER_GROUP = "27384355";
        /**
         * 首次进入自己的师徒群聊(亲友身份)（在群内发布消息后触发）
         */
        String FIRST_INTO_MASTER_GROUP_DI = "41588537";
        /**
         * 首次进入自己的师徒群聊(团长身份)(群超过5人)（在群内发布消息后触发）
         */
        String FIRST_INTO_MASTER_GROUP_MORE = "45829137";


        /**
         * 分红说明
         */
        String DIVIDEND_EXPLAIN = "41490895";
        /**
         * 知识币价格说明
         */
        String EQUITY_CURRENCY_PRICE_EXPLAIN = "41491961";
        /**
         * 如何设置隐私与勿扰
         */
        String SET_PRIVACY = "44820815";
        /**
         * 如何快速获取知识币
         */
        String HOW_FAST_GET_QEUITY_CURRENCY = "44820719";
        /**
         * 吃瓜二维码收款视频
         */
        String PAY_TUTORIAL = "57317812";
        /**
         * 参与活跃度任务活动的倡议书
         */
        String JOIN_LIVENS_BOOK = "80551834";

    }

    /**
     * 匿名资料
     */
    interface NoDisturb {
        /**
         * 默认开始时间
         */
        String NO_DISTURB_START_TIME_DEFAULT = "22:00";
        /**
         * 默认结束时间
         */
        String NO_DISTURB_END_TIME_DEFAULT = "07:00";

    }

    interface NoDisturbNotifcationAction {
        /**
         * 1:仅响铃
         */
        int ONLY_SOUND = 1;
        /**
         * 2:不响铃,不振动;
         */
        int NO_SOUND_VIBRATE = 2;
        /**
         * 3:仅振动
         */
        int ONLY_VIBRATE = 3;
    }

    interface NoDisturbModeSwitch {
        int OPEN = 1;
        int CLOSE = 2;
    }

    interface NoDisturbIntType {
        /**
         * 开关勿扰模式
         */
        int NO_DISTURB_USER_STATUS = 1;
        /**
         * 免打扰模式开始时间
         */
        int NO_DISTURB_START_TIME = 2;
        /**
         * 免打扰模式结束时间
         */
        int NO_DISTURB_END_TIME = 3;
        /**
         * 免打扰模式提醒方式
         */
        int NO_DISTURB_MODE = 4;
    }


    interface SendRedPageErrorCode {
        /**
         * 未实名认证
         */
        String UNREALIZE_AUTHENTICATION = "20501";
        /**
         * 发送知识币红包权限不足
         */
        String EQUITY_CURRENCY_RED_PACK_PERMIT_INSUFFICITENT = "20502";
        /**
         * 知识币余额不足
         */
        String EQUITY_CURRENCY_OVER_INSUFFICITENT = "20503";
    }

    interface PayScene {
        /**
         * 默认支付场景
         */
        String PAY_SCENE_DEFAULT = "PAY_SCENE_DEFAULT";
        /**
         * 购买红包VIP场景
         */
        String PAY_SCENE_REDVIP = "PAY_SCENE_REDVIP";
        /**
         * 购买红包钻石场景
         */
        String PAY_SCENE_REDDIAMOND = "PAY_SCENE_REDDIAMOND";

        /**
         * 单聊转匿名私聊   支持信用卡
         */
        String PAY_SCENE_ONLYCHAT_ANONYMOUS = "PAY_SCENE_ONLYCHAT_ANONYMOUS";
        /**
         * 群聊转匿名群     支持信用卡
         */
        String PAY_SCENE_GROUPCHAT_ANONYMOUS = "PAY_SCENE_GROUPCHAT_ANONYMOUS";
        /**
         * 创建匿名私聊     支持信用卡
         */
        String PAY_SCENE_CREATE_ANONYMOUS = "PAY_SCENE_CREATE_ANONYMOUS";
        /**
         * 加入真心话房间   支持信用卡
         */
        String PAY_SCENE_JOIN_SINCERE_ROOM = "PAY_SCENE_JOIN_SINCERE_ROOM";
        /**
         * 真心话发题
         */
        String PAY_SCENE_SINCERE_QUESTION = "PAY_SCENE_SINCERE_QUESTION";
        /**
         * 题库购买        支持信用卡
         */
        String PAY_SCENE_BUY_QUESTION = "PAY_SCENE_BUY_QUESTION";
        /**
         * 重置匿名房员匿名信息  支持信用卡
         */
        String PAY_SCENE_RESET_ANONYMOUS = "PAY_SCENE_RESET_ANONYMOUS";
        /**
         * 美女付费聊天   支持信用卡
         */
        String PAY_SCENE_BEAUTY_PAY_CHAT = "PAY_SCENE_BEAUTY_PAY_CHAT";
        /**
         * 付费发送短信   支持信用卡
         */
        String PAY_SCENE_PAY_SEND_SMS = "PAY_SCENE_PAY_SEND_SMS";
        /**
         * 推广分享私聊
         */
        String PAY_SCENE_SPREAD_ONLYCHAT_SHARE = "PAY_SCENE_SPREAD_ONLYCHAT_SHARE";
        /**
         * 发红包
         */
        String PAY_SCENE_RED_PACKETS = "PAY_SCENE_RED_PACKETS";
        /**
         * 转账
         */
        String PAY_SCENE_TRANSFER_ACCOUNT = "PAY_SCENE_TRANSFER_ACCOUNT";
        /**
         * 扫码支付
         */
        String PAY_SCENE_SCAN_PAYMENT = "PAY_SCENE_SCAN_PAYMENT";
        /**
         * 零钱充值
         */
        String PAY_SCENE_RECHARGE = "PAY_SCENE_RECHARGE";
        /**
         * 兑换代金券
         */
        String PAY_SCENE_SCAN_VOUCHER_PAYMENT = "PAY_SCENE_SCAN_VOUCHER_PAYMENT";

    }

    /**
     * 红包or转账
     */
    interface CommonPayType {
        /**
         * 发送红包类型
         */
        int RED_PACKAGE_TYPE = 1;
        /**
         * 转账类型
         */
        int TRANSFER_TYPE = 2;
        /**
         * 充值类型
         */
        int RECHARGE_TYPE = 3;
    }

    interface DYPayType {
        /**
         * 支付宝支付
         **/
        String ZFB_PAY = "1";
        /**
         * 微信支付
         **/
        String WX_PAY = "2";
        /**
         * 钱包支付
         **/
        String WALLET_PAY = "7";
    }

    /**
     * 缓存数据key
     */
    interface CacheDataTimeKey {
        String TYPE_CACHE_TIME_CIRCLE = "type_time_circle_cache_%s_%s";//圈子%s userid, %s频道id
        String TYPE_CACHE_TIME_SMALL_VIDEO_RECOM = "type_time_small_video_recom_cache_%s";//%s userid
        String TYPE_CACHE_TIME_CLASS_ROOM = "type_cache_file_class_room_%s_%s";
    }

    interface CacheDataUniqueName {
        String TYPE_CACHE_FILE_MOVIE_CHOICE = "type_movie_choice_cache_%s";//%suerid
        String TYPE_CACHE_FILE_MOVIE_TV = "type_movie_tv_cache_%s";
        String TYPE_CACHE_FILE_MOVIE_TAB = "type_movie_tab_cache_%s";
        String TYPE_CACHE_FILE_SMALL_VIDEO_LIKE = "type_small_video_like_cache_%s";
        String TYPE_CACHE_FILE_SMALL_VIDEO_RECOM = "type_small_video_recom_cache_%s";
        String TYPE_CACHE_FILE_PERSON_DYNAMIC = "type_person_dynamic_cache_%s";
        String TYPE_CACHE_FILE_CONTACT_FRIEND = "type_contact_friend_cache_%s";
        String TYPE_CACHE_FILE_CONTACT_APPRENTICE = "type_contact_apprentice_cache_%s";
        String TYPE_CACHE_FILE_CONTACT_CUSTOMER = "type_contact_customer_cache_%s";

        String TYPE_CACHE_FILE_NEW_FRIEND_PAGE = "type_new_friend_page_cache_%s";
        String TYPE_CACHE_FILE_ATTENTION_AUTHOR_PAGE = "type_attention_author_page_cache_%s";
        String TYPE_CACHE_FILE_GROUP_CHAT_LIST_PAGE = "type_group_chat_list_page_cache_%s";

        String TYPE_CACHE_FILE_RANKLIST_PAGE_ONE = "type_cache_file_ranklist_page_one_%s";
        String TYPE_CACHE_FILE_RANKLIST_PAGE_TWO = "type_cache_file_ranklist_page_two_%s";
        String TYPE_CACHE_FILE_RANKLIST_PAGE_THREE = "type_cache_file_ranklist_page_three_%s";

        String TYPE_CACHE_FILE_CIRCLE_HOME_CHANNEL = "type_cache_file_circle_home_channel_%s";
        String TYPE_CACHE_FILE_CLASS_ROOM = "type_cache_file_class_room_%s_%s";
        String TYPE_CACHE_FILE_GROUP_MANAGEMENT = "type_cache_file_group_management_%s";
        String TYPE_CACHE_FILE_GROUP_AT = "type_cache_file_group_at_%s";
        String TYPE_CACHE_FILE_GROUP_SHOW_MORE = "type_cache_file_group_show_more_%s";//查看更多的群成员/房间成员
        String TYPE_CACHE_FILE_ADD_FRIEND = "type_cache_file_add_friend_%s";//添加朋友
    }

    interface LoadMoreType {
        int TYPE_LOADING = 0;
        int TYPE_NO_MORE = 1;
        int TYPE_LOAD_FAILED = 2;
    }

    interface ScanType {
        /**
         * 添加朋友类型
         */
        String ADD_FRIEND_TYPE = "1";
        /**
         * 转账类型
         */
        String TRANSFER_TYPE = "3";
        /**
         * 转账类型 适配新版
         */
        String TRANSFER_TYPE_NEW = "5";
        /**
         * 跳转小程序类型
         */
        String TO_APPLETS_TYPE = "4";
        /**
         * 执行吃瓜跳转协议
         */
        String TO_PROTOCOL = "6";
    }

    interface AppletsType {
        /**
         * 小程序类型
         */
        int APPLETS_TYPE = 1;
    }

    interface CheckType {
        String TYPE_UPDATE_APP = "1";
    }

    interface BooleanType {

        int YES = 1;

        int NO = 0;

        String YES_STR = "1";

        String NO_STR = "0";

    }

    interface FontSizeType {
        int SMALL_TYPE = 1;
        int STANDARD_TYPE = 2;
        int BIG_TYPE = 3;
        int ESPECIALLY_BIG_TYPE = 4;
    }

    interface PermissionType {

        String ALLOW_PERMISSION = "1";

        String NOT_ALLOW_PERMISSION = "2";

    }

    interface BroadcastType {
        int EAT_COINS_TYPE = 1;//瓜子类型广播

        int GOLD_ACTIVITY_TYPE = 2;//金券活动广播
    }


    interface RequestType {
        /**
         * 圈子推荐页
         */
        String CIRCLE_RECOMMEND = "circle.homepage.recommend";
        /**
         * 圈子朋友圈
         */
        String CIRCLE_FRIEND = "circle.homepage.friend";
        /**
         * 视频
         */
        String CIRCLE_VIDEO = "circle.homepage.video";
        /**
         * 小视频
         */
        String CIRCLE_SMALLVIDEO = "circle.homepage.smallvideo";
        /**
         * 美女
         */
        String CIRCLE_BEAUTY = "circle.homepage.beauty";
        /**
         * 小说
         */
        String CIRCLE_NOVEL = "circle.homepage.novel";
        /**
         * 其他频道
         */
        String CIRCLE_OTHER = "circle.homepage.other";
    }

    interface RequestChannelType {
        /**
         * 吃瓜频道
         */
        String CHANNEL_CHIGUA_TYPE = "circle.channel.chigua";
        /*吃瓜新结构*/
        String CHANNEL_CHIGUA_V1_TYPE = "circle.channel.chigua.v1";
        /**
         * 读特频道
         */
        String CHANNEL_DUTE_TYPE = "circle.channel.dute";
        /**
         * 鹿邑频道
         */
        String CHANNEL_LUYI_TYPE = "circle.channel.luyi";
    }

    interface CircleCommentType {
        String ADD_COMMENT = "circle.add.comment";//评论
        String DELETE_COMMENT = "circle.delete.comment";//删除评论
        String ADD_COMMENT_TRANSPOND = "circle.add.commentAndTranspond";//评论同时转发
        String ADD_REPLAY = "circle.add.replay";//回复评论
        String DELETE_REPLAY = "circle.delete.replay";//删除回复
    }

    interface PariseCommentType {
        String PRAISE_CONTENT = "circle.content.praise";//资讯点赞
        String PRAISE_COMMENT = "circle.comment.praise";//评论点赞
        String DELETE_PRAISE_CONTENT = "circle.delete.content.praise";//取消资讯点赞
        String DELETE_PRAISE_COMMENT = "circle.delete.comment.praise";//取消评论的点赞
    }

    interface CircleSceneType {
        String TYPE_DYNAMIC_DETAIL = "circle.content.detail";//资讯详情
        String TYPE_DYNAMIC_ALL_DETAIL = "circle.content.all.detail";//没有原始数据通过id获取所有数据
        String TYPE_COMMENT_LIST = "circle.comment.list";//资讯评论列表
        String TYPE_REPLY_LIST = "circle.reply.list";//咨询回复列表
        String TYPE_PRAISE_LIST = "circle.praise.list";//点赞列表
        String TYPE_COMMENT_PRAISE_LIST = "circle.comment.praise.list";//回复评论里的点赞列表
        String TYPE_COMMENT_SETTING = "circle.comment.setting";//圈子第三方评论URL
        String TYPE_CHANNEL_MODIFY = "circle.channel.modify";//用户修改频道

    }

    interface PraiseStateType {

        String NO_PRAISE = "0"; //未点赞

        String HAS_PRAISE = "1"; //已点赞

    }


    interface ServiceNumber {
        /**
         * 吃瓜课堂
         */
        String CHI_GUA_KE_TANG = "1591025";
        /**
         * 读特金融管家
         */
        String DUTE_MONETARY_SENESCHAL = "1768885";
    }

    interface ReportEventStatistics {
        /**
         * 上报进入金融官方理财群事件
         */
        String addBusinessGroup = "e_add_business_group";
    }


    interface TransitionAction {

        String METRO_CHAT_ACTION = "metro_chat_action";

    }


    interface AdStateType {

        int TYPE_AD_MASONRY = 1;//金币状态

        int TYPE_AD_GOLD_COIN = 2;//砖石状态

    }

    interface AdReceiveNumber {
        /**
         * 领取广告奖励第一次
         */
        int TYPE_ONE = 1;
        /**
         * 领取广告奖励第二次
         */
        int TYPE_TWO = 2;
        /**
         * 领取广告奖励第三次
         */
        int TYPE_THREE = 3;
    }

    interface ProgressAdStateType {

        int TYPE_REQUEST = 1;

        int TYPE_SHOW_AD = 2;

        int TYPE_HIDE_AD = 3;
        /**
         * 显示toast
         */
        int TYPE_SHOW_TOAST = 4;
    }

    interface SceneCode {
        //朋友圈
        String SCENECODE_CIRCLE_FRIEND = "circle.friend";
        //k歌之王
        String SCENECODE_SONGS_KING = "songs.of.king";
        //boss开讲
        String SCENECODE_BOSS_LECTURE = "boss.lecture";
        //最佳辩手
        String SCENECODE_DEBATER = "best.debater";
    }


    interface AuthorType {
        /**
         * 1-公开，2-私密 3-选择参与的人 4-选择不参与的人
         */
        String TYPE_PUBLIC = "1";
        String TYPE_PRIVATE = "2";

        String TYPE_SUB_PUBLIC = "3";

        String TYPE_SUB_PRIVATE = "4";


    }

    interface NearbyType {
        /**
         * 附近商家
         */
        String BUSINESS = "chigua.nearby.merchant";
        /**
         * 附近的服务
         */
        String SERVICE = "chigua.nearby.service";
        /**
         * 附近资讯
         */
        String INFORMATION = "chigua.nearby.content";
        /**
         * 附近的人
         */
        String PEOPLE = "chigua.nearby.people";
        /**
         * 附近群组
         */
        String GROUP = "chigua.nearby.group";
    }


}
