DESCRIPTION = "Low-level build system macros and infrastructure for ROS"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake python-empy python-catkin-pkg python-empy-native python-catkin-pkg-native"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "66f89dd5f7dbeb1662ff32890acabd70"
SRC_URI[sha256sum] = "2cb7efdaecc238a156929861645c5cfd96977a8606fb7765e131304072d1c82c"

SRC_URI += "\
    file://0001-CATKIN_WORKSPACES-Don-t-require-.catkin-file.patch \
    file://0002-PKG_CONFIG_LIB_PATHS-use-cmake-root-path.patch \
    file://0001-use-python-provided-by-environment-instead-of-the-ge.patch \
    "

inherit catkin

FILES_${PN}-dev += "\
    ${ros_datadir}/eigen/cmake \
    ${ros_datadir}/ros/cmake \
    ${ros_datadir}/.catkin \
    ${ros_prefix}/.catkin \
    ${ros_prefix}/.rosinstall \
    ${ros_prefix}/_setup_util.py \
    ${ros_prefix}/env.sh \
    ${ros_prefix}/setup.* \
    "
