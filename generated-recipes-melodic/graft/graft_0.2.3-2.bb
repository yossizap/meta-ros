# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Graft is not yet finished. It's intended to be a full replacement to     robot_pose_ekf, including native absolute references, and arbitrary     topic configuration.      If you try to use Graft now, please note that not all parameters are     configured and you will not always see a change in behavior by     modifying the parameters."
AUTHOR = "Chad Rockey <chadrockey@gmail.com>"
ROS_AUTHOR = "Chad Rockey <chadrockey@willowgarage.com>"
HOMEPAGE = "http://ros.org/wiki/graft"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "graft"
ROS_BPN = "graft"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    geometry-msgs \
    libeigen \
    message-generation \
    nav-msgs \
    rosconsole \
    roscpp \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamic-reconfigure \
    geometry-msgs \
    message-runtime \
    nav-msgs \
    rosconsole \
    roscpp \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dynamic-reconfigure \
    geometry-msgs \
    message-runtime \
    nav-msgs \
    rosconsole \
    roscpp \
    sensor-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/graft-release/archive/release/melodic/graft/0.2.3-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "134b2807123daf67c4cdd2cb2a9f07b5"
SRC_URI[sha256sum] = "9a8974a928fe75527071337fedbe94266631129c0a1b9cb9d9163b06302bedce"
S = "${WORKDIR}/graft-release-release-melodic-graft-0.2.3-2"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('graft', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('graft', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/graft/graft_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/graft/graft-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/graft/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/graft/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}